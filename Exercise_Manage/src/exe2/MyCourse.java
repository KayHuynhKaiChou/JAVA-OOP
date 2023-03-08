/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class MyCourse implements ICourse{

    @Override
    public void f1(List<Course> a, int st){
        if(st == 1){
            Collections.sort(a,new Comparator<Course>(){
                @Override
                public int compare(Course o1, Course o2) {
                    if(o1.getFee()-o2.getFee()>0) return 1;
                    else return -1;
                }
            });
        }else{
            Collections.sort(a, new Comparator<Course>(){
                @Override
                public int compare(Course o1, Course o2) {
                    return o2.getName().compareToIgnoreCase(o1.getName());
                }
            });
        }
    }

    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        for (Course khoa : a) {
            if(khoa.getFee()>=fee)
                count++;
        }
        return count;
    }
    
}
