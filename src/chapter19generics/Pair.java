package chapter19generics;

import java.util.HashMap;
import java.util.Map;

public class Pair<E> {
private E e1;
private E e2;
private Map<E,E> map;


public Pair() {
	map=new HashMap<>();
}
public Pair(Map<E,E> map) {
	this.map=map;
}
public void put(E e1,E e2) {
	map.put(e1, e2);
}
public E pop(E e1) {
	return map.remove(e1);
	
}

@Override
public String toString() {
	return "Pair [map=" + map + "]";
}

	
}
