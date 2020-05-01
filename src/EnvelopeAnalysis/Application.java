package EnvelopeAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application{
    float a, b, c, d;

    public void Run() {

        Scanner s = new Scanner(System.in);
            try {
                System.out.print("Please enter the length of envelope [1]: ");
                a = s.nextFloat();

                System.out.print("Please enter the width of envelope [1]: ");
                b = s.nextFloat();

                System.out.print("Please enter the length of envelope [2]: ");
                c = s.nextFloat();

                System.out.print("Please enter the width of envelope  [2]: ");
                d = s.nextFloat();

            } catch (InputMismatchException ex) {
                System.out.println("The length and width of envelopes should be numbers");
                System.exit(1);
            }
            Envelope env1 = new Envelope(a, b);
            Envelope env2 = new Envelope(c, d);
            if (env1.compareEnvelope(env2)){
                System.out.println("The envelope [2] can be placed into the envelop [1]");
            }
            else {
                System.out.println("The envelope [2] can't be placed into the envelop [1]");
            }

    }

}