/**
 * 
 */
package com.flipkart.ratingsdataservice.models;

import java.util.List;

/**
 * @author rag.patel
 *
 */
public class UserRating {
	
	private String userId;
	private List<Rating> ratings;
	
	public UserRating() {
		
	}
	public UserRating(String userId, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.ratings = ratings;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	

}
