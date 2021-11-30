import datastructures.ArrayListQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListQueueTest {

    @Test
    public void testEnqueueDequeue() {
        ArrayListQueue<String> testQueue = new ArrayListQueue<>();
        testQueue.enqueue("wachtrij");
        assertEquals(1, testQueue.size());
        assertEquals("wachtrij", testQueue.dequeue());
        assertTrue(testQueue.isEmpty());
    }

    @Test
    public void testPushPopLoop() {
        int testSize = 10;
        ArrayListQueue<Integer> testQueue = new ArrayListQueue<>();
        for (int i = 0; i < testSize; i++) {
            testQueue.enqueue(i);
        }
        for (int i = 0; i < testSize; i++) {
            assertEquals(testSize - i , testQueue.size());
            assertEquals(i, testQueue.dequeue());
        }
        assertTrue(testQueue.isEmpty());
    }
}
