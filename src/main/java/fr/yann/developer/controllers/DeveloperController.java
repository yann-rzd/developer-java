package fr.yann.developer.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.yann.developer.domain.Developer;

@RequestMapping("/developers")
public class DeveloperController {
	
	@GetMapping("/{pseudo}")
	public Developer getDevById(@PathVariable("pseudo") Long pseudo) {
		Developer developer = new Developer();
		developer.setPseudo("JackO_Neill");
		developer.setFirstName("Yann");
		developer.setLastName("Rouzaud");
		LocalDate date = LocalDate.of(1993, 8, 31);
		developer.setBirthDate(date);
		return developer;
	}
	
	@PostMapping("/developers")
	public void createDeveloper(@RequestBody Developer developer) {
		System.out.println(developer);
	}
	
	
}
