package com.foodapp.springfoodapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MapController {
	
	@GetMapping("/showMap")
	public String index() {
		return "index.html";
	}
}
