package chapter21questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Question4 {//Count consanants and vowels
public static void main(String[] args) {
	
	try(BufferedReader br=new BufferedReader(new FileReader(new File("Ben.txt")))) {
		String line;
		while((line=br.readLine())!=null) {
			
			int countVowels=0;
			int countConsonants=0;	
			for(int i=0;i<line.length();i++) {
				if("aeiou".contains(""+line.toLowerCase().charAt(i))) {
					countVowels++;
				}else if(line.charAt(i)!=' ') {
					countConsonants++;
				}
			}
			
			System.out.println(line+": ");
			System.out.print("Consonants: "+countConsonants+" ");
			System.out.print("Vowels: "+countVowels+"\n------------------\n");
			
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	
	
}

}
