package chapter11exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) {
	File file=new File("ben1.txt");
	System.out.println(file.exists());
	System.out.println("The file has"+file.length()+" bites.");
	System.out.println(file.canRead());	
	System.out.println(file.canWrite());
	System.out.println(file.canExecute());
	System.out.println(file.isAbsolute());
	System.out.println(file.isDirectory());
	System.out.println(file.isFile());
	System.out.println(file.isHidden());
	System.out.println(file.getAbsolutePath());
	System.out.println(new Date(file.lastModified()));
	
	try {
		PrintWriter pw=new PrintWriter(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		

	}

}
