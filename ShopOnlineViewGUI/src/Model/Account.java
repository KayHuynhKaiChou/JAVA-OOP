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
public class Account {
    private String user;
    private String password;
    
    public Account(){}

    public Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.user);
        hash = 11 * hash + Objects.hashCode(this.password);
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
        final Account other = (Account) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    
    
    public boolean checkTKMK(){
        if(!(user.length()<10)) return false; 
        if(!(password.length()<10 && password.matches("([A-Za-z]+[0-9]+)|([0-9]+[A-Za-z]+)"))) return false;
        return true;
    }

    @Override
    public String toString() {
        return user + "," + password;
    }
    
    public void parseObject(String tk){
        String[] s = tk.split(",");
        this.setUser(s[0]);
        this.setPassword(s[1]);
    }
}
