package chapter11inheritanceandpolymorphisims;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Loan{
	
}
class Date{
	
}
class Circle{
	
}
public class Question6 {
public static void main(String[] args) {
	
	Loan loan=new Loan();
	Date date=new Date();
	Circle circle=new Circle();
	
	List<Object> list=new ArrayList<>();
	List<String> str=new LinkedList<>();
	
	list.add(circle);
	list.add(date);
	list.add(loan);
	
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	
}
}
