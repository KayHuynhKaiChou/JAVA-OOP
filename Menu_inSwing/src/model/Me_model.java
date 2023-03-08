/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author DELL
 */
public class Me_model {
   private String eng;
   private String japan;

    public Me_model() {
        this.eng = "";
        this.japan = "";
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getJapan() {
        return japan;
    }

    public void setJapan(String japan) {
        this.japan = japan;
    }
   
    public void contro(){
        this.eng = "(n)\nIts mean: cuộc tranh luận, bàn luận";
    }
    
    public void curious(){
        this.eng = "(adj)\nIts mean: tò mò , thắt mắt";
    }
    
    public void deep(){
        this.eng = "(adj)\nIts mean: sâu xa, khó lườn";
    }
    
    public void modest(){
        this.eng = "(adj)\nIts mean: khiêm tốn";
    }
}
