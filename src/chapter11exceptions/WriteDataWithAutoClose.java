package chapter11exceptions;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteDataWithAutoClose {

	public static void main(String[] args) throws Exception {
	
		File file=new File("scores.text");
		if(file.exists()) {
			System.out.println("The file already exists.");
//			System.exit(0);
		}
		
		try (
			//Creates a file
		PrintWriter output=new PrintWriter(file);//declare and create resource
		){
			output.print("Ahmet ALi ");
			output.println(90);
			output.print("Ramazan Yesil");
			output.println(72);
		}
		
		Scanner input=new Scanner(file);
		while(input.hasNext()) {
		System.out.println(input.nextLine());
		}
		
	}

	}


