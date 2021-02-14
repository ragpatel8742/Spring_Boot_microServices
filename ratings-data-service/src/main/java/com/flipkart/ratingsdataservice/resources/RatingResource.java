/**
 * 
 */
package com.flipkart.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.ratingsdataservice.models.Rating;

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

}
