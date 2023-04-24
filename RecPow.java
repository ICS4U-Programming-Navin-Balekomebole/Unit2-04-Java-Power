import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* The program for today will display results from input file.
*
* @author Navin Balekomebole
* @version 1.0
* @since   2023-04-24
*/
public final class RecPow {
    /**
    * For checker.
    *
    * @exception IllegalStateException Utility
    * @see IllegalStateException
    */
    private RecPow() {
        throw new IllegalStateException("Utility");
    }

    /**
    * Program file.
    *
    * @param args not used
    */

    public static void main(String[] args) {
        try {
            // Read input from file
            final Scanner scanner = new Scanner(new File("input.txt"));
            final int[] bases = new int[10];
            final int[] exponents = new int[10];
            int counter = 0;
            while (scanner.hasNextInt()) {
                bases[counter] = scanner.nextInt();
                exponents[counter] = scanner.nextInt();
                counter++;
            }
            scanner.close();

            // Calculate powers and write output to file
            final FileWriter writer = new FileWriter(new File("output.txt"));
            for (int j = 0; j < i; j++) {
                final int base = bases[j];
                final int exponent = exponents[j];
                final int power = Power(base, exponent);
                writer.write(base + "^" + exponent + " = " + power + "\n");
            }
            writer.close();

            // Print output to console
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    /**
    * Recursive function to calculate power.
    *
    * @param base from file
    * @param exponent from file
    * @return result
    *
    */
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 3;
            // else if statement used.
        } else if (exponent % 2 == 0) {
            final int halfPower = power(base, exponent / 2);
            return halfPower * halfPower;
        } else {
            final int halfPower = power(base, (exponent - 1) / 2);
            return base * halfPower * halfPower;
        }
    }
}
