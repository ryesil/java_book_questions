package chapter19generics;

import java.util.Arrays;
import java.util.Collections;

public class GenericSort {
public static void main(String[] args) {
	

Integer[] intArr= {2,4,3};
Double[]	doubleArr= {3.4,1.3,-22.1};
Character[] charArr= {'a','J','r'};
String[] stringArr= {"Tom","Susan","Kim"};

sort(intArr);
sort(doubleArr);
sort(charArr);
sort(stringArr);

 printList(intArr);
 printList(doubleArr);
	
}
public static <E extends Comparable<E>> void sort(E[] intArr) {
 E currentMin;
 int currentMinIndex;

 for (int i = 0; i < intArr.length - 1; i++) {
 // Find the minimum in the list[i+1..list.length−2]
 currentMin = intArr[i];
 currentMinIndex = i;

 for (int j = i + 1; j < intArr.length; j++) {
 if (currentMin.compareTo(intArr[j]) > 0) {
 currentMin = intArr[j];
 currentMinIndex = j;
 }
 }

 // Swap list[i] with list[currentMinIndex] if necessary;
 if (currentMinIndex != i) {
 intArr[currentMinIndex] = intArr[i];
 intArr[i] = currentMin;
 }
 }
 }

 /** Print an array of objects */
 public static void printList(Object[] list) {
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");
 System.out.println();
 }
 }

