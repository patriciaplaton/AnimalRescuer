package org.animalrescuer.entities;

import java.awt.print.Pageable;

public class AdoptivePerson  {

    public String name;  // mandatory
    public double moneyAmount;  // mandatory
    public String favoriteHobby;
    public int age;  // mandatory
    public boolean hasBigHeart;  // mandatory
    public String homeType;

    public AdoptivePerson (String name, double moneyAmount, int age, boolean hasBigHeart) {
        this.name = name;
        this.moneyAmount = moneyAmount;
        this.age = age;
        this.hasBigHeart = hasBigHeart;
    }

}
