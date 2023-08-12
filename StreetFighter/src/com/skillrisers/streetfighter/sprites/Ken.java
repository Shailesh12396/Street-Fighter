package com.skillrisers.streetfighter.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.streetfighter.utils.Constants;

public class Ken extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	private BufferedImage kickImages[] = new BufferedImage[5];
	private BufferedImage punchImages[] = new BufferedImage[3];
	private BufferedImage sitImages[] = new BufferedImage[3];
	private BufferedImage hitImages2[] = new BufferedImage[3];
	private BufferedImage flipImages[] = new BufferedImage[4];




	private int force;
	public Ken() throws IOException {
		x = SCREENWDITH - 400;
		w = 200;
		h = 250;
		y = SCREENHEIGHT - h - 100;
		speed = 0;
		force = 0;
		playerImg = ImageIO.read(Ryu.class.getResource(KEN_IMAGE));
		loadIdleImages();
		loadKickImages();
		loadPunchImages();
		loadSitImages();
		loadHitImages2();
		loadFlipImages();
	}
	public void jump() {
		force = -40;
		y = y + force;
	}
	
	public void fall() {
		if(y + force > GROUND - h) {
			return;
		}
		force = force + GRAVITY;
		y = y + force;
	}
	
//	private void loadPlayer() throws IOException {
//		playerImg = ImageIO.read(Ryu.class.getResource(KEN_IMAGE));
//		playerImg = playerImg.getSubimage(1347, 244, 114, 245);
//	}

	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(1347, 244, 114, 245);
		idleImages[1] = playerImg.getSubimage(1116, 240, 118, 249);
		idleImages[2] = playerImg.getSubimage(890, 242, 118, 247);
		idleImages[3] = playerImg.getSubimage(672, 242, 117, 247);
	}
	
	private void loadKickImages() {
		kickImages[0] = playerImg.getSubimage(1327, 1457, 126, 245);
		kickImages[1] = playerImg.getSubimage(1118, 1457, 131, 245);
		kickImages[2] = playerImg.getSubimage(840, 1462, 221, 240);
		kickImages[3] = playerImg.getSubimage(1118, 1457, 131, 245);
		kickImages[4] = playerImg.getSubimage(1327, 1457, 126, 245);

	}
	
	private void loadPunchImages() {
		punchImages[0] = playerImg.getSubimage(1321, 488, 169, 244);
		punchImages[1] = playerImg.getSubimage(1051, 487, 202, 245);
		punchImages[2] = playerImg.getSubimage(1321, 488, 169, 244);

	}
	
	private void loadSitImages() {
		sitImages[0] = playerImg.getSubimage(1294, 2225, 196, 208);
		sitImages[1] = playerImg.getSubimage(1347, 244, 114, 245);

	}
	
	private void loadHitImages2() {
		hitImages2[0] = playerImg.getSubimage(427, 1717, 145, 228);
		hitImages2[1] = playerImg.getSubimage(624, 1717, 196, 228);

	}
	
	private void loadFlipImages() {
		flipImages[0] = playerImg.getSubimage(832, 1702, 238, 244);
		flipImages[1] = playerImg.getSubimage(1090, 1709, 215, 244);
		flipImages[2] = playerImg.getSubimage(1338, 1709, 152, 244);


	}
	
	public BufferedImage printIdleImages() {
		isAttacking =false;
		if(imageIndex > 3) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printKickImages() {
		
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove=IDLE;
			isAttacking =false; 
		}
		isAttacking=true;
		BufferedImage img = kickImages[imageIndex];
		imageIndex++;
		return img;
	}
	
public BufferedImage printPunchImages() {
		
		if(imageIndex > 2) {
			imageIndex = 0;
			currentMove=IDLE;
			isAttacking =false; 
		}
		isAttacking=true;
		BufferedImage img = punchImages[imageIndex];
		imageIndex++;
		return img;
	}

public BufferedImage printSitImages() {
	
	if(imageIndex > 2) {
		imageIndex = 0;
		currentMove=IDLE;
		isAttacking =false; 
	}
	isAttacking=true;
	BufferedImage img = sitImages[imageIndex];
	imageIndex++;
	return img;
}

public BufferedImage printHitImages2() {
	if(imageIndex > 2) {
		imageIndex = 0;
		currentMove = IDLE;
	}
	BufferedImage img = hitImages2[imageIndex];
	imageIndex++;
	return img;
}

public BufferedImage printFlipImages() {
	if(imageIndex > 3) {
		imageIndex = 0;
		currentMove = IDLE;
	}
	BufferedImage img = flipImages[imageIndex];
	imageIndex++;
	return img;
}
	@Override
	public BufferedImage defaultImage() {
		
		if(currentMove == WALK) {
			return printIdleImages();
		}
		else if(currentMove == KICK) {
			return printKickImages();
		}
		else if(currentMove == PUNCH) {
			return printPunchImages();
		}
		else if(currentMove == SIT) {
			return printSitImages();
		}
		else if(currentMove == HIT) {
			return printHitImages2();
		}
		else if(currentMove == FLIP) {
			return printFlipImages();
		}
		else {
		return printIdleImages();
	}
	}
}