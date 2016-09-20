package ru.schurbanov;

/**
 * Created by schurbanov on 9/14/2016.

 Task 3.
 2.1 Create base (base meaning we will be extending it further, nothing more) class with two methods
 (they just write different things to console).
 2.2 Invoke second method in first method.
 2.3 Create derived class from base class and redefine second method.
 2.4 Create object of derived class and make upcasting to base class. Invoke first method - which methods are executed and from which classes?

 */
public class task3 {
    public static void main(String[] args) {
        BaseClass bcOld = new BaseClass ();
        bcOld.SayOne();
        System.out.println("=======================");

        BaseClassAdv bcNew = new BaseClassAdv ();
        bcNew.SayOne();
        System.out.println("=======================");

        //upcasting
        BaseClass bcOld2 = (BaseClass) bcNew;
        bcOld2.SayOne();
        System.out.println("=======================");

        //downcasting
        try {
            BaseClassAdv bcNew2 = (BaseClassAdv) bcOld;
            bcNew2.SayOne();
        } catch (ClassCastException e) {
            System.out.println("downcasting error: "+e);
        }



        /*
        //upcasting - Piano=>Instrument, this is also happens above
        Instrument ins = i1;

        Instrument instr2 = new Piano();//and here too
        Piano p1 = (Piano) instr2;//downcasting must be explicit. Throws exception if instr2 is not really Piano.
*/

    }
}