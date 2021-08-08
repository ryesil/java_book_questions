package chapter19generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<E> {
private List<E> list=new ArrayList<>();

public GenericStack() {
	
}

public int getSize() {
	return list.size();
}

public E peek(){
	return list.get(getSize()-1);
}

public E pop() {
	return list.remove(getSize()-1);
}

public void push(E e) {
	list.add(e);
}

public boolean isEmpty() {
	return list.isEmpty();
}
@Override
public String toString() {
	return "stack: "+list.toString();
}


}
