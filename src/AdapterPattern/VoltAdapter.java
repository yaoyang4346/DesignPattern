package AdapterPattern;

/**
 * Created by cheny on 2018/4/15.
 */
public class VoltAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter(Volt220 adaptee){
        volt220 = adaptee;
    }

    public int getVolt220(){
        return 220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
