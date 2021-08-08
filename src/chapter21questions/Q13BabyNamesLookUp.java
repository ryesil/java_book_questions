package chapter21questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q13BabyNamesLookUp {
public static void main(String[] args) {
	
	
popularNames();	
	
	
}
public static void popularNames() {
	Scanner in=new Scanner(System.in);
	List<String[]> directory=new ArrayList<>();
	System.out.println("Enter year...");
	int year=in.nextInt();
	System.out.println("Please Enter Gender (M/F)");
	char gender=in.next().toUpperCase().charAt(0);
	System.out.println("Enter a name");
	String name=in.next();
	name=name.toUpperCase().charAt(0)+name.substring(1);
	//System.out.println(name);
	try(BufferedReader br=new BufferedReader(new FileReader(("\\\\PDC\\FolderRedirectionStaff$\\yesil\\Desktop\\baby_Names\\yob"+year+".txt")))){
		String line;
		while((line=br.readLine())!=null) {
			String str[]=line.split(",");
			directory.add(str);
		}
		boolean isExist=false;
		int rank=0;
	Collections.sort(directory,new Itt());
	for(int i=0;i<directory.size();i++) {
		//System.out.println(directory.get(i)[0]);
		if(name.equals((String)directory.get(i)[0])&&gender==directory.get(i)[1].charAt(0)) {
			isExist=true;
			rank=i;
			
		}
	}
	if(isExist) {
		System.out.println((gender=='M'?"Male":"Female")+" name "+ name+" is ranked #"+(rank+1)+" in year "+year);
	}else {
		System.out.println("Wrong entry...");
	}
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Would you like to look up another name? (Y/N)");
		char decision=in.next().toUpperCase().charAt(0);
		if(decision=='Y') {
			TimeUnit.SECONDS.sleep(1);
			popularNames();
		}else {
			in.close();
			System.exit(1);
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
class Itt implements Comparator<String[]>{

	@Override
	public int compare(String[] o1, String[] o2) {
	if(Integer.parseInt(o1[2])>Integer.parseInt(o2[2])) {
		return -1;
	}else if(Integer.parseInt(o1[2])<Integer.parseInt(o2[2])) {
		return 1;
	}else {
		return 0;
	}
		
	}

	
}
