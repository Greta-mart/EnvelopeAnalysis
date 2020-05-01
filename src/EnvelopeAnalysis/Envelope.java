package EnvelopeAnalysis;

public class Envelope {
    float a, b;

    Envelope(float a, float b){
        this.a = a;
        this.b = b;
    }
    public boolean compareEnvelope (float c, float d){
        if (a >= c && b >= d) {
            return true;
        }
        else{
            return false;
        }
    }
}
