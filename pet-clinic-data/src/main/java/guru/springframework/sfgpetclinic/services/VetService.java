package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);

    Vet findByID(Long id);

    Vet save(Vet owner);

    Set<Vet> findall();


}
