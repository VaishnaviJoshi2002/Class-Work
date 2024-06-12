//WAP to search given student name is available in the list of student name using String array.
package com.string;

public class StringList {
	
	public static void main(String[] args)
	{
		//String array Student list.
		String[] listName={"Ram","Sita","Krishna","Radha"};
		String name="Sita";
		//boolean value set as false.
		boolean found=false;
		
		for(int i=0; i<listName.length; i++)
		{
			if(listName[i]==name)
				//checking given name is in the array String or not.
			{
				found=true;
				break;
			}
			
		}
		System.out.println("Student name is: " +name);
		if(found)
			//if found is true, if block will executed.
		{
			System.out.println("This Student is present in the List: " +name);
		}
		// when condition is false, else block is executed.
		else 
		{
			System.out.println("This Student is not present in the List: " +name);
		}
			
	}
}
