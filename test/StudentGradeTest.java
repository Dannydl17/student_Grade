import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentGradeTest {

    @Test
    public void testThatTheNumberOfStudentNumberAndSubjectCanBeCollectedTest(){
       int numberOfStudent = 4;
       int numberOfSubject = 3;
       int[][] results = StudentGrade.canCollectNumberOfStudentAndSubject(numberOfStudent, numberOfSubject);
       assertEquals(4, results.length);
    }

    @Test
    public void testThatStudentGradeCanStoreStudentScoreTest(){
        int numberOfStudent = 4;
        int numberOfSubject = 3;
        StudentGrade.
    }
}