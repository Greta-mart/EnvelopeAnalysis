package EnvelopeAnalysis;

public class Envelope {
    float width, length;

    Envelope(float a, float b){
        this.width = a;
        this.length = b;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }
    public boolean compareEnvelope (Envelope obj){
        return width > obj.width && length > obj.length;
    }
}
