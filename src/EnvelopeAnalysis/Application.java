package EnvelopeAnalysis;

import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class Application {

    Scanner s = new Scanner(System.in);

    public float inputData(String param, byte i) {
        boolean isSuccess = false;
        float size = 0;
        do {
            try {
                System.out.print("Please enter the " + param + " of envelope [" + i + "]: ");
                size = parseFloat(s.nextLine());
                isSuccess = true;
            } catch (Exception ex) {
                System.out.println("The length and width of envelopes should be numbers");
            }
        }
        while (isSuccess == false);
        return size;
    }

    public void Run() {
        float a = 0, b = 0, c = 0, d = 0;
        String answer;

        Envelope env1 = new Envelope();
        Envelope env2 = new Envelope();

        do {
            a = inputData("length", (byte) 1);
            b = inputData("width", (byte) 1);
            c = inputData("length", (byte) 2);
            d = inputData("width", (byte) 2);

            env1.setLength(a);
            env1.setWidth(b);

            env2.setLength(c);
            env2.setWidth(d);

            if (env1.compareEnvelope(env2)) {
                System.out.println("The envelope [2] can be placed into the envelop [1]");
            } else {
                System.out.println("The envelope [2] can't be placed into the envelop [1]");
            }

            System.out.println("Would you like to continue (Y/N): ");
            answer = s.nextLine();
        }
        while ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")));
    }
}
