public class Position {

    double pan;
    double tilt;
    double zoom;

    // Constructor
    public Position() {
        this(0, 0, 0);
    }

    public Position(double pan, double tilt, double zoom) {
        this.pan = pan;
        this.tilt = tilt;
        this.zoom = zoom;
    }

    // Encapsulation
    // Getter
    public double getPan() {
        return pan;
    }

    public double getTilt() {
        return tilt;
    }

    public double getZoom() {
        return zoom;
    }

    // Setters
    public void setPan(double pan) {
        this.pan = pan;
    }

    public void setTilt(double tilt) {
        this.tilt = tilt;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    // Method
    public void log() {
        System.out.println(pan + " " + tilt + " " + zoom);
    }
}
