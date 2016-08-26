
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameHold implements ActionListener{
	private static JFrame gameFrame = new JFrame();
   
    public GameHold(String title,int level) {
    	gameFrame.setTitle(title);
    	build();
    	System.out.println("inside temp: " + level);
    	call(level);
    }

    public static void sevisiblex(){
    	gameFrame.setVisible(false);
    }
     
    private void build(){
        gameFrame.setSize(900, 700);; 
        gameFrame.setResizable(false);
        gameFrame.setLocationRelativeTo(null); 
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
   
    public  void call(int level) {
    	System.out.println("inside call: " + level);
        Tower t =new Tower(level);
        gameFrame.getContentPane().add(t);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}