package view;

import java.awt.Color;

import javax.swing.JFrame;

import model.GameModel;

import controller.GameController;
import controller.KeyboardManager;
import controller.MouseManager;

public class GameWindow extends JFrame {
	
	/**
	 * All classes will have the same version so as to keep consistency within all classes.
	 */
	private static final long serialVersionUID = Constants.serialVersionUID;

	public GameWindow () {
		super();
		init();
	}
	
	private void init() {
		setBackground(Color.BLACK);
		addKeyListener (KeyboardManager.keyboardListener);
		addMouseListener (MouseManager.mouseListener);
		setSize(Constants.WINDOW_HEIGHT, Constants.WINDOW_WIDTH);
	}	
}
