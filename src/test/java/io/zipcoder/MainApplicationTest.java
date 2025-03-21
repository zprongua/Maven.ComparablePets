package io.zipcoder;

import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {

    @Test
    public void testMe(){
        MainApplication ma = new MainApplication();
        String name = ma.getName();
        int pets = ma.getHowManyPets();
        String petName = ma.getPetName();
        Pets dog = ma.createPet("dog", "John");
        Pets cat = ma.createPet("cat", "Steve");
        Pets frog = ma.createPet("frog", "Froggy");
        Pets pet = ma.createPet("", "Petsy");

        Assert.assertEquals("", name);
        Assert.assertEquals(1, pets);
        Assert.assertEquals(petName, pet.getPetName());
        Assert.assertEquals("", ma.getSpecies());
}
}
