package com.ravi.ratingdataservice.repository;

import com.ravi.ratingdataservice.model.UserRating;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserRatingRepository extends MongoRepository<UserRating, Long> {
}
