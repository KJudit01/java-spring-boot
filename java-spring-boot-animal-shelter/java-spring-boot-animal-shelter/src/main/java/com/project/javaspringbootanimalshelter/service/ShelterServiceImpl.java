package com.project.javaspringbootanimalshelter.service;

import com.project.javaspringbootanimalshelter.dto.AnimalDto;
import com.project.javaspringbootanimalshelter.entity.Animal;
import com.project.javaspringbootanimalshelter.mapper.AnimalMapper;
import com.project.javaspringbootanimalshelter.repository.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShelterServiceImpl implements ShelterService {

    private ShelterRepository shelterRepository;

    public ShelterServiceImpl(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    public AnimalDto createAnimal(AnimalDto animalDto) {
        Animal animal = AnimalMapper.mapToAnimal(animalDto);
        Animal savedAnimal = shelterRepository.save(animal);
        return AnimalMapper.mapToAnimalDto(savedAnimal);
    }

    @Override
    public void deleteId(Long id) {
        Animal animal = shelterRepository.findById(id).orElseThrow(() -> new RuntimeException("Deleted"));
        shelterRepository.deleteById(id);
    }

    @Override
    public List<AnimalDto> getAllAnimals() {
        List<Animal> animals = shelterRepository.findAll();
        return animals.stream().map((animal) -> AnimalMapper.mapToAnimalDto(animal)).collect(Collectors.toList());
    }

    @Override
    public long countAllAnimals() {
        return shelterRepository.count();
    }


}
