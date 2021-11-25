package com.his.resources;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeResource {
	
	@GetMapping("/greet")
	public String GreetUser(@RequestParam("name") String name) {
		return name+", Good Morning..!";
		
	}
	@GetMapping("/wish/{name}")
	public String wishUser(@PathParam("name") String name) {
		return name+", Welcome";
	}

}
