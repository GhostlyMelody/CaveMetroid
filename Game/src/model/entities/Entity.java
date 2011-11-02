package model.entities;

import model.Position;
import model.Sprite;


public interface Entity {
	public Position getPosition();
	
	public void update(double timeElapsedInSecs);

	public Sprite getSprite();
	
	public Entity clone();
}