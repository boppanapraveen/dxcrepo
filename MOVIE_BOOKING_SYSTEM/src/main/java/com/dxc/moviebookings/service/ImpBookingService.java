package com.dxc.moviebookings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moviebookings.pojo.MovieBookings;
import com.dxc.moviebookings.repository.IBookingRepo;
@Service
public class ImpBookingService implements IBookingService{

	@Autowired
	IBookingRepo repo;
	
	
	
	
	
	
	@Override
	public MovieBookings addMovie(MovieBookings movie) {
		
		return repo.save(movie);
	}

	@Override
	public void deleteMovie(int movieID) {
		
		
		repo.deleteById(movieID);
		
		
	}

	@Override
	public List<MovieBookings> getAllMovies() {
		
		return repo.findAll();
	}

}
