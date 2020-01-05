package io.shubh.moviecatalogeservice;

public class ratings {
public String movieId;
public int rating;
public ratings(String movieId, int rating) {
	super();
	this.movieId = movieId;
	this.rating = rating;
}
public String getMovieId() {
	return movieId;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
