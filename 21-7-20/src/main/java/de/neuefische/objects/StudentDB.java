package de.neuefische.objects;

import java.util.Arrays;
import java.util.Random;

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

    public Student randomStudent(){
        int randomIndex = (int)(Math.random() * students.length);
        return students[randomIndex];
    }

    public void addStudent(Student newStudent){
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length-1] = newStudent;
        students = newStudents;
    }

    public void removeStudent(Student student){
        Student[] newStudents = new Student[students.length -1];
        int newIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if(!students[i].equals(student)){
                newStudents[newIndex] = students[i];
                newIndex++;
            }
        }
        students = newStudents;
    }

}
