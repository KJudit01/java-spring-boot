package com.project.javaspringbootanimalshelter.repository;

import com.project.javaspringbootanimalshelter.dto.AnimalDto;
import com.project.javaspringbootanimalshelter.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShelterRepository extends JpaRepository<Animal, Long> {


}
