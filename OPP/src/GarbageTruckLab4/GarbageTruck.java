/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarbageTruckLab4;

/**
 *
 * @author DELL
 */
public class GarbageTruck implements GarbageInform{
    private int curLoad; // khối lg rác
    private GarbagePoint[] gps;
    private int totalFee;
    private int totalWorkTime;
    private int curPoint; // xe đang ở điểm nào
    

    public GarbageTruck() {
    }

    public GarbageTruck(GarbagePoint[] gps) {
        this.gps = gps;
        
    }

    public int getCurLoad() {
        return curLoad;
    }

    public void setCurLoad(int curLoad) {
        this.curLoad = curLoad;
    }

    public GarbagePoint[] getGps() {
        return gps;
    }

    public void loadGarbage(){   // xe chứa rác
        if(curLoad + gps[curPoint].getGarbageLoad()<=MAX_LOAD){
            curLoad += gps[curPoint].getGarbageLoad();
            totalWorkTime+= AVG_LOAD_TIME;
            curPoint++;
            goNext();
        }else{
            goField();
        }
    }
    
    public void goNext(){
        if(curPoint <= (gps.length - 1)){
            loadGarbage();
            
        }else{
            totalFee += AVG_FEE;
            totalWorkTime += AVG_TRIP_LOAD;
            goHome();
        }
    }
    
    public void goField(){
        curLoad = 0;
        totalWorkTime+= AVG_TRIP_LOAD ;
        totalFee += AVG_FEE;
        goNext();
    }
    
    public void goHome(){
        //System.out.println(totalFee);
        totalFee += 1.0*(totalWorkTime)/60*SALARY_HOUR;
        //System.out.println(totalWorkTime);
    }
    
    public void setGps(GarbagePoint[] gps) {
        this.gps = gps;
    }

    public int getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getTotalWorkTime() {
        return totalWorkTime;
    }

    public void setTotalWorkTime(int totalWorkTime) {
        this.totalWorkTime = totalWorkTime;
    }

    public int getCurPoint() {
        return curPoint;
    }

    public void setCurPoint(int curPoint) {
        this.curPoint = curPoint;
    }

    @Override
    public String toString() {
        return "GarbageTruck{" + "curLoad=" + curLoad + ", totalFee=" + totalFee + ", totalWorkTime=" + totalWorkTime + ", curPoint=" + curPoint + '}';
    }
    
    
}
