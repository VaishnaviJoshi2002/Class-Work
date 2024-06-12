package com.abstrationconcepts;

public class Student implements Person{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Hello Students..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.speak();
	}

}
