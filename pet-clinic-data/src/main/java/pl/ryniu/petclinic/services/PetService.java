package pl.ryniu.petclinic.services;

import java.util.Set;

import pl.ryniu.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet owner);
	
	Set<Pet> findAll();
}
