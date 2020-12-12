package com.example.movieapp.androidApp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.androidApp.R
import com.example.movieapp.androidApp.extension.load
import com.example.movieapp.movieApi.data.entity.Movie

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    private var mItems = mutableListOf<Movie>()

    fun setList(list: List<Movie>) {
        mItems.clear()
        mItems.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        )
    }

    override fun getItemCount() = mItems.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = mItems[position]

        holder.itemMovieImv.load(movie.fullPosterPath)
        holder.itemMovieTitleTxv.text = movie.title
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemMovieImv: ImageView = itemView.findViewById(R.id.itemMovieImv)
        val itemMovieTitleTxv: TextView = itemView.findViewById(R.id.itemMovieTitleTxv)
    }
}