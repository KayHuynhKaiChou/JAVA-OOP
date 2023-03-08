/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package audiomusic;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author DELL
 */
public class AudioMusic1 {
    File fi;
    AudioInputStream ais;
    Clip cl;
    public AudioMusic1(){
        
    }
    public void amnhac() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        //Scanner sc = new Scanner(System.in);
        fi = new File("PinkVenom.wav");
        ais = AudioSystem.getAudioInputStream(fi);
        cl = AudioSystem.getClip();
        cl.open(ais); 
           
        String response = "";
    }
    
    public void start(){
        this.cl.start();
    }
    
    public void stop(){
        this.cl.stop();
    }
    
    public void reset(){
        this.cl.setMicrosecondPosition(0);
    }
}
        
    


