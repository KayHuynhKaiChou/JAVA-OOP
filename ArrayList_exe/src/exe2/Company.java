/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.List;
import javax.naming.PartialResultException;

/**
 *
 * @author DELL
 */
public class Company {
    private ListFullTime lf;
    private ListPartTime lp;

    public Company() {
        
    }

    public Company(ListFullTime lf, ListPartTime lp) {
        this.lf = lf;
        this.lp = lp;
    }

    
    public Double AllSalary(){
        Double total = 0.0;
        List<NVfullTime> nvf = lf.getDsFull();
        List<NVpartTime> nvp = lp.getDsPart();
        for (NVfullTime nv : nvf) {
            total += nv.getSalary();
        }
        for (NVpartTime nv : nvp) {
            total += nv.getSalary();
        }
        return total;
    }
    
    public void searchNVFP(TypeEmploy ty, String id, String name){
        switch(ty){
            case FULLTIME:
                lp.SearchNV(id, name);
                break;
            case PARTTIME:
                lf.searchNV(id, name);
                break;
        }
    }
}
