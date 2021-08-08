package chapter17i_o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetectEndOfFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
try(
	DataOutputStream output=
	new DataOutputStream(new FileOutputStream("test.dat"))){
	
	output.writeDouble(4.5);
	output.writeDouble(43.25);
	output.writeDouble(3.2);
}

try(
DataInputStream input=new DataInputStream(new FileInputStream("test.dat"))){
	
while(true) {
	System.out.println(input.readDouble());
}
	
} catch(EOFException e) {
	System.out.println("");
}



	}

}
