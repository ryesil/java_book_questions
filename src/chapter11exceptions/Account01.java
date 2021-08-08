package chapter11exceptions;

import java.time.LocalDate;

public class Account01 {
private int accountNumber;
private double balance;
private static double annualInterestRate;
public LocalDate dateCreated;

public Account01() {
	dateCreated=LocalDate.now();
}

public Account01(int accountNumber, double balance, LocalDate dateCreated) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.dateCreated = dateCreated;
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public static double getAnnualInterestRate() {
	return annualInterestRate;
}

public static void setAnnualInterestRate(double annualInterestRate) {
	Account01.annualInterestRate = annualInterestRate;
}

public LocalDate getDateCreated() {
	return dateCreated;
}

public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}

public double withdraw(double amount) {
	if(amount<=balance)
	balance=balance-amount;
	
	return balance;
}
public double deposit(double amount) {
	balance=balance+amount;
	return balance;
}

}
