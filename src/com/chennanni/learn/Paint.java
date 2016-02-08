package com.chennanni.learn;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint {
	private JFrame mainFrame;
	private JPanel drawPanel;
	
	private Paint() {
		// create a frame
		mainFrame = new JFrame("Simple Painter");
	    mainFrame.setSize(500,500);
	    mainFrame.setLayout(new BorderLayout());
	    
	    // create a panel
	    drawPanel = new DrawPanel();
	    
	    // add the panel to the frame
	    mainFrame.add(drawPanel, BorderLayout.CENTER);
	    mainFrame.setVisible(true); 
	}
	
    public static void main(String[] args){
	    new Paint();
	}
}
