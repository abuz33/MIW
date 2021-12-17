package patterns.observer;

public class Main {
    public static void main(String[] args) {
        // NOTE: this example uses the deprecated technology of observer/observable
        // normally you would use events, streams or flows for this (but it's less clear to understand).

        // model
        Dobbelsteen dobbelsteen = new Dobbelsteen();
        // observers
        aantalOgenView view1 = new aantalOgenView();
        argumentView view2 = new argumentView();
        // add observers to model
        dobbelsteen.addObserver(view1);
        dobbelsteen.addObserver(view2);

        // wijzig model
        dobbelsteen.gooi();
        dobbelsteen.gooi();
    }
}
