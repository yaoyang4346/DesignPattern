package StatePattern;

import javax.sound.midi.Soundbank;

/**
 * Created by cheny on 2018/5/12.
 */
public class Player {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void next() {
        state.next();
    }

    public void pre() {
        state.pre();
    }

    public void powerOff() {
        state = new PowerOffState();
        System.out.println("关机了");
    }

    public void powerOn() {
        state = new PowerOnState();
        System.out.println("开机了");
    }
}
