package com.ravi.ratingdataservice.services;

import com.ravi.ratingdataservice.model.UserRating;
import com.ravi.ratingdataservice.repository.UserRatingRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class UserRatingService {
    @Autowired
    UserRatingRepository userRatingRepository;
    public UserRating getRatings(long userId) {
        Optional<UserRating> userRating = userRatingRepository.findById(userId);
        if (userRating.isPresent()) {
            return userRating.get();
        }
        return new UserRating();
    }
}
