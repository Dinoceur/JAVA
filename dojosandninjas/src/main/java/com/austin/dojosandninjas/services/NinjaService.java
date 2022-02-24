package com.austin.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import com.austin.dojosandninjas.models.Ninja;
import com.austin.dojosandninjas.repo.NinjaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

	@Autowired
	NinjaRepository ninjaRepository;

	// CREATE
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
		
	// GET ALL
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

	// GET ONE
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
	// Update
	public Ninja updateNinja(Ninja ninja, Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return ninjaRepository.save(ninja);
		} else {
			return null;
		}
	}
	// Delete
	public void deleteNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			ninjaRepository.deleteById(id);			
		}
	}
}
