package chapter11exceptions;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MisMatchException {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean continueInput=true;
		
		do {
			try {
				System.out.println("Enter an integer");
				int num=input.nextInt();
				System.out.println("The number is: "+num);
				continueInput=false;
			}
			catch(InputMismatchException e){
				System.out.println("Try again (Input must be an integer");
				input.nextLine();
				
			}
		}while(continueInput);
		
		Object o = new Object();
		 String d = (String)o;
		
		
		

	}

}
