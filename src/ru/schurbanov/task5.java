package ru.schurbanov;

/**
 * Created by schurbanov on 9/15/2016.
 * Task 5.
 * 2.1 Create interface U with three methods.
 * 2.2 Create class A with method which returns U by creating anonymous inner class.
 * 2.3 Create class B which has array of U. It also has SaveU method which takes and save link U in the array.
 * ResetU method reset link in the array on position specified by argument.
 * InvokeAll method goes through the array and invokes all U's methods.
 * 2.4 In main create several A objects and one B object. Populate B object with U links what were created by A objects.
 * Delete few U links from B. Call InvokeAll.
 */
public class task5 {
    public static void main(String[] args) {

        TripleDoPack Pck1 = new TripleDoPack();
        Do123Interface O1 = Pck1.Do123Object();
        O1.DoOne();

        TripleDoPack Pck2 = new TripleDoPack();
        Do123Interface O2 = Pck2.Do123Object();
        O2.DoOne();

        TripleDoPack Pck3 = new TripleDoPack();
        Do123Interface O3 = Pck3.Do123Object();
        O3.DoOne();

        System.out.println(".........");

        ArrayOfDoInterfaces ADI = new ArrayOfDoInterfaces();
        ADI.SaveDoInterface(O1);
        ADI.SaveDoInterface(O2);
        ADI.SaveDoInterface(O3);
        ADI.DeleteInterface(0);

        ADI.InvokeAll();
    }
}
