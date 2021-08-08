package chapter11inheritanceandpolymorphisims;

import java.time.LocalDate;
import java.util.Scanner;

class Account {
	private int accountNumber;
	private double balance;
	private double annualInterestRate;
	private LocalDate dateCreated;
	private boolean confirm;

	public Account() {
this.dateCreated=LocalDate.now();
	}

	public Account(int accountNumber, double balance, double annualInterestRate) {
		this.accountNumber = accountNumber;
		this.setBalance(balance);
		this.annualInterestRate = annualInterestRate;
		this.dateCreated=LocalDate.now();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public double deposit(double deposit) {
		
			setBalance(getBalance()+deposit);
			return getBalance();
	}
	

	public double withdraw(double withdraw) {
		
			if (withdraw <= balance) {
				return balance=balance - withdraw;
			}
			return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
//*******************************************************************************
class Checking extends Account {
private static double overdraftAmount=100;

public Checking() {
super();	
}

@Override
public double deposit(double deposit) {
	return super.deposit(deposit);
}
@Override
public double withdraw(double withdraw) {
if(withdraw-overdraftAmount<=this.getBalance()) {
		setBalance(getBalance()-withdraw);
}
return getBalance();
}

public Checking(int accountNumber, double balance, double annualInterestRate) {
	super(accountNumber, balance,annualInterestRate);
}
	
}

//**************************************************************************************************************

class Saving extends Account {
public Saving() {
	
}

public Saving(int accountNumber, double balance, double annualInterestRate) {
	super(accountNumber, balance, annualInterestRate);

}


	
}

public class Question3Again {


	public static void main(String[] args) {
Saving save=new Saving();
Account any=new Account();
Checking check=new Checking();
check.withdraw(100);
any.withdraw(100);
save.withdraw(100);
any.deposit(100);
save.deposit(100);
check.deposit(100);
check.withdraw(100);
save.withdraw(101);
System.out.println(check.getBalance()+" checking");
System.out.println(any.getBalance());
System.out.println(save.getBalance()+" saving");

		
		
		
		
	}



}
