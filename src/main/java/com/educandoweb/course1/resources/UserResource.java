package com.educandoweb.course1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> FinfAll(){
		User u = new User(1l, "ravanelly", "ravanelly@gmail.com", "999999", "12345678");
		return ResponseEntity.ok().body(u);
	}

}
