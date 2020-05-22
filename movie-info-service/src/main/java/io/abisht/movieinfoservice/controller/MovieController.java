package io.abisht.movieinfoservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.abisht.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {

	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId){
		
		return new Movie("KFG", movieId);
	}
}
