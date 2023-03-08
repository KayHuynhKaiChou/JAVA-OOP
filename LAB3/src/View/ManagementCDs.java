/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.CD;
import Model.CDList;
import Model.Constraints;
import Model.FileService;
import Model.IOkeyboard;
import java.util.*;

/**
 *
 * @author DELL
 */
public class ManagementCDs extends Menu<String> implements SystemFunction{
    static String[] menu = {"Add CD to the catalog","Search CD by CD title","Display the catalog",
        "Update CD", "Save to file", "Print all list CDs from file","Exit"};
    String[] coCDs = {"game","movie","music"};
    private CDList catalog;

    public ManagementCDs(CDList catalog) {
        super("<<============Function System============>>",menu);
        try {
            this.catalog = (CDList) FileService.readFile();
        } catch (Exception e) {
            this.catalog = catalog;
        }
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1: addCD(); decideUser(n); break;
            case 2: searchCD(); decideUser(n); break;
            case 3: displayCD(); decideUser(n); break;
            case 4: updateCD(); break;
            case 5: saveData(); break;
            case 6: printByOrderFirstName(); decideUser(n); break;
            default:
                System.out.println("Only choose from 1 to "+mChon.size());
        }
    }
//-----------------------------------------------------------------------------------------
    @Override
    public void addCD() {
        if(!catalog.spaceMax(4)) return;
        CD c = new CD();
        c.setId(Constraints.inputID(catalog));
        c.setTitle(Constraints.inputTitle());
        c.setType(Constraints.inputType());
        c.setCollectionName(this.choiceCollection());
        c.setPrice(Constraints.inputPrice());
        c.setYear(Constraints.inputYear());
        catalog.add(c);
    }

    private String choiceCollection(){
        String nameCollec ="";
        while(true){
            System.out.println("-------------------");
            for (int i=0; i<coCDs.length; i++) System.out.println((i+1)+"."+coCDs[i]);
            int num = IOkeyboard.InputInteger("Enter name collection (by number): ", "Input must be number, pls enter again!");
            nameCollec = num == 1 ? "game" : num==2 ? "movie" : num==3 ? "music" : "";
            if(!nameCollec.isEmpty()) break;
            else System.err.println("Just enter number in range [1,3], pls enter again!");
        }
        return nameCollec;
    }
//-----------------------------------------------------------------------------------------
    
    @Override
    public void searchCD() {
        String title = IOkeyboard.InputString("Enter CD's matched Title: ");
        if(!catalog.search(title).isEmpty()) catalog.search(title).print(); 
        else System.err.println("Not Found!");
    }
//-----------------------------------------------------------------------------------------

    @Override
    public void displayCD() {
        if(catalog.isEmpty()) System.out.println("List is Empty");
        else catalog.print();
    }
//-----------------------------------------------------------------------------------------

    @Override
    public void printByOrderFirstName() {
        catalog.stream().sorted(Comparator.comparing(c -> c.getTitle())).forEach(c -> System.out.println(c.toString()));
    }
//-----------------------------------------------------------------------------------------

    @Override
    public void updateCD() {
        Menu<String> menu = new Menu<>("--------Type name of collection--------",
                        new String[]{"Update CD information","Delete CD information","Back"}) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: updateCDInform(); break;
                    case 2: deleteCDInform(); break;
                    default: System.out.println("Only choose from 1 to "+mChon.size());
                }
            }
        };
        menu.run();
    }
//-----------------------------------------------------------------------------------------
   
    public void updateCDInform(){
        while(true){
            String id = IOkeyboard.InputNoneEmptyString("Enter CD's checked id: ", "ID is not Empty, please enter again!");
            if(!id.matches("C[0-9][0-9][0-9]")) {
                System.err.println("ID is wrong format (ex: C001,C018,...), Please enter again!");
            }else{
                CD cd = catalog.findCDByID(id);
                if(cd==null) System.out.println("This ID not exist in List, Please enter again!");
                else {
                    cd.setTitle(IOkeyboard.InputString("Enter new CD's Title: "));
                    String type = IOkeyboard.InputString("Enter new CD's Type: ");
                    cd.setType(type.isBlank() ? 0 : type.charAt(0));
                    System.out.println("-------------------");
                    for (int i=0; i<coCDs.length; i++) System.out.println((i+1)+"."+coCDs[i]);
                    cd.setCollectionName(Constraints.inputCollectInUpdate());
                    Double price = Constraints.inputPrice();
                    if(price!=0) cd.setPrice(price);
                    Integer year = Constraints.inputYear();
                    if(year!=0) cd.setYear(year);
                    System.out.println("Update Success!");
                    break;
                }
            }
        }
    }
//-----------------------------------------------------------------------------------------
   
    public void deleteCDInform(){
        while(true){
            String id = IOkeyboard.InputNoneEmptyString("Enter CD's checked id: ", "ID is not Empty, please enter again!");
            if(!id.matches("C[0-9][0-9][0-9]")) {
                System.out.println("ID is wrong format (ex: C001,C018,...), Please enter again!");
            }else{
                CD cd = catalog.findCDByID(id);
                if(cd==null) System.out.println("This ID not exist in List, Please enter again!");
                else catalog.remove(cd);
                System.out.println("Delete Success!");
                break;
            }
        }
    }
//-----------------------------------------------------------------------------------------
   
    public void saveData(){
        try {
            FileService.writeFile(catalog);
            System.out.println("Success!");
        } catch (Exception e) {
            System.err.println("Fail!");
        }
    }
 //-----------------------------------------------------------------------------------------
   
    public void decideUser(int n){
        Boolean dec = IOkeyboard.confirm("Do you want to continue ", "Just enter Y/y or N/n , Please enter again!");
        if(dec) this.execute(n);
    }
//-----------------------------------------------------------------------------------------

}
