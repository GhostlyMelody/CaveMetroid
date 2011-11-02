package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseManager {
	public static final MouseAdapter mouseListener = new MouseAdapter () {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e);
		}
	};
	
	private MouseState currentState;
	private MouseState previousState;
	
	public void update() {
		previousState = currentState;
		currentState = currentState.clone();
	}
}
