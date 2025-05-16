package kr.co.himedia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value="/")
	public String main() {	
		return "{\"msg\":\"Ok\"}";
	}
	
}
