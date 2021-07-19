package org.animalrescuer;

import org.animalrescuer.entities.*;

import java.util.Date;

public class App {

    public static void main(String[] args) {
       // Race race = new Race();
        AdoptivePerson patriciaPlaton = new AdoptivePerson();
        patriciaPlaton.name = "patriciaPlaton";
        patriciaPlaton.moneyAmount = 10.6587;
        patriciaPlaton.favoriteHobby = "hiking";
        patriciaPlaton.age = 26;
        patriciaPlaton.hasBigHeart = true;
        patriciaPlaton.homeType = "house";

        Veterinarian denisaDuma = new Veterinarian();
        denisaDuma.name = "denisaDuma";
        denisaDuma.medicalSpecialty = "veterinarian";
        denisaDuma.age = 22;
        denisaDuma.gender = GenderType.FEMALE;
        denisaDuma.address = "Cluj-Napoca";
        denisaDuma.facultyCompleted = true;



        RecreationActivity run = new RecreationActivity();
        run.name = "run";
        run.activityInside = "puzzle";
        run.activityOutside = "swimming";
        run.favoriteToy = "Sheepy";
        run.camping = true;


        Animal dog = new Animal();
        dog.name = "Azorel";
        dog.age = 1;
        dog.favoriteFood = "granules";
        dog.happinessLevel = 10;
        dog.favoriteRecreationalActivity = "run";
        dog.hungerLevel = 0;
        dog.breed = "labradoodle";
        dog.sterilization = true;
        dog.color = "brown";
        dog.size = "medium";




        AnimalFood granules = new AnimalFood();
        granules.name = "Pedigree";
        granules.price = 10;
        granules.amount = 500;
        granules.date = new Date();
        granules.availabilityInStock = true;
        granules.vegeterian = false;
        granules.type = "beta";
        granules.flavor = "duck";

        Game animalRescuer = new Game();
        animalRescuer.adoptivePerson = patriciaPlaton;
        animalRescuer.animal = dog;
        animalRescuer.veterinarian = denisaDuma;
    }
}
