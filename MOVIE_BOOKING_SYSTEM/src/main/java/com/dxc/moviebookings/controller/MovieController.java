package com.dxc.moviebookings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moviebookings.pojo.MovieBookings;
import com.dxc.moviebookings.service.IBookingService;

/*import io.swagger.annotations.Api;*/
import io.swagger.annotations.ApiOperation;

/*@ApiOperation(value="/mvie",tags="Movie Controller with Rest")*/
@Controller
@RestController
@RequestMapping(path="/mvie")
public class MovieController {
	
	@Autowired
	IBookingService service;
	
	@Autowired
	MovieBookings movie;

	
	@ApiOperation(value="Add Movie Details",produces="json data" , response=MovieBookings.class)
	@PostMapping(path="/add")
	public  MovieBookings add(@RequestBody MovieBookings movie) {
		
		return service.addMovie(movie);
		
	}
	
	@ApiOperation(value="All Movies",produces="json data",response = MovieBookings.class)
	@GetMapping(path="/allmovies")
	public List<MovieBookings>  getAllMovies(){
		return service.getAllMovies();
		
	}
	@ApiOperation(value="Delete Movie")
	@DeleteMapping(path="/delete/{movieId}")
	public String deleteMovie(@PathVariable("movieId") int movieID) {
		service.deleteMovie(movieID);
		return "Movie deleted with movie ID"+movieID;
	}
	
}
