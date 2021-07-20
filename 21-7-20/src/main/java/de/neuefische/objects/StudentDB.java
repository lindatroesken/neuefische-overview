package de.neuefische.objects;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] listStudents(){
        return students;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (int i = 0; i < students.length; i++) {
            returnString += students[i].toString() +"\n";
        }
        return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }
}
