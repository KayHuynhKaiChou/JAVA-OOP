/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package audiomusic;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author DELL
 */
public class AudioMusic {
    
    
    public static void main(String args[]) throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        Scanner sc = new Scanner(System.in);
        File fi = new File("PinkVenom.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(fi);
        Clip cl = AudioSystem.getClip();
        cl.open(ais); 
           
        String response = "";
			
        while(!response.equals("Q")) {
	System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
	System.out.print("Enter your choice: ");
			
	response = sc.next();
	response = response.toUpperCase();
			
	switch(response) {
		case ("P"): cl.start();
		break;
		case ("S"): cl.stop();
		break;
		case ("R"): cl.setMicrosecondPosition(0);
		break;
		case ("Q"): cl.close();
		break;
		default: System.out.println("Not a valid response");
	}		
        }
		System.out.println("Byeeee!");	
    }
}
        
    


