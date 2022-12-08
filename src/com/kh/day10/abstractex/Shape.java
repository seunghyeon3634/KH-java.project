package com.kh.day10.abstractex;

// 4. The type line must inplement
// the inherited abstract method Shape.draw()
class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

// 3. The type Shape must be an abstract class
// to define abstract methods
public  abstract class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();
	// 2. Abstract methods do not specify a body
	// can only be defined by an abstract class
	// 1. Abstract methods do not specify a body
}
