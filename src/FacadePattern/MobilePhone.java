package FacadePattern;

/**
 * Created by cheny on 2018/4/17.
 */
public class MobilePhone {
    Camera camera = new CameraImpl();
    Phone phone = new PhoneImpl();

    public void videoChat(){
        camera.open();
        phone.dial();
    }

    public void takePic(){
        camera.open();
        camera.takePic();
    }
}
