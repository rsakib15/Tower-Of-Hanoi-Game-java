
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HowToPlay extends JFrame {
	ImagePanel panel = new ImagePanel();
	JButton close = new JButton(panel.closeIcon);
	public HowToPlay(){
		close.setBorder(null);
		close.setBounds(300,450, 200,45);
		this.add(close);
		this.add(panel);
		addActionListener();
	}
	
	public void init(){
		close.setBounds(10,20,50,60);
		add(close);
	}
	
	public void addActionListener(){
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMain.buttonmusic();
				setVisible(false);
				
			}
		});
	}
	
	class ImagePanel extends JPanel{
		private ImageIcon imageIcon = new ImageIcon("images/hanoi.jpg");
		private ImageIcon closeIcon = new ImageIcon("images/close.jpg");
		private Image image = imageIcon.getImage();
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		  
		 }
	  }
	}
