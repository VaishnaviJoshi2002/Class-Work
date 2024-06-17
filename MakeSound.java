package com.javaconcepts;

 class Animal {

	public void sound()
	{
		System.out.println("sound of animals:");
	}

}
 class MakeSound extends Animal{
	 
	 public void sound()
	 {
		 System.out.println("sound of cat: meow meow..");
	 }
	 
	 
	public static void main(String args[])
	{
		Animal ob=new Animal();
		ob.sound();
		MakeSound obj=new MakeSound();
		obj.sound();
		
	}
}
