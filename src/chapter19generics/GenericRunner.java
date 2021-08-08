package chapter19generics;

import java.util.HashMap;

import chapter13.Circle;

public class GenericRunner {
	public static void main(String[] args) {

//		GenericStack<String> stack = new GenericStack<>();
//		stack.push("Asd");
//
//		print(new String[] { "Ali", "vlei" });
//		print(new Integer[] { 1, 2, 2, 33, 4, 5 });
//		Circle c1=new Circle();
//		Circle c2=new Circle();
//		c1.setColor("W");
//		c2.setColor("W");
//		print2(c1,c2);
//		System.out.println(isEqual(c1,c2));
		
	
//		Generics3<Integer> as=new Generics3<>(3);
//System.out.println(as.getSize());
//as.push(12);
//		System.out.println(as);
//		//System.out.println(as.peek()==null);
//		as.push(10);
//		System.out.println(as);
//		as.push(9);
//		System.out.println(as);
//		as.push(8);
//		System.out.println(as);
//		as.pop();
//		as.pop();
//		
//		as.pop();
//		as.pop();
//		
//		System.out.println(as.getSize());
//	}
//		
//		
//		Exercise19_2<String> list=new Exercise19_2<>();
//		list.add("Ali");
//		list.add("Veli");
//		list.add("macit");
//		list.add("kenam");
//		list.add("murat");
//		list.add("ramazan");
//		list.add("treas");
//		list.sort(new Comparator<>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareToIgnoreCase(o1);
//			}
//			
//		});
//		
//		System.out.println(list);
//		System.out.println(reverser(list));

		Pair<String> x=new Pair<>();
		x.put("Ramazan","Yesil");
		System.out.println(x);
		String[] countries= {"Nigeria","India","USA"};
		Integer[] scores= {22,46,66,92};
		String[] names= {"John", "James","Daniel"};
		var xx=new Pair2<String>("Ramazan","Yesil");
		Pair2.smallestt(xx);
		//System.out.println(xx);
		
		Pair2<Integer> xxx=new Pair2<Integer>(-5,3);
		
		Pair2.smallest(xxx);
		
		
		var a= new String[]{"asd","asd","awe"};
		var store1=new Store<>(countries);
		var store2=new Store<>(scores);
		var store3=new Store<>(names);
		
		store1.greaterThan(store3);
		store1.greaterThan(store2);
		
	}
	
	
	
	
public static Exercise19_2<String> reverser(Exercise19_2<String> str){
	for(String w:str) {
	String	x=new StringBuilder(w).reverse().toString();
		str.set(str.indexOf(w), x);
	}
	
	System.out.println(str);
	return str;
}
	
	
	
public static <E extends Circle> boolean isEqual(Circle o1,Circle o2){
	return o1.getColor().equals(o2.getColor());
}

public static <E> void print2(E... o) {
	for(E w:o) {
		System.out.println(w);
	}
}
	public static <E> void print(E[] o) {
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}
}

class KeyboardException extends Exception{
	
	public KeyboardException(String message) {
		super(message);
	}
}
class KeyException extends RuntimeException{
	
	public KeyException(String message) {
		super(message);
	}
}
class KeyMException extends RuntimeException{
	public KeyMException(String message) {
		super(message);
	}
}
