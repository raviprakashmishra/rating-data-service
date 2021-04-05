package com.ravi.ratingdataservice.model;

public class Rating {
    private String movieId;
    private boolean watched;
    private int rating;
    private String review;

    public Rating() {
    }

    public Rating(String movieId, int rating, String review, boolean watched) {
        this.movieId = movieId;
        this.rating = rating;
        this.review = review;
        this.watched = watched;
    }

    public String getMovieId() {
        return movieId;
    }

    public Rating setMovieId(String movieId) {
        this.movieId = movieId;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public Rating setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public String getReview() {
        return review;
    }

    public Rating setReview(String review) {
        this.review = review;
        return this;
    }

    public boolean isWatched() {
        return watched;
    }

    public Rating setWatched(boolean watched) {
        this.watched = watched;
        return this;
    }
}
