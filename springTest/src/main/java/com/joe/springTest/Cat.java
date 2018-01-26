package com.joe.springTest;

public class Cat implements Animal {

	private String name;

	public void say() {
		System.out.println("fuck spring");
		System.out.println(name);
	}

	public void setPojo(Pojo pojo) {
		this.name = pojo.name;
	}

	public void  what(){
		
	}
}
