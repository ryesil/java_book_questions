package chapter10questions;

public class AccountRunner {
	
public static void main(String[] args) {

Account account1=new Account();
System.out.println(account1.getBalance());
	System.out.println(account1.getAccountNumber());
	System.out.println(account1.withdraw(100));
	System.out.println(account1.withdraw(100));
	Checking checking=new Checking();
	System.out.println(checking.getAccountNumber());
	System.out.println(checking.withdraw(601));
	System.out.println(account1.getDate());
	System.out.println(checking.getDate());
}
}