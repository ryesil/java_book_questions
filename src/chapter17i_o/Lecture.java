package chapter17i_o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter output=new PrintWriter("temp");
	output.print("I am Ramazan Yesil. And I am determined to become a"
			+ "developer.");
	output.println();
	output.print("So I know what it takes to be a developer.");
	output.println();
	output.print(new char[] {'j','a','v','a'});
	output.close();
	Scanner input=new Scanner(new File("temp"));
	
	while(input.hasNext()) {
	System.out.println(input.nextLine());
	}
	
}
	
	
}
