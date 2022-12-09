package io.zipcoder.pets;

import java.util.Comparator;

public class Pets implements Comparable<Pets> {
    String petName;
    String petSound;

    public Pets() {
        this.petName = "";
        this.petSound = "";
    }

    public Pets(String name, String sound) {
        this.petName = name;
        this.petSound = sound;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String name) {
        this.petName = name;
    }

    public String getPetSound() {
        return petSound;
    }

    public void setPetSound(String petSound) {
        this.petSound = petSound;
    }

    public String speak() {
        return petSound;
    }

    //sort by name then class
//    @Override
//    public int compareTo(Pets o) {
//        if (this.petName.compareTo(o.petName) == 0) {
//            return String.valueOf(this.getClass()).compareTo(String.valueOf(o.getClass()));
//        }
//        return this.petName.compareTo(o.petName);
//    }


    //sort by class then name
    @Override
    public int compareTo(Pets o) {
        if (String.valueOf(this.getClass()).compareTo(String.valueOf(o.getClass())) == 0) {
            return this.petName.compareTo(o.petName);
        }
        return String.valueOf(this.getClass()).compareTo(String.valueOf(o.getClass()));
    }
}
