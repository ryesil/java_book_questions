package chapter17i_o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
 If you use for example length() method for "null" String object, you will get 
 NullPointerException
 2) NullPointerException is an unchecked exception
 3) If there is no parent child relationships between exception classes 
 the order of catch-blocks is not important.
 */
public class Question03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
//sum();	
summ();		

	}
	public static double summ() throws FileNotFoundException, IOException {
		List<Double> list=new ArrayList<>();
		double i=0;
		try(DataInputStream os=new DataInputStream(new FileInputStream("Exercise17_03"))){
		while(true) {
			double a=os.readDouble();
			list.add(a);
			i+=a;
			
		}
		
			

		}catch(EOFException e) {
			
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(i);
		return i;
	}
	
	
	public static void sum() throws FileNotFoundException, IOException {
	
		try(DataOutputStream fs=new DataOutputStream(new FileOutputStream("Exercise17_03"))){
		for(int i=0;i<100;i++) {
			Double x=Math.random()*1010;
			fs.writeDouble(x);
		
		}
		}
	
	}

}
