package org.animalrescuer.entities;

public class Game {

    public AdoptivePerson adoptivePerson;  // mandatory
    public Animal animal;  // mandatory
    public Veterinarian veterinarian;

    public Game (AdoptivePerson adoptivePerson, Animal animal) {
        this.adoptivePerson = adoptivePerson;
        this.animal = animal;
    }


}
