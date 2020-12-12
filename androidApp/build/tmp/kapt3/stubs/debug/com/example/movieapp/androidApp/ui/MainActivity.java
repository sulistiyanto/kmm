package com.example.movieapp.androidApp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\u0016\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/example/movieapp/androidApp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBinding", "Lcom/example/movieapp/movieApi/presentation/base/ViewModelBinding;", "mIsRefreshing", "", "mMoviesAdapter", "Lcom/example/movieapp/androidApp/adapter/MoviesAdapter;", "mViewModel", "Lcom/example/movieapp/movieApi/presentation/base/ListViewModel;", "", "Lcom/example/movieapp/movieApi/data/entity/Movie;", "getMViewModel", "()Lcom/example/movieapp/movieApi/presentation/base/ListViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "mainSwipeRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getMainSwipeRefresh", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setMainSwipeRefresh", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "binding", "", "loadMore", "loading", "isLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "result", "movies", "", "setupUI", "androidApp_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.movieapp.androidApp.adapter.MoviesAdapter mMoviesAdapter;
    private boolean mIsRefreshing = false;
    private final com.example.movieapp.movieApi.presentation.base.ViewModelBinding mBinding = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mainSwipeRefresh;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.movieapp.movieApi.presentation.base.ListViewModel<java.lang.String, com.example.movieapp.movieApi.data.entity.Movie> getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getMainSwipeRefresh() {
        return null;
    }
    
    public final void setMainSwipeRefresh(@org.jetbrains.annotations.Nullable()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void binding() {
    }
    
    private final void loading(boolean isLoading) {
    }
    
    private final void result(java.util.List<com.example.movieapp.movieApi.data.entity.Movie> movies) {
    }
    
    private final void loadMore() {
    }
    
    public MainActivity() {
        super();
    }
}