package com.castro;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {

	private List<Point> points;
	private ApplicationContext context;
	
	public List<Point> getPoints() {
		return points;
	}
	
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point point: points) {
			System.out.printf("Point = (%s, %s)%n", point.getX(), point.getY());	
		}
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.printf("ApplicationContext is %s%n", context);
		this.context = context;
	}
}
