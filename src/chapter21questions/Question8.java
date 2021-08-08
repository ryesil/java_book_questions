package chapter21questions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question8 {
	public static void main(String[] args) {
		String states = "Alabama\r\n" + "Alaska\r\n" + "Arizona\r\n" + "Arkansas\r\n" + "California\r\n"
				+ "Colorado\r\n" + "Connecticut\r\n" + "Delaware\r\n" + "Florida\r\n" + "Georgia\r\n" + "Hawaii\r\n"
				+ "Idaho\r\n" + "Illinois\r\n" + "Indiana\r\n" + "Iowa\r\n" + "Kansas\r\n" + "Kentucky\r\n"
				+ "Louisiana\r\n" + "Maine\r\n" + "Maryland\r\n" + "Massachusetts\r\n" + "Michigan\r\n"
				+ "Minnesota\r\n" + "Mississippi\r\n" + "Missouri\r\n" + "Montana\r\n" + "Nebraska\r\n" + "Nevada\r\n"
				+ "New_Hampshire\r\n" + "New_Jersey\r\n" + "New_Mexico\r\n" + "New_York\r\n" + "North_Carolina\r\n"
				+ "North_Dakota\r\n" + "Ohio\r\n" + "Oklahoma\r\n" + "Oregon\r\n" + "Pennsylvania\r\n"
				+ "Rhode_Island\r\n" + "South_Carolina\r\n" + "South_Dakota\r\n" + "Tennessee\r\n" + "Texas\r\n"
				+ "Utah\r\n" + "Vermont\r\n" + "Virginia\r\n" + "Washington\r\n" + "West_Virginia\r\n" + "Wisconsin\r\n"
				+ "Wyoming";
		states = states.replaceAll("[\n\\\r]", " ").replaceAll("\\s+", " ");
		//System.out.println(states);

		String capitols = "	Montgomery\r\n" + "Alaska	Juneau\r\n" + "Arizona	Phoenix\r\n"
				+ "Arkansas	Little_Rock\r\n" + "California	Sacramento\r\n" + "Colorado	Denver \r\n"
				+ "Connecticut	Hartford\r\n" + "Delaware	Dover\r\n" + "Florida	Tallahassee \r\n"
				+ "Georgia	Atlanta\r\n" + "Hawaii	Honolulu\r\n" + "Idaho	Boise\r\n" + "Illinois	Springfield\r\n"
				+ "Indiana	Indianapolis\r\n" + "Iowa	Des_Moines\r\n" + "Kansas	Topeka\r\n"
				+ "Kentucky	Frankfort\r\n" + "Louisiana	Baton_Rouge\r\n" + "Maine	Augusta\r\n"
				+ "Maryland	Annapolis\r\n" + "Massachusetts	Boston\r\n" + "Michigan	Lansing\r\n"
				+ "Minnesota	Saint_Paul\r\n" + "Mississippi	Jackson\r\n" + "Missouri	Jefferson_City 	Helena\r\n"
				+ "Nebraska	Lincoln\r\n" + "Nevada	Carson_City\r\n" + "New_Hampshire	Concord \r\n"
				+ "New_Jersey	Trenton\r\n" + "New_Mexico	Santa_Fe\r\n" + "New_York	Albany\r\n"
				+ "North_Carolina	Raleigh\r\n" + "North_Dakota	Bismarck\r\n" + "Ohio	Columbus\r\n"
				+ "Oklahoma	Oklahoma_City\r\n" + "Oregon	Salem\r\n" + "Pennsylvania	Harrisburg\r\n"
				+ "Rhode_Island	Providence\r\n" + "South_Carolina	Columbia\r\n" + "South_Dakota	Pierre\r\n"
				+ "Tennessee	Nashville\r\n" + "Texas	Austin\r\n" + "Utah	Salt_Lake_City\r\n"
				+ "Vermont	Montpelier\r\n" + "Virginia	Richmond\r\n" + "Washington	Olympia\r\n"
				+ "West_Virginia	Charleston\r\n" + "Wisconsin	Madison\r\n" + "Wyoming	Cheyenne";
		capitols=capitols.replaceAll("[\n\\\r]", " ").replaceAll("\\s+", " ").trim();
		String arr1[]=states.split(" ");
		String arr2[]=capitols.split(" ");
		
		//System.out.println(capitols);
		Set<String> list1=new LinkedHashSet<>();
		Set<String> list2Copy=new LinkedHashSet<>();
		Collections.addAll(list1, arr1);
		Collections.addAll(list2Copy, arr2);
		Set<String> list2=new LinkedHashSet<>(list2Copy);
		list2.removeAll(list1);
		System.out.println(list1);
		System.out.println("********");
		System.out.println(list2);
		Object state[]=list1.toArray();
		Object capitol[]=list2.toArray();
//		System.out.println(Arrays.toString(state));
//		System.out.println(Arrays.toString(capitol));
		
		
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("StatesCapitols.txt"))){
			os.writeObject(state);
			os.writeObject(capitol);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
