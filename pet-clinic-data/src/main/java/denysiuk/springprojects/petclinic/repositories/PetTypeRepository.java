package denysiuk.springprojects.petclinic.repositories;

import denysiuk.springprojects.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
