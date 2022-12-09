package io.zipcoder;

import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PetsCompareTest {

    @Test
    public void testComparable() {
        MainApplication ma = new MainApplication();
        String name = ma.getName();
        int pets = ma.getHowManyPets();
        String petName = ma.getPetName();
        Pets dog = ma.createPet("dog", "John");
        Pets cat = ma.createPet("cat", "Steve");
        Pets frog = ma.createPet("frog", "Froggy");
        Pets pet = ma.createPet("", "Petsy");

        Pets[] pa = new Pets[]{ dog, cat, frog, pet };
        Arrays.sort(pa);
        for (Pets p : pa) {
            System.out.println(p.getPetName());
        }

        Assert.assertEquals("Steve", pa[0].getPetName());
}
}
