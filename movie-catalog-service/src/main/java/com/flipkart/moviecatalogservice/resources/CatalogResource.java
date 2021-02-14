/**
 * 
 */
package com.flipkart.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flipkart.moviecatalogservice.models.CatalogItem;
import com.flipkart.moviecatalogservice.models.Movie;
import com.flipkart.moviecatalogservice.models.UserRating;



/**
 * @author rag.patel
 *
 */
@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		
		UserRating userRating = restTemplate.getForObject("http://localhost:9003/ratings/user/" + userId, UserRating.class);
		
		return userRating.getRatings().stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:9002/movies/" + rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
				})
				.collect(Collectors.toList());
	}

}
