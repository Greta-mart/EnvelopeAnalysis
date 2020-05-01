package EnvelopeAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Analysis {
    float a, b;
    float c, d;


    public void inputData () {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Please enter the length of envelope [1]: ");
            a = s.nextFloat();

            System.out.print("Please enter the width of envelope [1]: ");
            b = s.nextFloat();

            System.out.print("Please enter the length of envelope [2]: ");
            c = s.nextFloat();

            System.out.print("Please enter the width of envelope [2]: ");
            d = s.nextFloat();
        }
        catch (InputMismatchException ex){
            System.out.println("The length and width of envelopes should be numbers");
            System.exit(1);
        }
    }

    public void analysisData(){
        if (a >= c && b >= d) {
            System.out.println("The envelope [2] can be placed into the envelop [1]");
        }
        else {
            System.out.println("The envelope [2] can't be placed into the envelop [1]");
        }
    }

    public void continueWork() {
        String answer;
        Scanner in = new Scanner(System.in);

        System.out.print("Would you like to continue work (y/n): ");
        answer = in.next();
        if (answer.equalsIgnoreCase("y")) {
            inputData();
            analysisData();
            continueWork();
        }
        else {
            System.exit(0);
        }

        in.close();
    }
}
