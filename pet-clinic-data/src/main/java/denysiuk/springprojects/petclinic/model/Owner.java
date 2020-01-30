package denysiuk.springprojects.petclinic.model;

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> Pets;

    public Set<Pet> getPets() {
        return Pets;
    }

    public void setPets(Set<Pet> pets) {
        Pets = pets;
    }
}
