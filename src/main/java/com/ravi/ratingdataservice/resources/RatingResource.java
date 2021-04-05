package com.ravi.ratingdataservice.resources;

import com.ravi.ratingdataservice.model.Rating;
import com.ravi.ratingdataservice.model.UserRating;
import com.ravi.ratingdataservice.repository.UserRatingRepository;
import com.ravi.ratingdataservice.services.UserRatingService;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

  /*  @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }*/

    @Autowired
    UserRatingService userRatingService;

    @Autowired
    UserRatingRepository userRatingRepository;

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") long userId) {
        Optional<UserRating> userRating = userRatingRepository.findById(userId);
        if (userRating.isPresent()) {
            return userRating.get();
        }
        return new UserRating();
    }
}
