package chapter21questions;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Question3 {
	public static void main(String[] args) {
		String day1[] = { "ahmet ak", "ramazan bak", "ahmet lk", "zuleyha bak", "zeynep bak" };
		String day2[] = { "ahmet ak", "ahmet lk", "zuleyha bak", "zeynep bak","hacer karsli" };
		
		Map<String,String> list=new TreeMap<>();
		
		for(int i=0;i<day1.length;i++) {
			String key=day1[i].substring(0,day1[i].indexOf(" "));
			String value=day1[i].substring(day1[i].indexOf(" ")+1);
			list.put(key, value);
		}
		for(int i=0;i<day2.length;i++) {
			String key=day2[i].substring(0,day2[i].indexOf(" "));
			String value=day2[i].substring(day2[i].indexOf(" ")+1);
			list.put(key, value);
		}
		
		for(Map.Entry<String, String> entry: list.entrySet() ){
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
			
		}
		
		Set<String> setList=new TreeSet<>();
		Set<String> setList2=new TreeSet<>();
		Collections.addAll(setList,day1);
		Collections.addAll(setList,day2);
		System.out.println(setList);
		for(String str:setList) {
			String firstName=str.substring(0,str.indexOf(" "));
			int count=0;
			//String lastName=str.substring(str.indexOf(" ")+1);
		for(String value:setList) {
			String firstName2=value.substring(0,str.indexOf(" "));
			if(firstName.equalsIgnoreCase(firstName2)) {
				count++;
			}
		}
		if(count>1) {
			setList2.add(str);
		}else {
			setList2.add(firstName);
		}
		}
		System.out.println(setList2);
		
		
	}
}
