package com.example.movieapp.androidApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.badoo.reaktive.observable.observeOn
import com.badoo.reaktive.scheduler.mainScheduler
import com.example.movieapp.androidApp.R
import com.example.movieapp.androidApp.adapter.MoviesAdapter
import com.example.movieapp.androidApp.mapper.MoviesUIMapper
import com.example.movieapp.movieApi.data.entity.Movie
import com.example.movieapp.movieApi.presentation.base.ListViewModel
import com.example.movieapp.movieApi.presentation.base.ViewModelBinding
import com.example.movieapp.movieApi.presentation.movies.MoviesListViewModel

private const val KEYWORD = "avengers"

class MainActivity : AppCompatActivity() {
    private lateinit var mMoviesAdapter: MoviesAdapter
    private var mIsRefreshing = false
    private val mBinding = ViewModelBinding()
    private val mViewModel: ListViewModel<String, Movie> by lazy {
        val moviesUiMapper = MoviesUIMapper()
        MoviesListViewModel(moviesUiMapper)
    }
    var mainSwipeRefresh: SwipeRefreshLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }
    private fun setupUI() {
        mMoviesAdapter = MoviesAdapter()
        val mainList: RecyclerView = findViewById(R.id.mainList)
        mainSwipeRefresh = findViewById(R.id.mainSwipeRefresh)
        mainList.layoutManager = GridLayoutManager(this, 2)
        mainList.adapter = mMoviesAdapter

        mainList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val manager = mainList.layoutManager as LinearLayoutManager

                val totalItemCount = manager.itemCount
                val lastVisibleItem = manager.findLastVisibleItemPosition()

                if (!mIsRefreshing && totalItemCount <= lastVisibleItem + 2) {
                    loadMore()
                }
            }
        })

        mainSwipeRefresh?.setOnRefreshListener {
            mViewModel.inputs.get(KEYWORD)
        }

        mViewModel.inputs.get(KEYWORD)
    }

    override fun onDestroy() {
        mBinding.dispose()
        super.onDestroy()
    }

    private fun binding() {
        mBinding.subscribe(mViewModel.outputs.loading.observeOn(mainScheduler), onNext = ::loading)
        mBinding.subscribe(mViewModel.outputs.result.observeOn(mainScheduler), onNext = ::result)
    }

    private fun loading(isLoading: Boolean) {
        mIsRefreshing = isLoading

        mainSwipeRefresh?.isRefreshing = isLoading
    }

    private fun result(movies: List<Movie>) {
        mMoviesAdapter.setList(movies)
    }

    private fun loadMore() = mViewModel.inputs.loadMore(KEYWORD)
}
