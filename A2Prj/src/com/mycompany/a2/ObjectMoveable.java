package com.mycompany.a2;

abstract class ObjectMoveable extends GameObject implements Moveable {
	//from GameObject
	//float xPoint, float yPoint, int color
	//
	private int speed;
	private int direction;
	
	public ObjectMoveable() {
			
	}
	
	//returns protected member direction
	public int getDirection() {
		return direction;
	}
	
	
	//returns protected member speed
	public int getSpeed() {
		return speed;
	}
	
	public void move() {
		
	}
	
	public void setSpeed(int newSpeed) {
		speed =newSpeed;
	}
	
	public void setDirection(int newDirection) {
		direction = newDirection;
	}
}
