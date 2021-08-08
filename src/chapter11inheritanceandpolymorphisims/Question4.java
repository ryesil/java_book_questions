package chapter11inheritanceandpolymorphisims;

import java.util.ArrayList;
import java.util.Collections;

public class Question4 {
public static void main(String[] args) {
	
	
	
	
	
}
public static Integer max(ArrayList<Integer> list) {
	Collections.sort(list);;
	if(list.size()==0) {
		return 0;
	}else {
		return list.get(list.size()-1);
	}
	
	
	
}
}
