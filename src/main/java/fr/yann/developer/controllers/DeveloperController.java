package fr.yann.developer.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.yann.developer.domain.Developer;

public class DeveloperController {
	
	@GetMapping("/developers/{id}")
	public Developer getDevById(@PathVariable("id") Long id) throws ParseException {
		Developer developer = new Developer();
		developer.setPseudo("JackO_Neill");
		developer.setFirstName("Yann");
		developer.setLastName("Rouzaud");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		developer.setBirthday(simpleDateFormat.parse("31/08/1993"));
		return developer;
	}
	
	@PostMapping("/developers")
	public void createDeveloper(@RequestBody Developer developer) {
		System.out.println(developer);
	}

}
