package chapter11inheritanceandpolymorphisims;

public class Question8Runner {
public static void main(String[] args) {
	Question8Account acc1=new Question8Account("Ahmet",000007,1200);
	
	acc1.deposit(40);;
	acc1.deposit(10);;
	acc1.deposit(100);
	acc1.withdraw(10);
	acc1.withdraw(14);;
	acc1.withdraw(22);
	
	System.out.println(acc1.getTransactions());
	
	
	
	
	
}
}
