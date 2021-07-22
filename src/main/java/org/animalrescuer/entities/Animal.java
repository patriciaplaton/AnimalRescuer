package org.animalrescuer.entities;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Animal  {

    public String name;  // mandatory
    public int age;  // mandatory
    public int healthLevel;
    public int hungerLevel;
    public int happinessLevel;
    public String favoriteFood;
    public String favoriteRecreationalActivity;
    public String color;
    public String breed;
    public String size;  // mandatory
    public boolean sterilization;
    public List<MedicalIntervention> medicalInterventions = new ArrayList<>();


    public Animal (String name, int age, String size) {
        this.name =name;
        this.age = age;
        this.size = size;

    }


}
