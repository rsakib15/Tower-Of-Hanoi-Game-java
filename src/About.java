
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.ItalicAction;

public  class About extends JFrame{
	ImagePanel panel = new ImagePanel();
	JButton back = new JButton(panel.imageback);
	public About() {
		back.setBorder(null);
		back.setBounds(300,450, 200,45);
		this.add(back);
		this.add(panel);
		back.addActionListener(new backPage());	
	}
	
	class ImagePanel extends JPanel{
		private ImageIcon imageIcon = new ImageIcon("images/aboutbg.jpg");
		private ImageIcon imageback = new ImageIcon("images/back.jpg");
		private Image image = imageIcon.getImage();
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		 }
	  }
	}

	class backPage implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	    	GameMain.buttonmusic();
	    	FirstPage sPage =new FirstPage();
	    	sPage.setTitle("Tower Of Hanoi");
	 	    sPage.setSize(800, 600);
	 	    sPage.setLocationRelativeTo(null); // Center the newFrame
	 	    sPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	    sPage.setResizable(false);
	 	    sPage.setVisible(true);	
	   	  }
	}
	
	class backPage1 implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	    	GameMain.buttonmusic();
	    	MenuFrame sPage =new MenuFrame();
	    	sPage.setTitle("Main Menu");
	 	    sPage.setSize(800, 600);
	 	    sPage.setLocationRelativeTo(null);
	 	    sPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	    sPage.setResizable(false);
	 	    sPage.setVisible(true);
	   	  }
	}