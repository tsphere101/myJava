
public class Camera extends SecurityDevice{

    enum CameraType {
        ptz, eptz, stationary;
    }
    private String name;
    String serial_number;
    Position position;
    CameraType type;

    // Constructor
    public Camera()
    {

    }
    public Camera(String serial_number, Position pos, CameraType type) {
        this.serial_number = serial_number;
        this.position = pos;
        this.type = type;
    }

    // Encapsulation
    // Getters
    public Position getPosition() {
        return position;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public CameraType getType() {
        return type;
    }

    // Setters
    public void setPosition(Position position) {
        this.position = position;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    // Methods
    public String log() {
        String output = "";
        output += "SERIAL::" + this.getSerial_number() + "\nTYPE::"+ this.getType() ;
        output += "\n==POSITION==\n" ;
        output += "PAN::";
        output += this.getPosition().getPan();
        output += "\n";
        output += "TILT::";
        output += this.getPosition().getTilt();
        output += "\n";
        output += "ZOOM::";
        output += this.getPosition().getZoom();
        output += "\nActivateStatus::" + this.getActiveStatus();
        
        return output;
    }
}
