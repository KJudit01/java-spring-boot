package com.project.javaspringbootanimalshelter.controller;

import com.project.javaspringbootanimalshelter.dto.AnimalDto;
import com.project.javaspringbootanimalshelter.service.ShelterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shelter")
public class ShelterController {
    public ShelterService shelterService;

    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    @PostMapping
    public ResponseEntity<AnimalDto> addAnimal(@RequestBody AnimalDto animalDto) {
        return new ResponseEntity<>(shelterService.createAnimal(animalDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteId(@PathVariable Long id) {
        shelterService.deleteId(id);
        return ResponseEntity.ok("Everything has been deleted successfully!");
    }

    @GetMapping
    public ResponseEntity<List<AnimalDto>> getAllAnimals() {
        List<AnimalDto> animals = shelterService.getAllAnimals();
        return ResponseEntity.ok(animals);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getAnimalsCount() {
        long count = shelterService.countAllAnimals();
        return ResponseEntity.ok(count);
    }

}
