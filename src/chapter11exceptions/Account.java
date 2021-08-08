package chapter11exceptions;
import java.time.LocalDate;
import java.util.ArrayList;

class Transaction{
public LocalDate  transactionTime;
private char type;
private double amount;
private double balance;
private String description;

public Transaction() {
this.transactionTime=LocalDate.now();	
}
public char getType() {
	return type;
}
public double getAmount() {
	return amount;
}
public double getBalance() {
	return balance;
}
public String getDescription() {
	return description;
}
public Transaction(char type, double amount, double balance, String description) {
this.type=type;
this.amount=amount;
this.balance=balance;
this.description=description;
this.transactionTime=LocalDate.now();
}

public LocalDate getTransactionTime() {
	return transactionTime;
}

}

public class Account {
	private String name;
	private int id;
	private double balance=100;
	private ArrayList<Transaction>  transactions;
	
	public Account() {
		this.transactions=new ArrayList<>();
	}

	
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public String getTransactions() {
		String info="";
		for(int i=0;i<transactions.size();i++) {
			info+=""+transactions.get(i).getType()+" ; "+transactions.get(i).getAmount()+
					" ; "+transactions.get(i).getBalance()+" ; "+transactions.get(i).getDescription()+"\n";
			
		}

		return info;
	}

	public void withdraw(double amount) {
		balance= balance-amount;
		Transaction tr=new Transaction('W', amount, balance, "withdraw");
		transactions.add(tr);
		
	}
	
	public void deposit(double amount) {
		balance= balance+amount;
		Transaction tr=new Transaction('D', amount, balance, "deposit");
		this.transactions.add(tr);
	}



}




