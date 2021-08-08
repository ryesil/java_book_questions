package chapter21questions;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Question602 {
public static void main(String[] args) {
	String subject="math";
	String day1[]= {"ramazan","sule","kemal","zuleyha"};
	String day2[]= {"kenan","sule","kemal","zuleyha","zeynep"};
	String day3[]= {"ramazan","kenan","sule","kemal","zeynep"};
	String day4[]= {"ramazan","sule","kemal","zuleyha","zeynep"};
	String day5[]= {"ramazan","kenan","sule","kemal","zeynep"};
	String week[][]= {day1,day2,day3,day4,day5};
	String students[]= {"ramazan","kenan","sule","kemal","zuleyha","zeynep"};
	
	Map<String, Integer> attendance=new TreeMap<>();
	
	for(int i=0;i<students.length;i++) {
		String student=students[i];
		int att=0;
		for(int j=0;j<week.length;j++) {
			if(Arrays.toString(week[j]).contains(student)) {
				att++;
			}
		}
		attendance.put(student, att);
	}
	for(String student:attendance.keySet()) {
		
		System.out.println("Student: "+student+": "+attendance.get(student));
		
		System.out.println("--------------------------------------");
		
		
	}
	
	
}
}
