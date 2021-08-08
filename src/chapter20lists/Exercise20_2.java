package chapter20lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;


class Student implements Comparable<Student>, Comparator<Student>, Iterator<Student>{
String name;
public Student(String name) {
	this.name=name;
}
	@Override
	public int compareTo(Student o) {
	
		return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(name.length(),o2.name.length());
	}
	
	@Override
	public boolean hasNext() {
		
		return true;
	}
	@Override
	public Student next() {
		
		return null;
	}

	

}

public class Exercise20_2 {

	public static void main(String[] args) {
		
		
	Student s1=new Student("Ahmetasdas");
	Student s2=new Student("Mehmet");
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compare(s1, s2));
	List<String> list=new ArrayList<>();
	
	
		
		
		

	}
	
	
	
	
	
	
	
	public static void shuffle() throws FileNotFoundException {
		
	BufferedReader br=new BufferedReader(new FileReader(""));

	}
	public static void primer(int num){
		List<Integer> list=new ArrayList<>();
		
		int count =0;
		for(int i=num+1;;i++) {
			int divisors=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					divisors++;
				}
			}
			if(divisors==2) {
				list.add(i);
				count++;
			}
			if(count==10) {
				break;
			}
		}
		System.out.println(list);

		}

}
