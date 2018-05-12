package FacadePattern;

/**
 * Created by cheny on 2018/4/17.
 */
public class CameraImpl implements Camera{
    @Override
    public void open() {
        System.out.println("open camera");
    }

    @Override
    public void takePic() {
        System.out.println("take picture");
    }

    @Override
    public void close() {
        System.out.println("close camera");
    }
}
