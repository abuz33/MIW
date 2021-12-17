package solid.dependencyinversion.badexample;

public class BusinessLogic {
    private UI ui;
    private DB database;


    public void doSomeLogicThing(){

        //
        this.database.getData();
        // do stuff
        this.ui.showInfo();
        // do other stuff
        this.database.saveIt();

    }


}
