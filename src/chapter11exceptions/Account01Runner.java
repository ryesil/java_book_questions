package chapter11exceptions;

import chapter10questions.Checking;

public class Account01Runner {

	public static void main(String[] args) {
	Account01 acc1=new Account01();
	SavingsAccount saving=new SavingsAccount();
	CheckingAccout checking=new CheckingAccout();

	double deposit= checking.deposit(100);
	System.out.println(deposit);
	double withdraw = checking.withdraw(150);
	System.out.println(checking.getBalance());
	
	
	}

}
