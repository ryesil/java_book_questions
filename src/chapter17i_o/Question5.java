package chapter17i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;

public class Question5 {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	
read();	
//obj();	
	
	
}
public static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
	try(ObjectInputStream os=new ObjectInputStream(
			new FileInputStream("Exercise17_05"))){
		int arr[]=(int[]) os.readObject();
		LocalDate date=(LocalDate) os.readObject();
		double doub=os.readDouble();
		System.out.println(Arrays.toString(arr));
		System.out.println(date);
		System.out.println(doub);
	}
}
public static void obj() throws FileNotFoundException, IOException {
	int arr[]= {1,2,3,4,5,6};
	LocalDate date=LocalDate.now();
	double doub=10.5;
try(ObjectOutputStream os=new ObjectOutputStream(
		new FileOutputStream("Exercise17_05"))){
	
	os.writeObject(arr);
	os.writeObject(date);
	os.writeDouble(doub);
	
	
}
}
}
