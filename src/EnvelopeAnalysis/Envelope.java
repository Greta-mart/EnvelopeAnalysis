package EnvelopeAnalysis;

public class Envelope {
    float width, length;

    public boolean compareEnvelope (Envelope obj){
        return width > obj.width && length > obj.length;
    }
}
