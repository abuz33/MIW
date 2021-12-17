package solid.liskov.solution;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void areaShouldBeCalculatedCorrectly() {
        // arrange
        Square s = new Square();   // what about Liskov?
        int expectedArea = 25;
        // act
        s.setSide(5);
        // assert
        Assert.assertTrue("values should be equal", expectedArea == s.area());
    }

    @Test
    public void areaShouldBeCalculatedCorrectlyWithChildClass() {
        // arrange
        Square s = new Rectangle();   // what about Liskov?
        int expectedArea = 25;
        // act
        s.setSide(5);
        // assert
        Assert.assertTrue("values should be equal", expectedArea == s.area());
    }


}