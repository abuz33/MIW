package patterns.strategy.pattern;

public interface PersistencyMediator {
    /**
     * load drawing, given by name
     * @param nameDrawing
     */
    public void load(String nameDrawing);

    /**
     * save drawing
     */
    public void save();
}
