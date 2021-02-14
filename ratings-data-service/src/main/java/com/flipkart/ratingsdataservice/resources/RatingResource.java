/**
 * 
 */
package com.flipkart.ratingsdataservice.resources;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.ratingsdataservice.models.Rating;
import com.flipkart.ratingsdataservice.models.UserRating;

/**
 * @author rag.patel
 *
 */
@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@RequestMapping("/movies/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		
		return new Rating(movieId, 10);
	}
	
	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		
		UserRating userRating = new UserRating();
		userRating.setUserId(userId);
        userRating.setRatings(Arrays.asList(
                new Rating("The Shawshank Redemption", 3),
                new Rating("Angels and Demons", 4)
        ));
        
		return userRating;
	}

}
