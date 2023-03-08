package model;

public class Customer {
    private String custID, custName, tel, email;

    public Customer() {
    }

    public Customer(String custID, String custName, String tel, String email) {
        this.custID = custID;
        this.custName = custName;
        this.tel = tel;
        this.email = email;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return custID + " - " + custName + " - " + email;
    }
    
}
