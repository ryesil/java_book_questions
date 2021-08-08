package chapter11exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws IOException{
	File file=new File("scores.txt");

	if(file.exists()) {
		System.out.println("File already exists");
		System.exit(1);
	}
	
	//create a file
	PrintWriter output=new PrintWriter(file);
	
	//write formatted output to the file
	output.print("John T. Smith ");
	output.println(90);
	output.print("Mehmet Coskun ");
	output.print(80);
	output.close();
	}

}
