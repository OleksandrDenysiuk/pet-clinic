package denysiuk.springprojects.petclinic.services;

import denysiuk.springprojects.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String name);

    List<Owner> findAllByLastNameLike(String lastName);
}
