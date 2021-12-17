package patterns.mvc;

public class Main {

    public static void main(String[] args) {
        // create model
        Model model = new Model();
        // create controller
        Controller controller = new Controller();
        // create view
        View ui = new View(controller);
        // add model & view to controller
        controller.setUi(ui);
        controller.setModel(model);

        //
        // 'do something' in ui
        //
        ui.changeStatus();
        //
        ui.changeStatus();
        //
        ui.changeStatus();
        //
        ui.changeStatus();
        //
    }
}
