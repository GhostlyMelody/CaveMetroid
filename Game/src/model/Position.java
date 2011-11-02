package model;

/**
 * Immutable Position stores x and y values as integers.
 */
public class Position {
	
	private int x;
	private int y;

	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	// FUNCTIONS
	
	public Position minus(Position topLeftPosition) {
		// TODO Auto-generated method stub
		return new Position (x - topLeftPosition.x, y - topLeftPosition.y);
	}

	public boolean isPositive() {
		return x >= 0 && y >= 0;
	}
}
