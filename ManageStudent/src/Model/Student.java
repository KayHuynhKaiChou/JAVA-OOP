/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Student implements Comparable<Student>{
    private String StudentID,FirstName,LastName,Gender;
    private LocalDate DateofBirth;

    public Student() {
    }

    public Student(String StudentID, String FirstName, String LastName, LocalDate DateofBirth, String Gender) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.DateofBirth = DateofBirth;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender + ", DateofBirth=" + DateofBirth + '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
    
    
}
