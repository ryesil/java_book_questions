package chapter17i_o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	
	
file();	

	
	
}
public static void file() throws FileNotFoundException, IOException {
	List<Integer> arr=new ArrayList<>();
	try(ObjectOutputStream os=new ObjectOutputStream(
					new FileOutputStream("Exercise17_02.dat"))){
		
			for(int i=0;i<150;i++) {
				os.writeInt(i);
			}
		
	}
	
	try(ObjectInputStream os=new ObjectInputStream(
					new FileInputStream("Exercise17_02.dat"))){
		int i=0;
		while((i=os.read())!=-1) {
			arr.add(os.read());
			
		}
		
		
	}
	
	System.out.println(arr);
	
}
	
	
}
