import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

import org.omg.CORBA.portable.InputStream;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class GameMain {
	static AudioInputStream audioInputStream;
	static Clip clip;
	public static void main(String[] args) {
		JFrame frame = new FirstPage();
	    frame.setTitle("Tower Of Hanoi");
	    frame.setSize(800,600);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);	
	    frame.setResizable(false);
		music();
	}

	public static void music(){
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/sio.wav").getAbsoluteFile());
	        clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
		    clip.start();
		    clip.loop(Clip.LOOP_CONTINUOUSLY);
		    
	
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void buttonmusic(){
		try {
			AudioInputStream input = AudioSystem.getAudioInputStream(new File("sounds/button17.wav").getAbsoluteFile());
	        Clip c = AudioSystem.getClip();
	        c.open(input);
		    c.start();
	
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void buttonsuccess(){
		try {
			AudioInputStream input = AudioSystem.getAudioInputStream(new File("sounds/success.wav").getAbsoluteFile());
	        Clip c = AudioSystem.getClip();
	        c.open(input);
		    c.start();
	
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void buttonfail(){
		try {
			AudioInputStream input = AudioSystem.getAudioInputStream(new File("sounds/fail.wav").getAbsoluteFile());
	        Clip c = AudioSystem.getClip();
	        c.open(input);
		    c.start();
	
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
}