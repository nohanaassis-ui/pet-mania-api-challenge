package com.dt2.petmania.service;

import com.dt2.petmania.entity.Pet;
import com.dt2.petmania.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> mostrarPet() {
        List<Pet> pets = new ArrayList<>();
        return pets = petRepository.findAll();
    }

    public Pet cadastrarPet(Pet pet) {
        Pet pet1 = new Pet();
        pet1.setNome(pet.getNome());
        pet1.setEspecie(pet.getEspecie());
        pet1.setRaca(pet.getRaca());
        pet1.setIdade(pet.getIdade());
        pet1.setSexo(pet.getSexo());
        pet1.setPorte(pet.getPorte());
        pet1.setPersonalidade(pet.getPersonalidade());
        pet1.setFoto(pet.getFoto());
        pet1.setDisponivel(pet.isDisponivel());
        return petRepository.save(pet1);
    }

}
