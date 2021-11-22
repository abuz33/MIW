package model;

import org.junit.jupiter.api.Assertions;

public class StudentResultTest {
    /**
     * @verifies calculate number of Followed lesson
     * @see StudentResult#numberOfFollowedLessons(int)
     */
    @org.junit.jupiter.api.Test
    public void numberOfFollowedLessons_shouldCalculateNumberOfFollowedLesson() throws Exception {
        //TODO auto-generated
        StudentResult sr = new StudentResult();
        Assertions.assertEquals(6, sr.numberOfFollowedLessons(1000));
    }
}
