package denysiuk.springprojects.petclinic.repositories;

import denysiuk.springprojects.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
