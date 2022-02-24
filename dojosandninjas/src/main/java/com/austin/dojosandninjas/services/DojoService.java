package com.austin.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import com.austin.dojosandninjas.models.Dojo;
import com.austin.dojosandninjas.repo.DojoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DojoService {

	@Autowired
	DojoRepository dojoRepository;

	// CREATE
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
		
	// GET ALL
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}

	// GET ONE
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	// UPDATE
	public Dojo updateDojo(Dojo dojo, Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return dojoRepository.save(dojo);
		} else {
			return null;
		}
	}
	// DELETE
	public void deleteDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			dojoRepository.deleteById(id);			
		}
	}
}
