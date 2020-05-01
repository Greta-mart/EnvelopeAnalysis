package EnvelopeAnalysis;

public class Envelope {
    float width, length;

    Envelope(float a, float b){
        this.width = a;
        this.length = b;
    }
    public boolean compareEnvelope (Envelope obj){
        if (width >= obj.width && length >= obj.length) {
            return true;
        }
        else{
            return false;
        }
    }
}
