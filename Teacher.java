package com.abstrationconcepts;

public class Teacher implements Person {

	

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Hello Teachers...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj=new Teacher();
		obj.speak();
	}

}
