package denysiuk.springprojects.petclinic.services;

import denysiuk.springprojects.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
