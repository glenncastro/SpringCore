package com.castro;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.printf("Point A = (%s, %s)%n", getPointA().getX(), getPointA().getY());
		System.out.printf("Point B = (%s, %s)%n", getPointB().getX(), getPointB().getY());
		System.out.printf("Point C = (%s, %s)%n", getPointC().getX(), getPointC().getY());
	}
}
