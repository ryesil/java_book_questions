package chapter10questions;

public class Checking extends Account {
private double overDraftLimit=500;


public Checking() {
	
}

public Checking(double balance) {
	super(balance);
}
public double withdraw(double withdraw) {
	if(withdraw>=0&&(this.getBalance()-withdraw)>=-1*this.overDraftLimit) {
		double newBalance=this.getBalance()-withdraw;
		this.setBalance(this.getBalance()-withdraw);
	}
	return this.getBalance();
}
//public double withdraw(double withdraw) {
//	if(withdraw>=0&&(super.getBalance()-withdraw)>=-1*this.overDraftLimit) {
//		
//	}
//	return this.getBalance();
//}

}
