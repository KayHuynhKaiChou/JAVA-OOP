/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
/**
 *
 * @author DELL
 */
public class Student implements Comparable<Student>{
    private String code,name;
    private Double mark;

    public Student(){}
    
    public Student(String code, String name, Double mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + mark+"\n";
    }

    @Override
    public int compareTo(Student st) {
        return this.code.compareTo(st.code);
    }

    
}
