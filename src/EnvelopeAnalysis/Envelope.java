package EnvelopeAnalysis;

public class Envelope {
    float a, b;

    Envelope(float a, float b){
        a = this.a;
        b = this.b;
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
