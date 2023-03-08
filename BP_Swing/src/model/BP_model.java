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
public class BP_model {
    private String content;

    public BP_model() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void member1(){
        this.content = "Name: Jisoo"+"\n"+"Age:27"+"\n"+"Date:3/1/1995"+"\n"
                +"birthplace:  Sanbon-dong, Gunpo, Korean"+"\n"
                +"Height: 1,62m"+"\n"+"Job: Singer,Actress,MC,Dancer"+"n"
                +"Sibling:  Kim Ji-yoon, Kim Jung-hoon";
        
    }
    
    public void member2(){
        this.content = "Name: Jennie"+"\n"+"Age:26"+"\n"+"Date:16/1/1996"+"\n"
                +"birthplace:  Cheongdam-dong, Seoul, Korean"+"\n"
                +"Height: 1,63m"+"\n"+"Job: Singer,Rapper,Dancer"+"n"
                +"Sibling:  No information";
    }
    
    public void member3(){
        this.content = "Name: Rose"+"\n"+"Age:25"+"\n"+"Date:11/2/1997"+"\n"
                +"birthplace:   Auckland, New Zealand"+"\n"
                +"Height: 1,68m"+"\n"+"Job: Singer,Model,Dancer"+"n"
                +"Sibling:  No information";
    }
    
    public void member4(){
        this.content = "Name: Lisa"+"\n"+"Age:25"+"\n"+"Date:27/3/1997"+"\n"
                +"birthplace:   Satuek, ThaiLand"+"\n"
                +"Height: 1,67m"+"\n"+"Job: Singer,Rapper,Dancer"+"n"
                +"Sibling:  No information";
    }
}
