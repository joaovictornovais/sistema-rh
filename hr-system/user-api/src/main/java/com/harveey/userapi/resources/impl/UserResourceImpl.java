package com.harveey.userapi.resources.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harveey.userapi.domain.User;
import com.harveey.userapi.resources.UserResource;
import com.harveey.userapi.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserResourceImpl implements UserResource {

	private final UserService userService;
	
	@Override
	public ResponseEntity<User> findById(Long id) {
		return ResponseEntity.ok().body(userService.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(userService.findAll());
	}

}
