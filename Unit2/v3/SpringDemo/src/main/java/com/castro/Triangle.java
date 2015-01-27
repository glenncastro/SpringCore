package com.castro;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
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

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.printf("ApplicationContext is %s%n", context);
		this.context = context;
	}

	public void setBeanName(String beanName) {
		System.out.printf("Bean name is %s%n", beanName);
	}
}
