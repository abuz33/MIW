package patterns.mvc;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {
    private TrafficLight trafficLight;

    public Model() {
        this.trafficLight = TrafficLight.RED;
    }

    public void moveToNextState(){
        switch (this.trafficLight){
            case RED:   this.trafficLight = TrafficLight.GREEN; break;
            case GREEN: this.trafficLight = TrafficLight.YELLOW;break;
            case YELLOW: this.trafficLight = TrafficLight.RED;break;
        }
        // notify observers
        this.setChanged();
        this.notifyObservers(this.trafficLight);
    }
}
