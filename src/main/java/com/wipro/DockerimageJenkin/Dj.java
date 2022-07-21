package com.wipro.DockerimageJenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dj {
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
