package com.castro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle1 = (Triangle) context.getBean("triangle1");
		triangle1.draw();
		
		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		triangle2.draw();
	}
}
