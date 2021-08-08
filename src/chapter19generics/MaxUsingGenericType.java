package chapter19generics;

public class MaxUsingGenericType {
	
public static void main(String[] args) {
	

	
	
//System.out.println(max(4,"ALi"));	
System.out.println(max("ALi","Beli"));
	
}
	
	
	
	
//Return the max of two objects
public static <E extends Comparable<E>> E max(E o1,E o2) {
	
if(o1.compareTo(o2)>0) {
	return o1;
} else {
	return o2;
}	
}
}
