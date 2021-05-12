package fr.yann.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yann.developer.domain.ProjectCreate;
import fr.yann.developer.domain.ProjectDelete;
import fr.yann.developer.domain.ProjectPatch;

@RestController

@RequestMapping("/project")
public class ProjectController {

    @PostMapping
    public void createProject(@Valid @RequestBody ProjectCreate project) {
	System.out.println(project);
    }

    @PatchMapping("/{name}/update-project")
    public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectPatch partial) {
	System.out.println("Nouvelle description : " + partial.getDescription() + "\nNouveau budget : "
		+ partial.getAnnualBudget());
    }

    @DeleteMapping("{name}/delete-project")
    public void deleteProject(@PathVariable("name") String name, @Valid @RequestBody ProjectDelete partial) {
	System.out.println("La date " + partial.getEndDate() + " vient d'être supprimée");
    }
}
