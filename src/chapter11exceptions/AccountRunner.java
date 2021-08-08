package chapter11exceptions;

public class AccountRunner {

	public static void main(String[] args) {
	Account acc1=new Account();
	System.out.println(acc1.getBalance());
	acc1.deposit(100);
	System.out.println(acc1.getBalance());
		acc1.withdraw(15);
	System.out.println(acc1.getBalance());
	
	System.out.println(acc1.getTransactions());

	
	
	
	
	
	}

}
