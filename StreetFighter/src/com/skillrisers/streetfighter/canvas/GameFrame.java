package com.skillrisers.streetfighter.canvas;

import java.io.IOException;

import javax.swing.JFrame;

import com.skillrisers.streetfighter.utils.Constants;

public class GameFrame extends JFrame implements Constants {
	
	public GameFrame() throws IOException {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREENWDITH, SCREENHEIGHT);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setResizable(false);
		setVisible(true);
	}

	/*public static void main(String[] args) throws IOException {
		GameFrame obj = new GameFrame();
	}
*/
}
