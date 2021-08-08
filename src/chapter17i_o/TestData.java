package chapter17i_o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestData {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

		
		try(DataOutputStream output=
				new DataOutputStream(new FileOutputStream("temp.dat"))){
			
			
			
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(DataInputStream input=new DataInputStream(new FileInputStream("temp.dat"))){
			System.out.println(input.readUTF()+" "+ input.readDouble());
			System.out.println(input.readUTF()+" "+input.readDouble());
			System.out.println(input.readUTF()+" "+input.readDouble());
			
			
			
			
			
		}
	}

}
