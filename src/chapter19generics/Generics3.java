package chapter19generics;

import java.util.Arrays;

public class Generics3<E> {
private E array[];

Generics3(int size){
	this.array=(E[]) new Object[size];
}


public int getSize() {
	return array.length;
}

public E peek() {
	return array[getSize()-1];
}

public E pop() {
E o=peek();	
E[] e2=(E[]) new Object[getSize()-1];
System.arraycopy(array, 0, e2, 0, e2.length);
array=e2;
return o;
}


public void push(E o) {
if(peek()==null) {
array[array.length-1]=o;
} else if(array[0]==null) {
for(int i=0;i<getSize()-1;i++) {
		array[i]=array[i+1];
	}
	array[getSize()-1]=o;
} else {
	E[] array2=(E[])new Object[getSize()+1];
	System.arraycopy(array, 0, array2, 0, getSize());
	array2[array2.length-1]=o;
	array=array2;
}
}

public boolean isEmpty() {
	return getSize()==0;
}


@Override
public String toString() {
	return Arrays.toString(array);
}






}
