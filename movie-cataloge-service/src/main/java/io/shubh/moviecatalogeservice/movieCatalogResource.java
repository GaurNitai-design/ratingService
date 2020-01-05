package io.shubh.moviecatalogeservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import io.shubh.moviecatalogeservice.cataloge;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class movieCatalogResource {
	
	@RequestMapping("/{catList}")	
	public List<cataloge> getCataloge(@PathVariable("catList") String movie){
		RestTemplate restTemp = new RestTemplate();
		
		//get all rated movie Id
		//foe each id call info service 
//		Collections.singletonList(
//				new cataloge("Peacock Dress", 5, "Dress Using Peacock Feather")
//				);
		   List<ratings> ratingsList = Arrays.asList(
	                new ratings("1234", 1234),
	                new ratings("5678", 5678)
	        );

	        return ratingsList.stream()
	                .map(
	                		rating -> {
//	                			new cataloge("Name", rating.getRating(), "Desc");
	                		movie Movie=	restTemp.getForObject("http://localhost:8094/movieInfo/"+rating.getRating(), movie.class);
	                		return new cataloge(Movie.getName(),rating.getRating(),"this is Desc");
	                		})
	                .collect(Collectors.toList());
				
				
					}

}
