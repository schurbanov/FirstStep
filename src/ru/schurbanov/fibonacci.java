package ru.schurbanov;

import java.math.BigInteger;

/**
 * Created by schurbanov on 9/11/2016.
 */

public class fibonacci {
    public int seed;
    public int cols;
    private String fiboLine="1;\t";

    //constructor
    fibonacci(int seed, int cols) {
        this.seed = seed;
        this.cols = cols;
    }

    public void Go() {
        BigInteger term1 = BigInteger.ZERO;
        BigInteger term2 = BigInteger.ONE;
        BigInteger nextfibo = BigInteger.ONE;

        System.out.println("First "+seed+" fibonacci elements are:");
        for (int j = 1; j < seed; j++) {
            nextfibo = term1.add(term2);
            term2 = nextfibo;
            term1 = term2;
            fiboLine = fiboLine + nextfibo.toString() + ";\t";
            if ((j + 1) % cols == 0) {
                    System.out.println(fiboLine);
                    fiboLine = "";
            }
        }
        System.out.println(fiboLine);
    }
}
