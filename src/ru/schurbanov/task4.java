package ru.schurbanov;

import java.util.Scanner;

/**
 * Created by schurbanov on 9/15/2016.
 *
 * Task 4.
 * 1.1 Take a look on java.util.Scanner class. Make sure you read examples of it's use and what method next() does.
 * 1.2 Scanner's constructor uses objects that implements Readable interface.
 * Please read very short documentation for this Interface and it's only method 'read'.
 * 1.3 Make your own class (or just take Dog) so that we can pass it as argument.
 * 1.4 When calling method 'next' for Scanner object created using constructor with Dog argument it should return Dog's legs like these:
 * "front-left", "front-right", "hind-right", "hind-left" (order doesn't matter).
 */

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new ScannerFeed());
        while (sc.hasNext()) System.out.println(sc.next());
    }
}