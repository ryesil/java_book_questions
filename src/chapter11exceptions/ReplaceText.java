package chapter11exceptions;

import java.io.*;
import java.net.URL;
import java.util.*;
public class ReplaceText {

	public static void main(String[] args) throws Exception {
		
		//Check commandLine parameter usage
//		if(args.length!=4) {
//		System.out.println("Usage: Java ReplaceText sourceFile targetFile oldStr new Str");
//		System.exit(1);
//	}
//		//Check if source file exists
//		File sourceFile=new File(args[0]);
//		if(!sourceFile.exists()) {
//			System.out.println("Source file "+args[0]+" doesn't exist");
//			System.exit(2);
//		}
//		//Check if target file exists
//		File targetFile=new File(args[1]);
//		if(!targetFile.exists()) {
//			System.out.println("Target file "+ args[1]+" doesn't exists");
//			System.exit(3);
//		}
//		
//		try(
//		//Create input and output files
//		Scanner input=new Scanner(sourceFile);
//		PrintWriter output=new PrintWriter(targetFile);
//			){
//			while(input.hasNext()) {
//			String s1=input.nextLine();
//			String s2=s1.replaceAll(args[2],args[3]);
//			output.println(s2);
//			}
//		}
		
		URL ur1= new URL("https://www.amazon.com/Early-Education-Curriculum-Childs-Connection-ebook/dp/B01N9ILPZG/ref=mt_kindle?_encoding=UTF8&me=");
		Scanner input=new Scanner(ur1.openStream());
		
		
	}
}
