package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList = new ArrayList<>();
    private List<Integer> readed = new ArrayList<>();

    public AverageSensor() {
    }

    @Override
    public boolean isOn() {
      return sensorList.stream().allMatch(s ->s.isOn());

    }

    @Override
    public void setOn() {
        sensorList.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {

        if (!sensorList.stream().anyMatch(s -> !s.isOn())){
            sensorList.get(0).setOff();
        };
    }


    @Override
    public int read() {
        if(!isOn() || sensorList.size()<1) throw new IllegalStateException();

        int ret =( sensorList.stream().mapToInt(s -> s.read()).sum()/sensorList.size());
        readed.add(ret);
        return ret;
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }
    public List<Integer> readings(){
        //return sensorList.stream().mapToInt(s->s.read()).boxed().collect(Collectors.toList());
        return readed;
    }
}
