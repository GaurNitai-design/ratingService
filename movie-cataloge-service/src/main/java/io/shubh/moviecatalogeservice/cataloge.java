package io.shubh.moviecatalogeservice;

import java.lang.reflect.Constructor;

public class cataloge {

	public String name;
	public int rating;
	
	
	public cataloge(String name, int rating, String description) {
		
		this.name = name;
	
		this.description = description;
		this.rating = rating;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	public String description;
	
	
}
