package chapter17i_o;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class TestObjectRead {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	try(ObjectInputStream input=new ObjectInputStream(new BufferedInputStream(
			new FileInputStream("object.dat")))){
		
		String name=input.readUTF();
		double score=input.readDouble();
		java.util.Date date=(Date) input.readObject();
		System.out.println(name);
		System.out.println(score);
		System.out.println(date);
		
	}
	
	
	
}
}
