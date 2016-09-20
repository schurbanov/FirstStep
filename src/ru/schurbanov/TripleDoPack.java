package ru.schurbanov;

/**
 * Created by schurbanov on 9/19/2016.
 */
public class TripleDoPack {
    public Do123Interface Do123Object() {
        //anonymous class definition
        return new Do123Interface() {
            public void DoOne() {
                System.out.println(1);
            }

            public void DoTwo() {
                System.out.println(2);
            }

            public void DoThree() {
                System.out.println(3);
            }
        };
    }
}
