package com.his.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api("To do")
public class UserResource {

	public class UserResource() {
System.out.println("**UserResource.UserResource()");
	}
	

	public User getUser() {
		
		User user=new User();
		user.setUserId(101);
		user.setUserName("ANR");
		user.setEmailId("Anr");
		return user;
	}
}
