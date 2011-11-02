package controller;

import model.GameModel;
import model.GameState;
import model.entities.Entity;
import view.Frame;
import view.GameView;

public class GameController implements Runnable {
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view  = view;
		init();
	}

	private void init() {
		model.setController(this);
		view.setController(this);
	}
	
	@Override
	public void run() {
		while (true) {
			
			/*
			 * The controller takes the model information
			 * from the current state and
			 * draws the entities into the
			 * view using the sprite within
			 * each entity.
			 */
			
			GameState currState = model.getState();
			Frame currFrame = generateFrame(currState);
			view.setFrame(currFrame);
			
		}
	}

	private Frame generateFrame(GameState state) {
		Frame f = new Frame();
		
		for (Entity e : state.entities()) {
			System.out.println(e.getClass().getName());
			f.addSprite(e.getPosition(), e.getSprite());
		}
		
		return f;
	}
	
}