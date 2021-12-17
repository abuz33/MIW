package fromsheets.drawingcontroller.withMediator;

import fromsheets.drawingcontroller.Drawing;

public interface PersistencyMediator {
    
    //    load a Drawing with given name, and return it
    //    
    public Drawing load(String nameDrawing);
    
    //
    //     save a drawing
    //    
    public void save(Drawing drawing);
}
