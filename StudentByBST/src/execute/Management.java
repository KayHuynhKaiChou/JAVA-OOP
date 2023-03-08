/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execute;

import Entity.Constraints;
import Entity.ListHSbyBST;
import Entity.Student;
import IOTools.IOkeyboard;
import java.util.Scanner;
import view_controller.Menu;
/**
 *
 * @author DELL
 */
public class Management extends Menu<String>{
    static String[] mn = {"Add a new student","Delete student","Update Mark Student","Print List","Exit"};
    ListHSbyBST lHS = new ListHSbyBST();
    Scanner sc = new Scanner(System.in);
    
    public Management() {
        super("==========Function System=========",mn);
//       lHS.getListHS().insert(new Student("QE17011", "NHA Tuan", 6.8));
//       lHS.getListHS().insert(new Student("QE17005", "Lional Messi", 8.5));
//       lHS.getListHS().insert(new Student("QE17003", "Neymar Jr", 8.0));
//       lHS.getListHS().insert(new Student("QE17009", "Mppabe", 8.2));
//       lHS.getListHS().insert(new Student("QE17018", "Jinko", 7.8));
    }

    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                functionAdd(); break;
            case 2:
                String code = Constraints.inputCode();
                lHS.removeStudent(new Student(code, null, 0.0)); break;
            case 3:
                String codeHS = Constraints.inputCode();
                Student s = lHS.updateMark(codeHS); 
                if(s==null){System.out.println("Code Not Found!");}
                else{
                   Double newMark = Constraints.inputMark();
                   s.setMark(newMark); 
                }
                break;
            case 4:
                lHS.printList(); break;
        }
    }
    
    public void functionAdd(){
       String code = Constraints.inputCode();
       String name = Constraints.inputName();
       Double mark = Constraints.inputMark();
       Student s = new Student(code,name,mark);
       lHS.getListHS().insert(s);
   }
   
    public static void main(String[] args) {
        new Management().run();
    }
}
