package chapter21questions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Question7 {
	public static void main(String[] args) {
		String sentence = "2 For those spending time at home, looking for a cozy"
				+ " adventure or bedtime story, we offer this imaginative rhyming"
				+ " picture book, read by the author, Daniel Errico. Follow the Marmabill"
				+ " on her quest through the rainforest, where she meets fantastical creatures"
				+ " like wugs 1, tankadiggies, and flying fluthers. As her journey takes her from"
				+ " treetops to glowing underground caves, the Marmabill finds out for herself the"
				+ " true meaning of home. Adventure Remember, adventure our stories for kids are here for you to read at any time.";

		String str[] = sentence.toLowerCase().replaceAll("[^0-9a-z ]", "").trim().replaceAll("\\s+", " ").split(" ");
		System.out.println(Arrays.toString(str));
		Map<String,Integer> list=new TreeMap<>();
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			int count = 0;
			for(int j=0;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
				}
			}
			list.put(str[i], count);
		}
		for(String w:list.keySet()) {
			System.out.println(w+": "+list.get(w));
		}
		Object states[]=new Object[50];
		Object capitols[]=new Object[50];
		try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("StatesCapitols.txt"))){
			states=(Object[]) os.readObject();
			capitols=(Object[]) os.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String,String> statesAndCapitols=new LinkedHashMap<>();
		System.out.println(states.length+"-----"+capitols.length);
		for(int i=0;i<states.length;i++) {
			statesAndCapitols.put((String)states[i], (String)capitols[i]);
		}
		System.out.println(statesAndCapitols);
		
		
		capitolFinder(statesAndCapitols);
		
		
	}
	public static void capitolFinder(Map<String,String> w) {
		Scanner input=new Scanner(System.in);
		System.out.println("State:");
		String state=input.nextLine();
			   state=(state.toUpperCase().charAt(0)+state.toLowerCase().substring(1)).replace(" ", "_");
		input.close();
		System.out.println("The capitol of "+state+" is "+w.get(state).replace("_", " ")+".");
		
	}
}
