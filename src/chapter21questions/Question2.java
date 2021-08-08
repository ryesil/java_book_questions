package chapter21questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question2 {
public static void main(String[] args) {
	String[] names=new String[] {"Ahmet A","Ahmet A","Ahmet V", "Ramazan Yesil","Ramazan Yesil","Zuleyha yesil","Zeynep yesil"};
	Set<String> set1=new LinkedHashSet<>();
	try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Names.bin"))) {
		System.out.println("File is writing....");
		os.writeObject(names);
		os.writeObject("File has written.");
	
	} catch (IOException e) {
		System.out.println("File not found!");
		e.printStackTrace();
	}
	
	try(ObjectInputStream as=new ObjectInputStream(new FileInputStream("Names.bin"))) {
		System.out.println("File is reading...");
		
		
		String[] str=(String[]) as.readObject();
		System.out.println(Arrays.toString(str));
		Collections.addAll(set1, str);
		System.out.println(set1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("OrderedNames.bin"))){
		System.out.println("set1 is writing...");
		os.writeObject("List of the Students who attended the course at least once");
		os.writeObject(set1);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("OrderedNames.bin"))){
		String title=(String) os.readObject();
		Set<String> orderedSet1=(Set<String>) os.readObject();
		System.out.println(title);
		System.out.println(orderedSet1);
		
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
	
	
}
}
