package chapter11exceptions;

import java.util.Scanner;

public class QuotiontWithMethod {
	
public static int quotient(int num1, int num2) {
		
		if(num2==0) {
			System.out.println("divisor cannot be zero");
			System.exit(1);
		}
	return num1/num2;
		
	}
public static int quotient2(int num1,int num2) {
	if(num2==0) {
		throw new ArithmeticException("Divisor cannot be zero");
	}
		return num1/num2;
	}
	
	
	

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	
	//Prompt the user to enter two integers
	System.out.println("Enter two integers");
	int num1=input.nextInt();
	int num2=input.nextInt();
	try {
	int result=quotient2(num1,num2);
	System.out.println(num1+" / "+num2+" = "+result);
	} 
	catch(ArithmeticException ex) {
		System.out.println("Exception second number must be an integer");
	}
	System.out.println("Program continues...");
	
	
	
	
}
	
	
	
}
