package eu.school.demospring.controllers;

import eu.school.demospring.entities.Personne;
import eu.school.demospring.repositories.PersonneRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
@RequestMapping("/personne")
public class PersonneController {

	private final PersonneRepository personneRepository;

	public PersonneController(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	@GetMapping
	public ModelAndView index() {
		var personnes = personneRepository.findAll();
		return new ModelAndView( "views/personne/index", "personnes", personnes );
	}

	@PostMapping
	public ModelAndView save(Personne pers) {
		personneRepository.saveAndFlush(pers);
		return index();
	}

}
