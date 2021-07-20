package model;

public class Student {

    private String firstName;
    private String lastName;
    private int matriculationNumber;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getMatriculationNumber();
    }
}