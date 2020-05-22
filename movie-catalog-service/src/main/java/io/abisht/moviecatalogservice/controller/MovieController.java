package io.abisht.moviecatalogservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.abisht.moviecatalogservice.modul.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieController {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		return Collections.singletonList(
				new CatalogItem("KFC", "Test", 5)
				);
	}
	
}
