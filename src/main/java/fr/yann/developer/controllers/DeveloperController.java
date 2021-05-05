package fr.yann.developer.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yann.developer.domain.Developer;

@RestController

@RequestMapping("/developers")
public class DeveloperController {
	
	@GetMapping("/{pseudo}")
	public Developer getDevByPseudo(@PathVariable("pseudo") String pseudo) {
		Developer developer = new Developer();
		developer.setPseudo("JackO_Neill");
		developer.setFirstName("Yann");
		developer.setLastName("Rouzaud");
		LocalDate date = LocalDate.of(1993, 8, 31);
		developer.setBirthDate(date);
		return developer;
	}
	
	@PostMapping
	public void createDeveloper(@RequestBody Developer developer) {
		System.out.println(developer);
	}
	
	@PatchMapping("/{pseudo}/birth-date")
	public void updateBirthDate(@PathVariable("pseudo") String pseudo, @RequestBody Developer partial) {
		System.out.println("Partial object = " + partial);
		Developer developer = new Developer();
		developer.setPseudo(pseudo);
		developer.setFirstName("Yann");
		developer.setFirstName("Rouzaud");
		developer.setBirthDate(partial.getBirthDate());
		System.out.println("New object = " + developer);
	}
}
