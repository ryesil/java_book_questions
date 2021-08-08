package chapter17i_o;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	totalLoan("Exercise17_06");	
		
		
	}
	public static void totalLoan(String fileName) {
	double loanTotal = 0;
try(ObjectInputStream os=new ObjectInputStream(
		
		new FileInputStream(fileName))){
	while(true) {
		Loan loan=(Loan) os.readObject();
		loanTotal+=loan.getLoanAmount();
	}
	

	
	
}
catch(EOFException e) {
	
}catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
System.out.println(loanTotal);
}
}
