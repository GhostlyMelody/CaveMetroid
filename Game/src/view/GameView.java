package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import controller.GameController;

public class GameView extends JPanel {

	/**
	 * All classes will have the same version so as to keep consistency within all classes.
	 */
	private static final long serialVersionUID = Constants.serialVersionUID;
	
	private GameController controller;
	
	private Frame currFrame;
	
	public GameView () {
		controller = null;
		
		currFrame = new Frame();
		setPreferredSize(new Dimension(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT));
	}
	
	@Override
	public synchronized void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g = (Graphics2D) g1;
		
		g.drawImage(currFrame.getFrameImage(), null, 0, 0);
	}
	
	public int width() {
		return getWidth();
	}
	public int height() {
		return getHeight();
	}

	public void setController(GameController gameController) {
		controller = gameController;
	}

	public synchronized void setFrame(Frame frame) {
		currFrame = frame;
	}
}
