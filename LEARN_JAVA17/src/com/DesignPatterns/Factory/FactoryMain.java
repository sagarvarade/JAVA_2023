package com.DesignPatterns.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		Shape sqr=ShapeFactory.getShape("square");
		sqr.drawShape();
		
		Shape rec=ShapeFactory.getShape("rectangle");
		rec.drawShape();
	}

}
