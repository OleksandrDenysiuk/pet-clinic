package denysiuk.springprojects.petclinic.services;

import denysiuk.springprojects.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String name);
}
