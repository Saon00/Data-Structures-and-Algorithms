package com.stacks;

public class Student {

    private String firstName;
    private String lastName;
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", id= " + id +
                '}';
    }

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
