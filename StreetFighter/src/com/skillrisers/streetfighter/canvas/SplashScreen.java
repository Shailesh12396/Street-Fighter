package com.skillrisers.streetfighter.canvas;

import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.skillrisers.streetfighter.utils.Constants;

public class SplashScreen extends JFrame implements Constants{
	
	private JLabel label=new JLabel();
	
	public SplashScreen() {
	setTitle(TITLE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(SCREENWDITH, SCREENHEIGHT);
	setLocationRelativeTo(null);
	
	Icon icon = new ImageIcon(SplashScreen.class.getResource("splash.jpg")); 
	label.setIcon(icon);
	this.add(label);
	setVisible(true);
	
	try {
		Thread.sleep(10000);
		setVisible(false);
		dispose();
		GameFrame obj = new GameFrame();
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static void main(String []args) {
    	SplashScreen obj= new SplashScreen();
}
}
