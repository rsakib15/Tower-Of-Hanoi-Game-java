import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class  FirstPage extends JFrame {
	ImagePanel panel = new ImagePanel();  
	JButton start= new JButton(panel.imageStart);
	JButton about= new JButton(panel.imageAbout);
	JButton exit= new JButton(panel.imageExit);
	
	public FirstPage(){
		start.setBounds( 520, 250, 200, 45);
		about.setBounds(520, 300, 200, 45);
		exit.setBounds(520, 350, 200, 45);
		start.setBorder(null);
		about.setBorder(null);
		exit.setBorder(null);
		this.add(start); 
		this.add(about);
		this.add(exit);
		this.add(panel);
		addFirstPageListener();
	}
  
	public class ImagePanel extends JPanel{
		private ImageIcon imageIcon = new ImageIcon("images/untitle.jpg");
		private ImageIcon imageStart = new ImageIcon("images/start.jpg");
		private ImageIcon imageAbout = new ImageIcon("images/about.jpg");
		private ImageIcon imageExit = new ImageIcon("images/exit.jpg");
		private Image image = imageIcon.getImage();
		private Image start = imageIcon.getImage();
	
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
		    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		    g.drawImage(start, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public void addFirstPageListener(){
		start.addActionListener(new startPageAction());
		about.addActionListener(new aboutPageAction() );
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMain.buttonmusic();
				System.exit(0);
			}
		});		
	}

	public class startPageAction implements ActionListener {
		public void actionPerformed(ActionEvent e){
			GameMain.buttonmusic();
			MenuFrame newFrame = new MenuFrame(); 
			newFrame.setTitle("Main Menu");
			newFrame.setSize(800,600);
			newFrame.setLocationRelativeTo(null);
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setVisible(true);	
			newFrame.setResizable(false);
			newFrame.back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newFrame.setVisible(false);
				}
			});
			    setVisible(false);
		}
	}
	
	class aboutPageAction implements ActionListener {
		public void actionPerformed(ActionEvent e){
			GameMain.buttonmusic();
			About newFrame = new About();
		    newFrame.setTitle("Tower Of Hanoi");
		    newFrame.setSize(800, 600);
		    newFrame.setLocationRelativeTo(null);
		    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    newFrame.setVisible(true);	
		    newFrame.setResizable(false);
		    newFrame.back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newFrame.setVisible(false);	
				}
			});
		    setVisible(false);
	     }
	     
	  }
}