package patterns.mvc;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {
    private View ui;
    private Model model;

    public Controller() {
    }

    public void setUi(View ui) {
        this.ui = ui;
    }

    public void setModel(Model model) {
        this.model = model;
        this.model.addObserver(this);
    }

    public void changeStatus(){
        this.model.moveToNextState();
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     */
    @Override
    public void update(Observable o, Object arg) {
        // get updated value from model
        TrafficLight currentState = (TrafficLight) arg;
        // update ui
        this.ui.updateStatus(currentState.toString());
        this.ui.redraw();
    }


}
