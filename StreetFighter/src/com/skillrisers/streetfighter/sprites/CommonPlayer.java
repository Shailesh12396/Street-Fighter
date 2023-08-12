package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.streetfighter.utils.Constants;

abstract public class CommonPlayer implements Constants{
	protected BufferedImage playerImg;
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected int speed;
	protected int imageIndex;
	protected int currentMove;
	protected boolean isCollide;
	protected boolean isAttacking;
	protected int health;

    public CommonPlayer() {
    	health=MAX_HEALTH;
    }
	
	public abstract BufferedImage defaultImage();
	
	public int getHealth() {
		return health;
	}

	public void setHealth() {
		this.health = (int) (health - MAX_HEALTH * 0.01);
	}

	public boolean isAttacking() {
		return isAttacking;
	}

	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}

	public boolean isCollide() {
		return isCollide;
	}

	public void setCollide(boolean isCollide) {
		this.isCollide = isCollide;
	}

	public int getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(int currentMove) {
		this.currentMove = currentMove;
	}

	public BufferedImage getPlayerImg() {
		return playerImg;
	}
	public void setPlayerImg(BufferedImage playerImg) {
		this.playerImg = playerImg;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	public void move() {
		if(!isCollide) {
			x = x + speed;
		}
	}
	
	public void showPlayer(Graphics pen) {
		pen.drawImage(defaultImage(), x, y, w, h, null);
	}
	
	
}