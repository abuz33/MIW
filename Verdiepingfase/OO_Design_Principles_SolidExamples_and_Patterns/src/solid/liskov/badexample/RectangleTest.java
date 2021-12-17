package solid.liskov.badexample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void areaShouldBeCalculatedCorrectlyWithRectangle() {
        // arrange
        Rectangle r = new Rectangle();
        int expectedArea = 10;
        // act
        r.setHeight(2);
        r.setWidth(5);
        // assert
        Assert.assertTrue("values should be equal", expectedArea == r.area());
    }

    @Test
    public void areaShouldBeCalculatedCorrectlyWithDerivedClassSquare() {
        // arrange
        Rectangle r = new Square();   // rectangle replaced with child class!!
        int expectedArea = 10;
        // act
        r.setHeight(2);
        r.setWidth(5);
        // assert
        Assert.assertTrue("values should be equal", expectedArea == r.area());
    }

}