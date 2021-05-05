package fr.yann.developer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yann.developer.domain.Skill;

@RestController
@RequestMapping("/skills")
public class SkillController {
	
	@GetMapping("/{id}")
	public Skill getById(@PathVariable("id") Long id) {
		Skill skill = new Skill();
		skill.setName("Spring boot");
		return skill;
	}
	
	@PostMapping
	public void create(@RequestBody Skill skill) {
		System.out.println(skill);
	}
}
