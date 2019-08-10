package com.jonatan.routing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {
	
	@GetMapping("/{location}")
	public String information(@PathVariable("location") String location) {
		String result = "";
		if (location.equals("dojo")) {
			result = "The dojo is awesome!";
		} else if (location.equals("burbank-dojo")) {
			result = "Burbank Dojo is located in Southern California";
		} else if (location.equals("san-jose")) {
			result = "SJ dojo is the headquarters";
		}
		return result;
	}

}
