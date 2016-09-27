package ru.schurbanov;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.regex.Pattern;

/**
 * Created by schurbanov on 9/21/2016.
 * 1.1 Review and understand how to select container for your needs:
 * http://i.stack.imgur.com/aSDsG.png
 * <p>
 * 2.1 Using Map<String,Integer> create program which calculates number of occurances of each word in text file.
 * Path to text file is provided as parameter.
 * 2.1.helper You may want to use Scanner class to read text file.
 * If you are stuck - take a look here: http://stackoverflow.com/questions/4574041/read-next-word-in-java
 * 2.2 Sort results in alphabetical order and print to console.
 * 2.3 Handle possible FileNotFoundException with try-catch.
 * 2.4 Throw custom NoCatsFoundInFileException custom exception if there are no word 'cat' or 'cats' in text file.
 * 2.5 (do if you have time) Use Logger object to write stack trace information for exceptions above.
 * Configure it so that it is written to log file instead of console.
 */
public class Task6 {

    public static void main(String[] args) {
        MyLogger l = new MyLogger();
        l.MyLoggerSetup("./"+Task6.class.getName());

        if (args.length == 0) {
            l.Log(Level.SEVERE, "Please define file name!");
            System.exit(1);
        }

        Path fName = Paths.get(args[0]);
        File fSrc = new File(fName.toString());
        if (!fSrc.exists()) {
            l.Log(Level.SEVERE, "File " + fName + " hasn't been found!");
            System.exit(2);
        }

        TreeMap tMap = new TreeMap<String, Integer>();
        String st;
        Integer cnt;

        Pattern pt = Pattern.compile("\\W");
        try {
            Scanner sc = new Scanner(fSrc).useDelimiter(pt);
            while (sc.hasNext()) {
                st = sc.next().toUpperCase();
                if (tMap.containsKey(st)) {
                    cnt = (Integer) tMap.get(st);
                    tMap.put(st, cnt + 1);
                } else {
                    tMap.put(st, 1);
                }
            }
            System.out.println(tMap);

        } catch (FileNotFoundException e) {
            l.Log(Level.SEVERE, e.toString());
        }

        HashSet<String> requiredWords = new HashSet<String>();
        requiredWords.add("cat"); // cat?
        requiredWords.add("dog"); // dog
        boolean res = false;

        for (String st1 : requiredWords) {
            if (res || tMap.containsKey(st1.toUpperCase())) {
                res = true;
            }
        }
        if (!res) {
            try {
                throw new MyException();
            } catch (MyException e) {
                l.Log(Level.WARNING, e.toString());
            }
        }

        Map sortedMap = sortByValue(tMap);
        System.out.println("------------------------------This sort doesn't save all values:");
        System.out.println(sortedMap);


        // Sort safe method needs a List, so let's first convert Set to List in Java
        List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(tMap.entrySet());

        System.out.println("------------------------------List: print as is:");
        System.out.println(listOfEntries);

        // sorting HashMap by values using comparator
        Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        Collections.sort(listOfEntries, valueComparator);

        System.out.println("------------------------------List: print ordered:");
        System.out.println(listOfEntries);
    }

    public static Map sortByValue(Map unsortedMap) {
        Map sortedMap = new TreeMap(new MyValueComparator(unsortedMap));
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }


}