package org.animalrescuer;

import org.animalrescuer.entities.*;

import java.util.Date;

public class App {

    public static void main(String[] args) {
       // Race race = new Race();
        AdoptivePerson patriciaPlaton = new AdoptivePerson("patriciaPlaton", 10.6587, 26,true);
        patriciaPlaton.name = "patriciaPlaton";
        patriciaPlaton.moneyAmount = 10.6587;
        patriciaPlaton.favoriteHobby = "hiking";
        patriciaPlaton.age = 26;
        patriciaPlaton.hasBigHeart = true;
        patriciaPlaton.homeType = "house";

        String vasile = "suparata";
        int age = 3;

        AdoptivePerson georgePlaton = new AdoptivePerson(vasile,1.2, age,false);

        Animal azorel = new Animal("azorel",2,"medium");
        Animal fuwa = new Animal("fuwa",1,"small");

        Game hide = new Game (patriciaPlaton, azorel);
        Game run = new Game(georgePlaton, fuwa);

        MedicalIntervention vaccination = new MedicalIntervention("intervention","vaccination");
        RecreationActivity running = new RecreationActivity("running", "sheepy");
        Veterinarian denisaDuma = new Veterinarian("denisaDuma",22);
        AnimalFood granules = new AnimalFood("granules", 23.89,true);



        Veterinarian deni = new Veterinarian("deni",22);
        deni.name = "deni";
        deni.medicalSpecialty = "veterinarian";
        deni.age = 22;
        deni.gender = GenderType.FEMALE;
        deni.address = "Cluj-Napoca";
        deni.facultyCompleted = true;



        RecreationActivity jogging = new RecreationActivity("run","sheepy");
        jogging.name = "run";
        jogging.activityInside = "puzzle";
        jogging.activityOutside = "swimming";
        jogging.favoriteToy = "Sheepy";
        jogging.camping = true;


        Animal dog = new Animal("azorel",1,"medium");
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
        dog.medicalInterventions.add(new MedicalIntervention("routineControl", "vaccination", true, new Date()));


        AnimalFood pizza = new AnimalFood("pizza", 23.3232, true);
        pizza.name = "Pedigree";
        pizza.price = 10;
        pizza.amount = 500;
        pizza.date = new Date();
        pizza.availabilityInStock = true;
        pizza.vegeterian = false;
        pizza.type = "beta";
        pizza.flavor = "duck";

        Game animalRescuer = new Game(hide.adoptivePerson, hide.animal);
        animalRescuer.adoptivePerson = patriciaPlaton;
        animalRescuer.animal = dog;
        animalRescuer.veterinarian = denisaDuma;

    }
}
