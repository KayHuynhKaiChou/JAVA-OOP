/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Animal implements ActionAnimal{
    private String id ;
    private String name;
    private double weight;
    private String ExtraFeatures;
    private String[] Actions;
    private String Type ;
    private int numberFoot;

    public Animal() {
    }

    public Animal(Animal an){
        this(an.id,an.name,an.weight,an.ExtraFeatures,an.Actions,an.Type,an.numberFoot);
    }
    
    public Animal(String id, String name, double weight, String ExtraFeatures,String[] Actions, String Type, int numberFoot) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.ExtraFeatures = ExtraFeatures;
        this.Actions = Actions;
        this.Type = Type;
        this.numberFoot = numberFoot;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExtraFeatures() {
        return ExtraFeatures;
    }

    public void setExtraFeatures(String ExtraFeatures) {
        this.ExtraFeatures = ExtraFeatures;
    }

    public String[] getActions() {
        return Actions;
    }

    public void setActions(String[] Actions) {
        this.Actions = Actions;
    }
    
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getNumberFoot() {
        return numberFoot;
    }

    public void setNumberFoot(int numberFoot) {
        this.numberFoot = numberFoot;
    }

    @Override
    public String toString() {
        return id + "_" + name + "_" + weight + "_" + ExtraFeatures + "_"+
                makeSound() + "," + eatFood() + "," + anotherAction() + "_"
                + Type + "_" + numberFoot;
    }
    
    public String Display(){
        return "ID: "+id+ ", Name: "+name+ ", Weight: "+weight+" kg"+ 
               "\nExtraFeatures: "+ExtraFeatures+
               "\nSound: " + makeSound() + "\nFood: " + eatFood() + "\nAnotherActions: " + anotherAction() +
               "\nType: " + Type +
               "\nNumberFoot: "+numberFoot+"\n";
    }
    
    @Override
    public String makeSound() {
        return Actions[0];
    }

    @Override
    public String eatFood() {
        return Actions[1];
    }

    @Override
    public String anotherAction() {
        int i = 2; String result="";
        while(i<Actions.length){
            result += Actions[i++];
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    
}
