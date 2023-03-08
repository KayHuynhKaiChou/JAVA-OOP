/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gakusei {
    private String id;
    private String namae; //(tên)
    private int sai; // tuổi
    private String address;
    private Double GPA;
    
    public Gakusei(){}

    public Gakusei(String id, String namae, int sai, String address, Double GPA) {
        this.id = id;
        this.namae = namae;
        this.sai = sai;
        this.address = address;
        this.GPA = GPA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamae() {
        return namae;
    }

    public void setNamae(String namae) {
        this.namae = namae;
    }

    public int getSai() {
        return sai;
    }

    public void setSai(int sai) {
        this.sai = sai;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }
    
    public boolean checkInput(){
        if(!this.id.matches("[0-9]{4}")) return false;
        else if(!this.namae.matches("[A-Za-z ]+")) return false;
        else if(!(this.sai>=1 && sai <=100)) return false;
        else if(!this.address.matches("[0-9a-zA-Z ]+")) return false;
        else if(!(this.GPA>=0 && this.GPA<=10)) return false;
        else return true;
    }
    
    public void inputInform(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("+ Enter ID: ");
            id = sc.nextLine();
            System.out.print("+ Enter name: ");
            namae = sc.nextLine();
            System.out.print("+ Enter age: " );
            sai = Integer.parseInt(sc.nextLine());
            System.out.print("+ Enter Address: ");
            address = sc.nextLine();
            System.out.print("+ Enter GPA: ");
            GPA = Double.valueOf(sc.nextLine());
            if(checkInput()) break;
            else System.out.println("error Inform, please input again!");
        }
    }
    
    public String firstName(){
        if(this.getNamae().indexOf(" ")>0){
            int index = this.getNamae().trim().lastIndexOf(" ");
            return this.namae.substring(index+1);
        }else
            return this.getNamae();
    }
    
    public void display(){
        System.out.println(this);
    }
    
    public String getLineFile(){
        return id+","+namae+","+sai+","+address+","+GPA;
    }
    
    public void parse(String line){
        String[] arr = line.split(",");
        id = arr[0];
        namae = arr[1];
        sai = Integer.parseInt(arr[2]);
        address = arr[3];
        GPA = Double.valueOf(arr[4]);
    }
    
    @Override
    public String toString() {
        return "Gakusei{" + "id=" + id + ", namae=" + namae + ", sai=" + sai + ", address=" + address + ", GPA=" + GPA + '}';
    }
    
    
}
