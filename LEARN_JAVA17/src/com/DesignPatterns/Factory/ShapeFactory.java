package com.DesignPatterns.Factory;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		if(shape==null) return null;
		
		Shape sh=switch(shape) {
			case "square" -> new Square();
			case "rectangle" -> new Rectangle();
			default ->null;
		};
		return sh;
	}
}
