package chapter17i_o;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		try(
		ObjectOutputStream output=
		new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("object.dat")))	
				){
			output.writeUTF("john");
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
	
		}
		
		
		

	}

}
