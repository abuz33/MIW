package patterns.strategy.withinheritance;

public class DrawingController {
    private Drawing drawing;

    public DrawingController(Drawing drawing) {
        this.drawing = drawing;
    }

    /**
     * load drawing, given by name
     * @param nameDrawing
     */
    public void load(String nameDrawing){

    }

    /**
     * save drawing
     */
    public void save(){

    }

    /**
     * redraw drawing on canvas
     */
    public void redraw(){

    }
}
