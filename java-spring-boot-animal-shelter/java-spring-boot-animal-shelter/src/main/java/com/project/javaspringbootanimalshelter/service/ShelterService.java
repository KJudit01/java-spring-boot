package com.project.javaspringbootanimalshelter.service;

import com.project.javaspringbootanimalshelter.dto.AnimalDto;

import java.util.List;

public interface ShelterService {
    AnimalDto createAnimal(AnimalDto animalDto);


    void deleteId(Long id);

    List<AnimalDto> getAllAnimals();


    long countAllAnimals();


}
