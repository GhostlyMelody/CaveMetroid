package model.entities;

import java.awt.Font;

import model.Constants;
import model.Position;
import model.Sprite;

public class TextBox implements Entity {

	private Position myPosition;
	private String myText;
	private int myMaxWidth;
	private Font myFont;
	private Sprite mySprite;
	
	public TextBox (Position position, String containedValue) {
		myPosition = position;
		myText = containedValue;
		myMaxWidth = Integer.MAX_VALUE;
		myFont = Constants.DEFAULT_TEXT_FONT;
		
		generateSprite();
	}
	
	public TextBox (Position position, String containedValue, int maxWidth, Font font) {
		myPosition = position;
		myText = containedValue;
		myMaxWidth = maxWidth;
		myFont = font;
		
		generateSprite();
	}

	@Override
	public Position getPosition() {
		return myPosition;
	}
	
	private void generateSprite() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(long timeElapsed) {
		
	}

	@Override
	public Sprite getSprite() {
		return mySprite;
	}

	
	@Override
	public TextBox clone() {
		return new TextBox (myPosition, myText, myMaxWidth, myFont);
	}	
}