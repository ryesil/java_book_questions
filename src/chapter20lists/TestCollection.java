package chapter20lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestCollection {

	public static void main(String[] args) {
		
		
	ArrayList<String> collection1=new ArrayList<>();
	collection1.add("New York");
	collection1.add("Atlanta");
	collection1.add("Dallas");
	collection1.add("Madison");
	System.out.println(collection1);
	System.out.println(collection1.contains("New York"));
	ArrayList<String> collection2=(ArrayList<String>) collection1.clone();
	
	Collections.sort(collection1, new Comparator<String>(){
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
		
	});
	
	System.out.println(collection1);
	
	
		
	}
	
	
	
	
	
}
