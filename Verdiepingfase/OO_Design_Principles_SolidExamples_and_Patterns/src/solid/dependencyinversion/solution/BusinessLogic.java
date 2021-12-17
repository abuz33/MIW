package solid.dependencyinversion.solution;

public class BusinessLogic {
    private interfaceUI ui;
    private interfaceDB database;

    // Constructor met meegegeven implementaties van de interface
    // meegeven van implementaties in een methodeaanroep heet: Dependency Injection
    // can met constructor
    public BusinessLogic(interfaceUI ui, interfaceDB database) {
        this.ui = ui;
        this.database = database;
    }

    // of met setter injecteren
    public void setUIInterfaceImplementatie(interfaceUI uiImpl){
        this.ui = uiImpl;
    }

    // idem, maar nu gegenereerd met IntelliJ
    public void setDatabase(interfaceDB database) {
        this.database = database;
    }

    public void doSomeLogicThing(){

        //
        this.database.getData();
        // do stuff
        this.ui.showInfo();
        // do other stuff
        this.database.saveIt();

    }



}
