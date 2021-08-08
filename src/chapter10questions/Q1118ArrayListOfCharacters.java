package chapter10questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1118ArrayListOfCharacters {

	public static void main(String[] args) {
		
List<Character> list=toCharacterArray("abc");
	System.out.println(list);
	String s="abc";
	char[] arr=s.toCharArray();
	System.out.println(Arrays.toString(arr));
	List<char[]> arr1=Arrays.asList(arr);
	
	
	
	
	}
public static List<Character> toCharacterArray(String s){
	List<Character> list=new ArrayList<>();
	for(int i=0;i<s.length();i++) {
		list.add(s.charAt(i));
	}
	
	return list;
}
}
