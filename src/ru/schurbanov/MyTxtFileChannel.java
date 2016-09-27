package ru.schurbanov;

import com.sun.java_cup.internal.runtime.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by schurbanov on 9/22/2016.
 */
public class MyTxtFileChannel {
    public FileReader fr;
    public BufferedReader br;

    //public FileChannel fc;
    //public ByteBuffer cb;

    MyTxtFileChannel(Path FName) {
        try {
            fr = new FileReader(FName.toString());
            br = new BufferedReader(fr);

        } catch (IOException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    public void ReadTillTheEnd() {
        String theLine;
        try {
            while ((theLine = br.readLine()) != null) {
                System.out.println(theLine);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(0);
        }
    }
}