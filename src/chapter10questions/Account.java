package chapter10questions;

import java.util.Date;


public class Account {

private int accountNumber;
private double balance;
private double annualInterestRate;
private static int count=1;
private Date date=new Date();





public double deposit(double deposit) {
	if(deposit>=0) {
		this.balance+=deposit;
	}
	return balance;
}
	
public double withdraw(double withdraw) {
	if(withdraw>=0&&(balance-withdraw)>=0) {
		this.balance-=withdraw;
	}
	return balance;
}
public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public Date getDate() {
	return date;
}



public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Account() {
	this.balance=100;
	this.accountNumber=count++;
}
public Account(double balance) {
	this.balance=balance;
	count++;
}


	
	
}
