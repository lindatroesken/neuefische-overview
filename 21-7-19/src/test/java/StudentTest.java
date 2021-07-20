import model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student testStudent = new Student();

    @Test
    @DisplayName("Test first name")
    public void testFirstName() {

        //GIVEN
        String First = "Mike";

        //WHEN
        testStudent.setFirstName(First);
        String actual = testStudent.getFirstName();

        //THEN
        assertEquals(First, actual);

    }

    @Test
    @DisplayName("Test last name")
    public void testLastName() {

        //GIVEN
        String testLastName = "Müller";

        //WHEN
        testStudent.setLastName(testLastName);
        String actual = testStudent.getLastName();

        //THEN
        assertEquals(testLastName, actual);

    }

    @Test
    @DisplayName("Test matriculation number")
    public void testMatriculationNumber() {

        //GIVEN
        int testMatriculationNumber = 23456;

        //WHEN
        testStudent.setMatriculationNumber(testMatriculationNumber);
        int actual = testStudent.getMatriculationNumber();

        //THEN
        assertEquals(testMatriculationNumber, actual);

    }
}