package com.abstrationconcepts;

public class CheckingAccount implements BankAccount{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("money deposit...");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("money withdraw...");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
		CheckingAccount obj=new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}
}