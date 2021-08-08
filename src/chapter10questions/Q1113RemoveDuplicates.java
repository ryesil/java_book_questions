package chapter10questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1113RemoveDuplicates {

	public static void main(String[] args) {
		Integer list1[]= {1,2,3,4,2,2,1,1,2,2,1,1,3,4,4,4,3,3,3};//18
		System.out.println(list1.length);
	List<Integer> list=Arrays.asList(list1);
	
		removeDuplicate(list);
ArrayList<Character> list34=new ArrayList<Character>();
	}
public static void removeDuplicate(List<Integer> list) {
	List<Integer> list3=new ArrayList<>();
	
	for(int i=0;i<list.size();i++) {
		boolean isDuplicate=false;
		for(int j=i+1;j<list.size();j++) {
			if(list.get(i)==list.get(j)) {
				isDuplicate=true;
				break;
			}
		}
		if(!isDuplicate) {
			list3.add(list.get(i));
		}
		
	}
	Collections.sort(list3);
	
	System.out.println(list3);
}
}
