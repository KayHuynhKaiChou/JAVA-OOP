/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map1;


public class student {
    private String name;
    private String school;
    private double math;
    private double physical;
    private double chemistry;

    public student(String name, String school, double math, double physical, double chemistry) {
        this.name = name;
        this.school = school;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setClasss(String school) {
        this.school = school;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    
    double averageScore(student st){
        return (this.math + this.physical + this.chemistry)/3;
    }
    public void showEachInform(){
        System.out.println("Name: "+this.name);
        System.out.println("School: "+this.school);
        System.out.println("Score Math: "+this.math);
        System.out.println("Score Math: "+this.physical);
        System.out.println("Score Math: "+this.chemistry);
        System.out.printf("Average Score 3 subjects: %.2f\n",averageScore(this));
        System.out.println("----------------------------");
    }
    
    
}
