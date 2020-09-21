package com.dxc.moviebookings.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplate {
@Autowired
RestTemplate restTemplate;

@RequestMapping(value="/template/movie")
public ResponseEntity<List> getAllMovies(){
	HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity <String> entity = new HttpEntity<String>(headers);
	
	
	
	return restTemplate.getForEntity("http://localhost:9191/mvie/allmovies",List.class);
	
}

private ResponseEntity<List> getForEntity(String string, Class<List> class1) {
	// TODO Auto-generated method stub
	return null;
}


}
