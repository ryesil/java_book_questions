package chapter20lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Iterators {

public static void main(String[] args) {
	
	
Collection<String> collection=new ArrayList<>();

collection.add("New York");
collection.add("Atlanta");
collection.add("Dallas");
collection.add("Madison");


Iterator<String> it=collection.iterator();

//while(it.hasNext()) {
//	if(it.next()=="Dallas") {
//		it.remove();
//	}
//	System.out.println(it.next());
//}

List<Integer> list1=new ArrayList<>();
list1.add(1);
list1.add(2);
list1.add(3);


ListIterator<Integer> it1=list1.listIterator();	

	while(it1.hasNext()) {
		System.out.println(it1.next());
		it1.add(4);
	}
	System.out.println(list1);
}	
	
}
