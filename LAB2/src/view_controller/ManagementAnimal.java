/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import IOTools.IOkeyboard;
import Model.Animal;
import Model.Constraints;
import Model.FunctionSystem;
import Model.ListAnimal;
import Model.TypeOfAnimal;
import static Model.TypeOfAnimal.FourLeg;
import static Model.TypeOfAnimal.TwoLegFly;
import static Model.TypeOfAnimal.TwoLegNotFly;
import static Model.TypeOfAnimal.ZeroLeg;
import java.util.*;


/**
 *
 * @author DELL
 */
public class ManagementAnimal extends Menu<String> implements FunctionSystem,TypeOfAnimal{
    
    static String[] menu = {"Load data from file","Add new Animal","Update Animal","Delete Animal","Search Animal","Show Animal List"
    ,"Show data to file","Exit"};
    Scanner sc = new Scanner(System.in);
    private ListAnimal lia;

    public ManagementAnimal() {
        super("----> Function System <----",menu);
        lia = new ListAnimal();
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:                
                    if(lia.getListDV().isEmpty()) {
                       lia.read();
                       if(lia.getListDV().isEmpty()) System.err.println("File System is Empty so can not load file , please choose Function 2 to add animals");                       
                       else System.out.println("Load data Succesfully !");
                    }else System.out.println("Have Load File Before !");
                break;    
            case 2: new ChoiceAdds().run();
                    this.Decide(n); break;
            case 3: this.UpdateAnimal();
                    this.Decide(n); break;
            case 4: this.DeleteAnimal();
                    this.Decide(n); break;
            case 5: this.SearchAnimal();
                    break;
            case 6: new ChoiceShows().run();
                    break;
            case 7: if(!lia.getListDV().isEmpty()){
                        lia.write();
                        System.out.println("Save Data to file Successfully! ");
                    }else {System.out.println("Can not save data because Your list is Empty!"); }
                    System.exit(0);
            case 8: break;
            default:
                System.out.println("Only choose from 1 to "+mChon.size());
        }
    }

    
    public static void main(String[] args) {
        new ManagementAnimal().run();
    }
    
    public void Decide(int n){
        while(true){
            System.out.print("Do you wanna continue or not (Y/N): ");
            String choice = sc.nextLine();
            if(!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")){
                System.err.println("Just enter Y/y or N/n , Please enter again!");
            }else if(choice.equalsIgnoreCase("Y")){
                this.execute(n); break;
            }else break;
        }
    }
    
    public boolean listEmpty(){
        if(lia.getListDV().isEmpty()){
            System.out.println("List is Empty, Please choose Function 1 from main menu!");
            return true;
        }
        return false;
    }
    
    @Override
    public void AddAnimal(Animal a) {
        while(true){
            String id = Constraints.inputID(lia.getListDV()); a.setId(id);
            String namae = Constraints.inputName(); a.setName(namae);
            Double weight = Constraints.inputWeight(); a.setWeight(weight);
            
            String exFeatures = IOkeyboard.InputNoneEmptyString("Enter Animal Features: ","Not Empty, please enter again!"); a.setExtraFeatures(exFeatures);
            
            String singleAC = IOkeyboard.InputNoneEmptyString("Enter Animal Sound: ","Not Empty, please enter again!") + ",";
            singleAC+= IOkeyboard.InputNoneEmptyString("Enter Animal Food: ","Not Empty, please enter again!") + ",";
            singleAC+= IOkeyboard.InputNoneEmptyString("Enter Animal Another Actions: ","Not Empty, please enter again!") + ",";            
            String[] actions = singleAC.split(","); a.setActions(actions);
            
            String msg = lia.constraints(a);
            if(msg.equals("All True")){
                lia.getListDV().add(a);
                break;
            }else System.err.println(msg);
            
        } 
    }
    
    class ChoiceAdds extends Menu<String>{
        static String[] menu = {ZeroLeg,TwoLegNotFly,TwoLegFly,FourLeg,"Back"};

        public ChoiceAdds() {
            super("----> Type Of Animal <----",menu);
        }
        
            @Override
            public void execute(int n) {
                Animal ani = new Animal();
                switch(n){
                    case 1:
                        ani.setType(ZeroLeg);
                        ani.setNumberFoot(0);
                        break;
                    case 2:
                        ani.setType(TwoLegNotFly);
                        ani.setNumberFoot(2);
                        break;
                    case 3:
                        ani.setType(TwoLegFly);
                        ani.setNumberFoot(2);
                        break;
                    case 4:
                        ani.setType(FourLeg);
                        ani.setNumberFoot(4);
                        break;
                    default:
                        System.out.println("Only choose from 1 to "+mChon.size());
                }
                if(n>=1 && n<=4) AddAnimal(ani);
            }
    }
    
    @Override
    public void UpdateAnimal() {
        if(listEmpty()) return;
        String id = IOkeyboard.InputNoneEmptyString("Enter Animal ID: ", "The ID can not be empty, please enter again !");
        for(Animal dv : lia.getListDV()){
            if(dv.getId().equals(id)){
                System.out.println("ID is suitable with availabe ID in list");
                String namae = IOkeyboard.InputString("Enter New Animal Name: ");
                if(!namae.isBlank()) dv.setName(namae);
                
//                Double weight = IOkeyboard.InputDouble("Enter Animal weight: ","Error Number input, please enter again!" ); 
//                if(!(weight+"").isBlank()) dv.setWeight(weight);
                
                Double weight = Constraints.inputWeight();
                if(!(weight==0)) dv.setWeight(weight);

                String exFeatures = IOkeyboard.InputString("Enter New Animal Features: ");
                if(!exFeatures.isBlank()) dv.setExtraFeatures(exFeatures);

                String singleAC = IOkeyboard.InputString("Enter New Animal Sound: ") + ",";
                singleAC+= IOkeyboard.InputString("Enter New Animal Food: ") + ",";
                singleAC+= IOkeyboard.InputString("Enter New Animal Another Actions: ") + ",";            
                String[] actions = singleAC.split(","); 
                for (int i = 0; i < actions.length; i++) {
                    if(!actions[i].isBlank()) dv.getActions()[i] = actions[i];
                }
                System.out.println(dv.Display());
                return;
            }
        }
        if(id.contains("A17")) System.err.println(id+" Not Exist, Please enter an another ID again!");
        else System.err.println("ID is wrong format (ex: A17008,...), Please enter again!");
        this.UpdateAnimal();
    }

    @Override
    public void DeleteAnimal() {
        if(listEmpty()) return;
        String id = IOkeyboard.InputNoneEmptyString("Enter Animal ID: ", "The ID can not be empty, please enter again !");
        lia.DeleteAnimal(id);
    }

    
    @Override
    public void SearchAnimal() {
        if(listEmpty()) return;
        class ChoiceSearchs extends Menu<String>{
            static String[] menu = {"Search By Name","Search By Weight","Back"};

            public ChoiceSearchs() {
                super("----> Type Of Search <----",menu);
            }

            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        String nameTK = IOkeyboard.InputString("Enter the text or particular name: ");
                        lia.SearchByName(nameTK); break;
                    case 2:
                        Double up = IOkeyboard.InputDouble("Enter the upper bound: ", "Error Number input, please enter again!");
                        Double lo = IOkeyboard.InputDouble("Enter the lower bound: ", "Error Number input, please enter again!");
                        if(up>lo) lia.SearchByWeight(lo, up);
                        else lia.SearchByWeight(up, lo); 
                        break;
                    default:
                        System.out.println("Only choose from 1 to "+mChon.size());
                }
            }
        }
        
        new ChoiceSearchs().run();
    }

    class ChoiceShows extends Menu<String>{
        static String[] menu = {"Show by type","Show All","Back"};

        public ChoiceShows() {
            super("----> Type Of Show <----",menu);
        }

        @Override
        public void execute(int n) {
            switch(n){
                case 1:
                   ShowAnimalByCriteria(); break;
                case 2:
                   if(!listEmpty()) lia.ShowAll(lia.getListDV());
                   break;
                default:
                   System.out.println("Only choose from 1 to "+mChon.size());
            }
        }
    }
    
    
    
    @Override
    public void ShowAnimalByCriteria() {
        if(listEmpty()) return;
        class TypeShows extends Menu<String>{
            static String[] menu = {ZeroLeg,TwoLegNotFly,TwoLegFly,FourLeg,"Back"};

            public TypeShows() {
                super("----> Type Of Animals <----",menu);
            }

            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        lia.ShowByType(ZeroLeg);
                        break;
                    case 2:
                        lia.ShowByType(TwoLegNotFly);
                        break;
                    case 3:
                        lia.ShowByType(TwoLegFly);
                        break;
                    case 4:
                        lia.ShowByType(FourLeg);
                        break;    
                }
            }
        }
        
        new TypeShows().run();
    }
    
}
