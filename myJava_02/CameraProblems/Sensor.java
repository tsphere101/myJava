public class Sensor extends SecurityDevice {

    double distance;
    boolean active;
    boolean silent;

    // Constructor
    public Sensor() {
        this(false, false);
    }

    public Sensor(boolean active, boolean silent) {
        this.active = active;
        this.silent = silent;
    }

    @Override
    public boolean getActiveStatus() {
        return this.active;
    }

    public boolean getSilentStatus() {
        return this.silent;
    }

}
