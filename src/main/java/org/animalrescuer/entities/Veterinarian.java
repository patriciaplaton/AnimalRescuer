package org.animalrescuer.entities;

public class Veterinarian {

    public String name;  // mandatory
    public String medicalSpecialty;
    public int age;  // mandatory
    public String address;
    public boolean facultyCompleted;
    public GenderType gender;

    public Veterinarian (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
