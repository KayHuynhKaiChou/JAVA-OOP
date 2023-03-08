/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

/**
 *
 * @author DELL
 */
public class ReservationCode {
    private String name;
    private String RC;

    public ReservationCode(String name, String RC) {
        this.name = name;
        this.RC = RC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        // KD3MF4
        String result = "";
        for (int i = 0; i< RC.length(); i++) {
            //Cách 1:
            if(i%3==0 && i>0){
                result = result + "-" + RC.charAt(i);
            }else{
                result = result + RC.charAt(i);
            }
            //Cách 2:
            /*
            result = result + RC.charAt(i);
            if((i+1)%3==0)  result = result + "-";
            */
        }
        return result;
    }

    public void setCode(String RC) {
        this.RC = RC;
    }

    @Override
    public String toString() {
        return name + "\t" + RC;
    }
    
    
}
