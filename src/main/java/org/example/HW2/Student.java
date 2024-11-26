package org.example.HW2;

public class Student {
    private String name;
    private int studentId;
    private double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentDetails() {
        System.out.println("Студент: " + this.name + ", ID: " + this.studentId + ", GPA: " + this.gpa);
    }
}
