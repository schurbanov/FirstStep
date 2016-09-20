package ru.schurbanov;

/**
 * Created by schurbanov on 9/14/2016.
 */

public class BaseClass {

    public void SayOne (){
        System.out.println("- One!");
        this.SayTwo();
    }

    public void SayTwo (){
        System.out.println("- Two!");
    }
}
