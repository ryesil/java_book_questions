package chapter10questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1114CombineTwoLists {
public static void main(String[] args) {
	
	
	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list2.add(3);
	list2.add(4);
	
	union(list1,list2);
	
	
}
public static List<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
	
	List<Integer> store=new ArrayList<>(list1);
	for(int i=0;i<list2.size();i++) {
	store.add(list2.get(i));
	}
	System.out.println(store);
	return store;
}

}
