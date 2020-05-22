package io.abisht.ratingservice.ratingcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.abisht.ratingservice.modul.Rate;

@RestController
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public Rate getRate(@PathVariable("movieId") String movieId) {
		
		return new Rate(movieId,5);
	}

}
