package EnvelopeAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public void Run() {
        float a = 0, b = 0, c = 0, d = 0;
        String answer;

        Envelope env1 = new Envelope();

        Envelope env2 = new Envelope();

        Scanner s = new Scanner(System.in);
        do {
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
            env1.setLength(a);
            env1.setWidth(b);

            env2.setLength(c);
            env2.setWidth(d);

            if (env1.compareEnvelope(env2)) {
                System.out.println("The envelope [2] can be placed into the envelop [1]");
            } else {
                System.out.println("The envelope [2] can't be placed into the envelop [1]");
            }

            System.out.println("Continue?");
            answer = s.next();
        }
        while (answer.equalsIgnoreCase("y"));
        // s.close();
    }

}
