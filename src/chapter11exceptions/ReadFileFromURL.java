package chapter11exceptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
public static void main(String[] args) {
System.out.println("Enter an URL");
String URLString=new Scanner(System.in).next();

try {
	URL ur=new URL(URLString);
	int count=0;
	Scanner input=new Scanner(ur.openStream());
	while(input.hasNext()) {
		String line=input.nextLine();
		count+=line.length();
		System.out.println(line);
	}
}
	catch(MalformedURLException ex) {
		System.out.println("Invalid URL");
	}
	catch(IOException ex) {
		System.out.println("I/O Error: No such file");
	}
}
}

