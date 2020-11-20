package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean state = false;

    public TemperatureSensor() {

    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public int read() {
        if (!state) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61)-30;
    }
}
