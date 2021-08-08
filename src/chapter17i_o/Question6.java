package chapter17i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question6 {

	public static void main(String[] args) {
	
	//writeLoans();
	readLoans();
		
		

	}
	public static void readLoans() {
		Map<String,Loan> map=new LinkedHashMap<>();
	try(ObjectInputStream os=new ObjectInputStream(
			new FileInputStream("Exercise17_06"))){
		
		for(int i=1;i<6;i++) {
			Loan loan=(Loan)os.readObject();
		map.put("loan"+i, loan);
		}
		
//		Loan loan1=(Loan) os.readObject();
//		Loan loan2=(Loan) os.readObject();
//		Loan loan3=(Loan) os.readObject();
//		Loan loan4=(Loan) os.readObject();
//		Loan loan5=(Loan) os.readObject();	

		System.out.println();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(map);
	}
	
	
public static void writeLoans() {
Loan loan1=new Loan();
Loan loan2=new Loan(3,20,198000);
Loan loan3=new Loan(4.75,30,205000);
Loan loan4=new Loan(2.5,20,198000);
Loan loan5=new Loan(2,15,200000);
try(ObjectOutputStream os=new ObjectOutputStream(
		new FileOutputStream("Exercise17_06"))){
	
	os.writeObject(loan1);
	os.writeObject(loan2);
	os.writeObject(loan3);
	os.writeObject(loan4);
	os.writeObject(loan5);
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
	


}
