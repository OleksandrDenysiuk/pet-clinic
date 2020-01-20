package denysiuk.springprojects.petclinic.services;

import denysiuk.springprojects.petclinic.model.Pet;
import denysiuk.springprojects.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Pet pet);
    Set<Vet> findAll();
}
