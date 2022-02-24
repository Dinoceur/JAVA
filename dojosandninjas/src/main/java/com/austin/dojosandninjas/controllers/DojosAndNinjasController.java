package com.austin.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import com.austin.dojosandninjas.models.Dojo;
import com.austin.dojosandninjas.models.Ninja;
import com.austin.dojosandninjas.services.DojoService;
import com.austin.dojosandninjas.services.NinjaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DojosAndNinjasController {

	@Autowired
	NinjaService ninjaService;

	@Autowired
	DojoService dojoService;

	@GetMapping("/ninjas")
	public String ninjaIndex(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}

	// CREATE NINJA
	@PostMapping("/ninjas/create")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Ninja> ninjas = ninjaService.allNinjas();
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			model.addAttribute("ninjas", ninjas);
			return "newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}

	// GET ONE
	@GetMapping("/ninjas/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Ninja ninja = ninjaService.findNinja(id);
		model.addAttribute("ninja", ninja);
		return "allNinjas.jsp";
	}

	// CREATE DOJO
	@RequestMapping("/")
	public String home(){
		return "redirect:/dojos";
	}

	@GetMapping("/dojos")
	public String dojoIndex(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}

	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas";
		}
	}
	
	// GET ONE
	@GetMapping("/dojos/{dojo_id}")
	public String showNinjasInDojo(Model model, @PathVariable Long dojo_id) {
		Dojo dojo = dojoService.findDojo(dojo_id);
		model.addAttribute("dojo", dojo);
		return "allNinjas.jsp";
	}
}
