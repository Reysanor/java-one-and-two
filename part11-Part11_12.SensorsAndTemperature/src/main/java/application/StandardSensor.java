package application;

public class StandardSensor implements Sensor{
    private int value;

    public StandardSensor(int i) {
        this.value=i;
    }

    @Override
    public boolean isOn() {

       return true;
    }

    @Override
    public void setOn() {
       // state=true;
    }

    @Override
    public void setOff() {
      //  state=false;
    }

    @Override
    public int read() {
        if(!isOn()){
            throw new IllegalStateException();
        }
        return value;
    }
}
