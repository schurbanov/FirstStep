package ru.schurbanov;

/**
 * Created by schurbanov on 9/11/2016.
 */

public class startIt {
    public static void main(String[] args) {
        int seed = 0;
        int k = 1;

        if (args.length == 0) {
            System.err.println("Please define integer argument!");
            System.exit(1);
        }

        if (args.length > 1) {
            try {
                k = Integer.parseInt(args[1]);
                if (k==0) {k=1;};
            } catch (NumberFormatException e) {
                //System.exit(0);
            }
        }

        try {
            seed = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
//          System.err.println(e);
            System.err.println("Argument '" + args[0] + "' must be an integer.");
            System.exit(1);
        }

        fibonacci f1 = new fibonacci(seed, k);
        f1.Go();
    }
}