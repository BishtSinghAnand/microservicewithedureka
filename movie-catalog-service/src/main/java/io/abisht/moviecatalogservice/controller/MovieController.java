package io.abisht.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.abisht.moviecatalogservice.models.CatalogItem;
import io.abisht.moviecatalogservice.models.Movie;
import io.abisht.moviecatalogservice.models.Rate;

@RestController
@RequestMapping("/catalog")
public class MovieController {

	RestTemplate resttemp=new RestTemplate();
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		List<Rate> rating=Arrays.asList(
				new Rate("1231",5),
				new Rate("1231",5)
				);
		
		return rating.stream().map(rate->{	
			Movie movie=resttemp.getForObject("http://localhost:8081/movie/"+rate.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Test",rate.getRating());
			
		}).collect(Collectors.toList());
		}
	
}
