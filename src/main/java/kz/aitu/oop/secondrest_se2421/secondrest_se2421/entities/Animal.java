package kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private int age;
    private String diet;
    private String healthStatus;

    public Animal() {}

    public Animal(String name, String species, int age, String diet, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.diet = diet;
        this.healthStatus = healthStatus;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getDiet() { return diet; }
    public void setDiet(String diet) { this.diet = diet; }
    public String getHealthStatus() { return healthStatus; }
    public void setHealthStatus(String healthStatus) { this.healthStatus = healthStatus; }
}