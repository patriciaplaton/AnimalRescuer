package org.animalrescuer.entities;

import java.net.PortUnreachableException;

public class RecreationActivity {

   public String name;  // mandatory
   public String activityInside;
   public String activityOutside;
   public boolean camping;
   public String favoriteToy;  // mandatory

   public RecreationActivity (String name,String favoriteToy) {
      this.name = name;
      this.favoriteToy = favoriteToy;

   }
}





