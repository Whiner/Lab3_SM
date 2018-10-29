package org.university.lab3;

import java.util.Random;

public class Randomizer {
    private static Random r = new Random();
    public static double getKcu(){
        double aDouble = r.nextDouble();
        System.out.println("Kcu = " + aDouble);
        return aDouble;
    }
}
