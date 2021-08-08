package chapter17i_o;

import java.io.Serializable;
import java.time.LocalTime;

public class Loan implements Serializable {

private static final long serialVersionUID = 1L;
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private LocalTime loanDate;

public Loan() {
loanDate=LocalTime.now();
}

public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
	this.annualInterestRate = annualInterestRate;
	this.numberOfYears = numberOfYears;
	this.loanAmount = loanAmount;
	loanDate=LocalTime.now();
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public double getLoanAmount() {
	return loanAmount;
}

public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}

public LocalTime getLoanDate() {
	return loanDate;
}

public void setLoanDate(LocalTime loanDate) {
	this.loanDate = loanDate;
}

public int getNumberOfYears() {
	return numberOfYears;
}

public double getMonthlyPayment() {
double monthlyInterestRate = annualInterestRate / 1200;
double monthlyPayment = loanAmount * monthlyInterestRate / (1-
(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
return monthlyPayment;
}

public double getTotalPayment() {
double totalPayment = getMonthlyPayment() * numberOfYears * 12;
return totalPayment;
}

@Override
public String toString() {
	return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
			+ loanAmount + ", loanDate=" + loanDate + "]";
}
	
	
}
