package solid.liskov.badexample;

public class Square extends Rectangle{

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int widht) {
        super.setWidth(widht);
        super.setHeight(widht);
    }
}
