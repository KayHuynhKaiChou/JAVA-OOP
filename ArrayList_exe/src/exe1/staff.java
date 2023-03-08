/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class staff {
    protected String codeStaff;
    protected String fullName;
    protected int age;
    protected String email;
    protected String telephone;
    
    public staff(){
        super();
    }

    public staff(String codeStaff, String fullName, int age, String email, String telephone) {
        this.codeStaff = codeStaff;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public String getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(String codeStaff) {
        this.codeStaff = codeStaff;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public void enterInform(){
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter code staff: ");
        codeStaff = sc.nextLine();
        System.out.print("+ Enter fullname staff: ");
        fullName = sc.nextLine();
        System.out.print("+ Enter age staff: ");
        age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter email staff:");
        email = sc.nextLine();
        System.out.print("Enter telephone staff:");
        telephone = sc.nextLine();
    }
    
    public int netSalary(){
        return 0;
    }
    @Override
    public String toString() {
        return "CodeStaff: " + codeStaff + ", fullName: " + fullName + ", age: " + age + "\n  Email: " + email + ", telephone: " + telephone + '}';
    }
    
    
}
