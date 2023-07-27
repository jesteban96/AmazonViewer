package com.anncode.amazonviewer.Dao;

import com.anncode.amazonviewer.model.Movie;

import java.util.ArrayList;

public interface movieDao {
    default Movie setMovieViewed(Movie movie) {
        return movie;
    }

    default ArrayList<Movie> read() {
        ArrayList<Movie> movies = new ArrayList<>();
        return movies;
    }

    private boolean getMovieViewed(){
        return false;
    }
}
