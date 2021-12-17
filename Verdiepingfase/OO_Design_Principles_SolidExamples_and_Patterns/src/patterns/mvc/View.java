package patterns.mvc;

public class View {
    private String status; // status field on ui
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void redraw() {
        // simulate drawing of ui
        System.out.println(this.status);
    }

    public void changeStatus(){
        this.controller.changeStatus();
    }
}
