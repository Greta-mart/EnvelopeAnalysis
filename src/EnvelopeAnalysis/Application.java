package EnvelopeAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application{



    public void Run() {
        float a = 0, b = 0, c = 0, d = 0;

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
                Envelope env1 = new Envelope(a, b);
                Envelope env2 = new Envelope(c, d);
                if (env1.compareEnvelope(env2)) {
                    System.out.println("The envelope [2] can be placed into the envelop [1]");
                } else {
                    System.out.println("The envelope [2] can't be placed into the envelop [1]");
                }
                s.close(); /*Please enter the length of envelope [1]: Exception in thread "main" java.lang.IllegalStateException: Scanner closed
                at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150)
                at java.base/java.util.Scanner.next(Scanner.java:1573)
                at java.base/java.util.Scanner.nextFloat(Scanner.java:2496)
                at EnvelopeAnalysis.Application.Run(Application.java:17)
                at EnvelopeAnalysis.Main.main(Main.java:8)
это если закрыть сканер(((( нужно будет подумтаь куда его вынести*/
            }
            while (true);
    }

}
