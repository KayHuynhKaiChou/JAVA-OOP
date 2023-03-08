package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Patient {
    private String PatientID, Fullname, Address, Phone;

    public Patient() {
    }

    public Patient(String PatientID, String Fullname, String Address, String Phone) {
        this.PatientID = PatientID;
        this.Fullname = Fullname;
        this.Address = Address;
        this.Phone = Phone;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "PatientID=" + PatientID + ", Fullname=" + Fullname + ", Address=" + Address + ", Phone=" + Phone + '}';
    }
    
    public void UpdatePhone(String phone){
        this.setPhone(phone);
    }
}
