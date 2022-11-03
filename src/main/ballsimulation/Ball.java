package ballsimulation;

import java.awt.Color;

public class Ball {
	private int x, y, r;
	private Color color;

	public Ball(int x, int y, int r, Color color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public Color getColor() {
		return color;
	}

	public void move(int offsetX, int offsetY) {
		this.x += offsetX;
		this.y += offsetY;
	}

	public void changeRadius(int offsetR) {
		this.r += offsetR;
	}

	public void changeColor(Color color) {
		this.color = color;
	}
}
