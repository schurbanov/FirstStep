package ru.schurbanov;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by schurbanov on 9/18/2016.
 */
public class ScannerFeed implements Readable {
    public static String PetNames = "Bailey Bella Max Lucy Charlie Molly Buddy Daisy Rocky Maggie ";
    public static String PetSpareParts = "front-left-leg front-right-leg hind-right-leg hind-left-leg";

    @Override
    public int read(CharBuffer cb) throws IOException {
        cb.append(PetNames);
        cb.append(PetSpareParts);
        return -1;
    }
}
