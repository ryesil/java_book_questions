package chapter21questions;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
	String[] textbooks11= {"Chemistry", "Mathematics","Biology", "English"};
	String[] textbooks22= {"Biology","English","Geography","Physics"};
	Set<String> textbooks2=new HashSet<>();
	Set<String> textbooks1=new HashSet<>();
	Collections.addAll(textbooks1,textbooks11);
	Collections.addAll(textbooks2, textbooks22);
	System.out.println("1: "+textbooks1);
	System.out.println("2: "+textbooks2);
	Set<String> temp=new HashSet<>(textbooks1);
	System.out.println(temp);
	temp.retainAll(textbooks2);
	System.out.println(temp);
	Set<String> temp2=new HashSet<>(textbooks1);
	temp2.removeAll(textbooks2);
	System.out.println(temp2);
	Set<String> temp3=new HashSet<>(textbooks2);
	temp3.removeAll(textbooks1);
	System.out.println(temp3);

	
	
	

	}

}
