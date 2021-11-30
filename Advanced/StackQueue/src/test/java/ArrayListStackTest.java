import datastructures.ArrayListStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListStackTest {

    @Test
    public void testPushPop() {
        ArrayListStack<String> testStack = new ArrayListStack<>();
        testStack.push("stapel");
        assertEquals(1, testStack.size());
        assertEquals("stapel", testStack.pop());
        assertTrue(testStack.isEmpty());
    }

    @Test
    public void testPushPopLoop() {
        ArrayListStack<Integer> testStack = new ArrayListStack<>();
        for (int i = 0; i < 10; i++) {
            testStack.push(i);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals(i, testStack.pop());
            assertEquals(i , testStack.size());
        }
    }
}
