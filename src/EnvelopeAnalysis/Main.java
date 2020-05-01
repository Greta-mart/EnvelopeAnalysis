package EnvelopeAnalysis;

public class Main {
    public static void main(String[] args) {
        float a=0, b=0, c=0, d=0;

        Application app = new Application(a, b);
        app.Run();
        Envelope env1 = new Envelope(a, b);
        Envelope env2 = new Envelope(c ,d);
        env1.compareEnvelope(env2);
    }
}
