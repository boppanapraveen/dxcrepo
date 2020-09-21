package com.dxc.moviebookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moviebookings.pojo.MovieBookings;
@Repository
public interface IBookingRepo extends JpaRepository<MovieBookings, Integer> {
	
	
	

}
