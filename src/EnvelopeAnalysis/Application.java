package EnvelopeAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application{

    public void Run(float width, float length) {

        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 1; i++) {
            try {
                System.out.print("Please enter the length of envelope " + i +": ");
                width = s.nextFloat();

                System.out.print("Please enter the width of envelope " + i +": ");
                length = s.nextFloat();

            } catch (InputMismatchException ex) {
                System.out.println("The length and width of envelopes should be numbers");
                System.exit(1);
            }
        }
    }

}
