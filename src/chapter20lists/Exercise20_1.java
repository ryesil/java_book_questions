package chapter20lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Exercise20_1 {
public static void main(String[] args) {
	
display();
}
public static void display() {
	List<String> list=new ArrayList<>();
try(BufferedReader br=new BufferedReader(
		new FileReader("States.txt"))) {
	String line="";
	while((line=br.readLine())!=null) {
		String str[]=line.split(", ");//Alabama montgomery
		Collections.addAll(list,str);
	}
	list.sort(new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	});
	ListIterator it=list.listIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//	}
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	
	

	
}
	
}
