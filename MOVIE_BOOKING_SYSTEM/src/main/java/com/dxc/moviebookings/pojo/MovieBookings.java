package com.dxc.moviebookings.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class MovieBookings {
	//movie_id,movie_name,movie_rating,movie_duration,movie_category,movie_recommend
	@Id
	private  int movieID;
	private String movieName;
	private double movieRating;
	private double movieDuration;
	private String movieCategory;
	private String movieRecommend;
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}
	public double getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(double movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public String getMovieRecommend() {
		return movieRecommend;
	}
	public void setMovieRecommend(String movieRecommend) {
		this.movieRecommend = movieRecommend;
	}
	@Override
	public String toString() {
		return "Pojo [movieID=" + movieID + ", movieName=" + movieName + ", movieRating=" + movieRating
				+ ", movieDuration=" + movieDuration + ", movieCategory=" + movieCategory + ", movieRecommend="
				+ movieRecommend + "]";
	}
	
	
	
}
