package de.neuefische.objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    @DisplayName("Test list method")
    public void testList(){
        // GIVEN
        Student student1 = new Student("Erika", 123);
        Student student2 = new Student("Max", 234);
        Student[] students = {student1, student2};
        StudentDB studentDB = new StudentDB(students);

        // THEN
        Student[] actualStudents = studentDB.listStudents();

        // WHEN
        Student[] expectedStudents = {student1, student2};
        assertArrayEquals(expectedStudents, actualStudents);

    }

    @Test
    @DisplayName("Test toString method")
    public void testToString(){
        // GIVEN
        Student student1 = new Student("Erika", 123);
        Student student2 = new Student("Max", 234);
        Student[] students = {student1, student2};
        StudentDB studentDB = new StudentDB(students);

        // THEN
        String actualStudentsString = studentDB.toString();

        // WHEN
        String expectedStudentsString = "Name: Erika, ID: 123\nName: Max, ID: 234\n";
        assertEquals(expectedStudentsString, actualStudentsString);

    }


}