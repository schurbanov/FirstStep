package ru.schurbanov;
/**
 * Created by schurbanov on 9/13/2016.

 Task 2.
 1.1 Create class Connection with one field, custom constructor and one method. Create also overloaded method.
 Names and logic doesn't matter here - just make is so that you are able to initialize new Connection object.
 1.2 Create class ConnectionManager which should have static array of Connection objects which are initialized in custom constructor.
 Custom constructor should have a parameter which defines number of array elements.
 1.3 Create static method GetConnection in ConnectionManager which returns link to one (and new each time) of Connection objects from the array above
 until there are no unused objects. When there are no available Connection objects anymore it should return null.
 1.4 Instantiate ConnectionManager correctly and demonstrate how it returns objects (and null) in main method.
 Is it possible to change you program so that you don't need to create new object with ConnectionManager type? How?
 You need to set access modificators (public/private) correctly so that in main method you can't break anything even if you want :)
 */
public class task2 {
    public static void main(String[] args) {
        Connection c1 = new Connection('b');
        System.out.println(c1.GetMyClass(true));
        System.out.println(c1.GetMyClass());

        ConnectionManager cm1 = new ConnectionManager(3);
        Connection c2 = ConnectionManager.GetConnection();
        while (c2 != null) {
            System.out.println("Connection: "+ConnectionManager.ConnectionsUsed);
            c2 = ConnectionManager.GetConnection();
        }
    }
}
