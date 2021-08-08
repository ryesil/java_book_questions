package chapter17i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	
	try(FileOutputStream output=new FileOutputStream("ben")){
		for(int i=1;i<10;i++) {
			output.write(i);
		}
	
		try(FileInputStream input=new FileInputStream("ben")){
			int value;
			while((value=input.read())!=-1) {
				System.out.print(value+" ");
			}
			
			
		}
		
	}
			
			
}
}
