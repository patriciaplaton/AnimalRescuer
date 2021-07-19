package org.animalrescuer;

import org.animalrescuer.entities.*;

import java.time.LocalDate;
import java.util.Date;

public class App {

    public static void main(String[] args) {
       // Race race = new Race();
        AdoptivePerson patriciaPlaton = new AdoptivePerson();
        patriciaPlaton.name = "patriciaPlaton";
        patriciaPlaton.moneyAmount = 10.6587;

        Veterinarian denisaDuma = new Veterinarian();
        denisaDuma.name = "denisaDuma";
        denisaDuma.medicalSpecialty = "veterinarian";

        RecreationActivity run = new RecreationActivity();
        run.name = "run";

        Animal dog = new Animal();
        dog.name = "Azorel";
        dog.age = 1;
        dog.favoriteFood = "granules";
        dog.happinessLevel = 10;
        dog.favoriteRecreationalActivity = "run";
        dog.hungerLevel = 0;



        AnimalFood granules = new AnimalFood();
        granules.name = "Pedigree";
        granules.price = 10;
        granules.amount = 500;
        granules.date = new Date();
        granules.availabilityInStock = true;

        Game animalRescuer = new Game();
        animalRescuer.adoptivePerson = patriciaPlaton;
        animalRescuer.animal = dog;
        animalRescuer.veterinarian = denisaDuma;





    }
}
