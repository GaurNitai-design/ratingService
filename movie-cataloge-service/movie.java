package io.shubh.movieinfoservice;

public class movie {

	private String movieId;
	
	private String name;

	

	public movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return movieId;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.movieId = rating;
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
}
