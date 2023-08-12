package com.skillrisers.streetfighter.sprites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Health extends CommonPlayer {
   Color color;
   String name;
   public Health(int x , String name) {
	   this.x=x;
	   y=20;
	   w=500;
	   h=50;
	   this.name=name;
   }
   
   public void printHealth(Graphics pen) {
	   pen.setColor(color.RED);
	   pen.fillRect(x, y, w, h);
	   pen.setColor(color.BLUE);
	   pen.fillRect(x, y, health, h);
	   pen.setColor(color.RED);
	   pen.setFont(new Font("arial",Font.BOLD,40));
 	   pen.drawString(name, x, y + h + 40);
   }
	
	
	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
