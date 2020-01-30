package denysiuk.springprojects.petclinic.bootstrap;

import denysiuk.springprojects.petclinic.model.Owner;
import denysiuk.springprojects.petclinic.model.Pet;
import denysiuk.springprojects.petclinic.model.PetType;
import denysiuk.springprojects.petclinic.model.Vet;
import denysiuk.springprojects.petclinic.services.OwnerService;
import denysiuk.springprojects.petclinic.services.PetTypeService;
import denysiuk.springprojects.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType = petTypeService.save(dog);
        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Nadbystrzycka 42");
        owner1.setCity("Lublin");
        owner1.setTelephone("12345678");

        Pet michaelsPet = new Pet();
        michaelsPet.setPetType(savedDogPetType);
        michaelsPet.setOwner(owner1);
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setName("Rosco");

        owner1.getPets().add(michaelsPet);
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Plac Wolnośći");
        owner2.setCity("Lublin");
        owner2.setTelephone("87654321");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
