package com.joe.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/sources/applicationContext.xml");
		// Animal animal = (Animal) context.getBean("animal");
		// animal.say();
		// Animal animal =(Animal) context.getBean("cat");
		new Cat().say();
	}

}
