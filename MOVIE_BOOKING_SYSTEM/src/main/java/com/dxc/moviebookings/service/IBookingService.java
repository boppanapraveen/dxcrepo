package com.dxc.moviebookings.service;

import java.util.List;

import com.dxc.moviebookings.pojo.MovieBookings;

public interface IBookingService {

	public MovieBookings addMovie(MovieBookings movie);
	public void  deleteMovie(int movieID);
	public List<MovieBookings> getAllMovies(); 
}
