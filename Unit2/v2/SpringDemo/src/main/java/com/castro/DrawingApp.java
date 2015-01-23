package com.castro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		triangle.getPointA().setX(1);
		triangle.getPointA().setY(1);
		
		Triangle t2 = (Triangle) context.getBean("triangle");
		t2.draw();
	}
}
