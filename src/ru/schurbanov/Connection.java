package ru.schurbanov;

/**
 * Created by schurbanov on 9/14/2016.
 */
public class Connection {
    private char cType = 'a';

    public Connection() {
    }

    public Connection(char newType) {
        cType = newType;
    }

    public char GetMyClass() {
        return cType;
    }

    public char GetMyClass(boolean upCase) {
        if (upCase) {
            return Character.toUpperCase(cType);
        } else {
            return cType;
        }
    }
}
