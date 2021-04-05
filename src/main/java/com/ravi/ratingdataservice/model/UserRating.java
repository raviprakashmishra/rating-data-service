package com.ravi.ratingdataservice.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user-ratings")
public class UserRating {
    @Id
    private long userId;
    private List<Rating> ratings;

    public UserRating() {
    }

    public UserRating(long userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }

    public long getUserId() {
        return userId;
    }

    public UserRating setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public UserRating setRatings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

}
