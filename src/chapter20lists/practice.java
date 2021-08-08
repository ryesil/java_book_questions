package chapter20lists;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class practice {
public static void main(String[] args) {
	
	//writer(states);
	capitalFinder();
}
public static void capitalFinder() {
	Map<String,String> map=reader();
	Scanner input=new Scanner(System.in);
	System.out.println("State?");
	
	String state=input.nextLine();// North Dacota/ Minnesota
	if(map.get(state.toLowerCase())!=null) {
	System.out.println("The Capitol of "+state+" is " +map.get(state.toLowerCase())); 
	} else {
		throw new IllegalArgumentException("Wrong entry");
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Do you want to look up another capital? (Y/N)");
	char answer=input.next().toLowerCase().charAt(0);
	if(answer=='y') {
		capitalFinder();
	}else {
		System.out.println("See you later...");
		System.exit(1);
	}
}



public static Map<String,String> reader() {
	Map<String,String> map=new HashMap<>();
	
	try(BufferedReader bf=new BufferedReader(new FileReader("States.txt"))){
		long start=System.currentTimeMillis();
		String line="";
		while((line=bf.readLine())!=null) {
		String state[]=line.split(", "); //state[]={capitol,state};
		map.put(state[1].toLowerCase(), state[0]);
		}
		System.out.println("File written..");
		System.out.println(System.currentTimeMillis()-start);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return map;
	
}


public static void writer(String str) {
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("States.txt"))){
		System.out.println("File is writing....");
		bw.write(str);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
