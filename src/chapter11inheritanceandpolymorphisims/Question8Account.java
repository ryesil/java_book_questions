package chapter11inheritanceandpolymorphisims;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Question8Account{
protected String name;
protected int id;
protected double balance;
protected double annualInterestRate;
protected LocalDate dateCreated;
protected List<Transaction> transactions;

public Question8Account() {
	dateCreated=LocalDate.now();
	transactions=new ArrayList<>();
}

public Question8Account(int id, double balance) {
	this();
	this.id=id;
	this.balance=balance;
}
public Question8Account(String name,int id,double balance) {
	this(id,balance);
	this.name=name;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance=balance;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate=annualInterestRate;
}
public LocalDate getDateCreated() {
	return dateCreated;
}

public double getMonthlyInterestRate() {
	return balance*(annualInterestRate/12)/100;
}

public void withdraw(double amount) {
	balance-=amount;
	transactions.add(new Transaction('W',amount,balance,"withdraw"));

}
public void deposit(double amount) {
	balance+=amount;
	transactions.add(new Transaction('D',amount,balance,"deposit"));
	
}


public String toString() {
	return "Account name: "+name+"\n"+ "Interest rate: "+ annualInterestRate+"\n"+ transactions;
}

public List<Transaction> getTransactions(){
	return new ArrayList<>(transactions);
}


class Transaction{
protected double amount;
protected String description;
protected char type;
protected double balance;
protected LocalDate dateTransaction;
public Transaction(char type, double amount,double balance,String description) {
	this.balance=balance;
	this.type=type;
	this.amount=amount;
	this.description=description;
}
public Transaction() {
	
}
@Override
public String toString() {
	return "Type=> "+ type+"\nAmount=> "+amount+"\nbalance=> "+balance+"\nDescription=> "+description+"\n";
}
}
}




