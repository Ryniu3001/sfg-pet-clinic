package pl.ryniu.petclinic.services;

import java.util.Set;

import pl.ryniu.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet owner);
	
	Set<Vet> findAll();
}
