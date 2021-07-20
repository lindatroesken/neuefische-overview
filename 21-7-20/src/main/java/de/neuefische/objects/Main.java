package de.neuefische.objects;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Erika", 123);

        Student student2 = new Student("Max", 234);
        Student[] students = {student1, student2};
        StudentDB studentsDB = new StudentDB(students);
        System.out.println(studentsDB.randomStudent().toString());
    }
}
