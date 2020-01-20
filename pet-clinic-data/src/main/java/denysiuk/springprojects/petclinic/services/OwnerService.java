package denysiuk.springprojects.petclinic.services;

import denysiuk.springprojects.petclinic.model.Owner;
import denysiuk.springprojects.petclinic.model.Pet;

import java.util.Set;

public interface OwnerService{
    Owner findByLastName();
    Owner findById(Long id);
    Owner save(Pet pet);
    Set<Owner> findAll();
}
