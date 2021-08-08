package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question23_1 {
public static void main(String[] args) {
Integer list1[]= {3,4,5,1,2,-2,-9,0,2};	
String[] list2= {"String","bubbke","asdw","orange"};
bubbleSort(list1);
bubbleSort(list2);
	
}
public static <E extends Comparable<E>> void bubbleSort(E[] list){

	boolean nextPass=true;
	
	
	for(int k=1;k<list.length&&nextPass;k++) {
		nextPass=false;
	for(int i=0;i<list.length-k;i++) {
		if(list[i].compareTo(list[i+1])>0) {
			E temp=list[i];
			list[i]=list[i+1];
			list[i+1]=temp;
			nextPass=true;
		}
	}
	
	
	
}
System.out.println(Arrays.toString(list));	
	
}

	
}
