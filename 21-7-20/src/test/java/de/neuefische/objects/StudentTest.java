package de.neuefische.objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Test toString Method")
    public void testStudentToString(){
        // GIVEN
        Student student1 = new Student("Erika");
        student1.setId(123);

        // WHEN
        String actualString = student1.toString();

        // THEN
        String expectedString = "Name: Erika, ID: 123";
        assertEquals(expectedString, actualString);

    }

    @Test
    @DisplayName("Test equals method (if two students with same name and same id are equal)")
    public void testStudentsEqual(){
        // GIVEN
        Student student1 = new Student("Erika", 123);
        Student student2 = new Student("Erika", 123);

        // THEN
        boolean actual = student1.equals(student2);

        // WHEN
        assertTrue(actual);

    }


}