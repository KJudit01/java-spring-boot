package com.project.javaspringbootanimalshelter.mapper;

import com.project.javaspringbootanimalshelter.dto.AnimalDto;
import com.project.javaspringbootanimalshelter.entity.Animal;

public class AnimalMapper {
    public static Animal mapToAnimal(AnimalDto animalDto) {
        Animal animal = new Animal(
                animalDto.getId(),
                animalDto.getAnimalType(),
                animalDto.getAnimalName(),
                animalDto.getAge()
        );
        return animal;
    }

    public static AnimalDto mapToAnimalDto(Animal animal) {
        AnimalDto animalDto = new AnimalDto(animal.getId(),
                animal.getAnimalType(),
                animal.getAnimalName(),
                animal.getAge()
        );
        return animalDto;
    }
}
