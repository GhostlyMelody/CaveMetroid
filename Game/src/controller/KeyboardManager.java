package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardManager {
	
	private KeyState currentState;
	private KeyState previousState;
	
	public void update() {
		previousState = currentState;
		currentState = currentState.clone();
	}
	
	public static final KeyAdapter keyboardListener = new KeyAdapter () {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar());
		}
	};
}