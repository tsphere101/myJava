public class MyMain {
    public static void main(String[] args) {

        System.out.println(123);
        System.out.println("ABC");

        Camera my_cam1 = new Camera();
        my_cam1.setSerial_number("234");
        my_cam1.setActiveStatus(true);
        my_cam1.setType(Camera.CameraType.ptz);
        my_cam1.setPosition(new Position(0,0,0));

        


        System.out.println(my_cam1.log());
        
    }
}
