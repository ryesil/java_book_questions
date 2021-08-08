package chapter11inheritanceandpolymorphisims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question7 {
public static void main(String[] args) {
List<Integer> list=new ArrayList<>();
list.add(12);
list.add(2);
list.add(5);
list.add(88);
	
System.out.println(shuffle(list));	
	
	
}
public static List<Integer> shuffle(List<Integer> list){
	
	Collections.shuffle(list);
	return list;
	
	
}
}
