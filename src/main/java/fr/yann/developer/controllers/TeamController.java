package fr.yann.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yann.developer.domain.Team;

@RestController

@RequestMapping("/teams")
public class TeamController {

    @PostMapping
    public void createTeam(@Valid @RequestBody Team team) {
	System.out.println(team);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteTeam(@PathVariable("name") String name) {
	System.out.println("L'équipe " + name + " a été supprimée");
    }

}
