package com.project.javaspringbootanimalshelter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDto {
    private Long id;
    private String animalType;
    private String animalName;
    private int age;
}
