package denysiuk.springprojects.petclinic.repositories;

import denysiuk.springprojects.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository  extends CrudRepository<Vet, Long> {
}
