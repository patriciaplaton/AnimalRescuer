package org.animalrescuer.entities;

import java.time.LocalDate;
import java.util.Date;

public class MedicalIntervention {
    public String name;  // mandatory
    public String type;  // mandatory
    public boolean surgery;
    public Date date;

    public MedicalIntervention(String name, String type, boolean surgery, Date date) {
        this.name = name;
        this.type = type;
        this.surgery = surgery;
        this.date = date;
    }
}
