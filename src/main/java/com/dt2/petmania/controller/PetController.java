package com.dt2.petmania.controller;

import com.dt2.petmania.entity.Pet;
import com.dt2.petmania.repository.PetRepository;
import com.dt2.petmania.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> mostrarPet(){
        return petService.mostrarPet();
    }

    @PostMapping
    public void criarPet(@RequestBody Pet pet) {
        petService.cadastrarPet(pet);

    }
}
