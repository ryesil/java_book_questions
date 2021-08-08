package chapter21questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q12BabyNames {
	public static void main(String[] args) {

//	List<String> listOfList=new ArrayList<>();
//	try(BufferedReader br=new BufferedReader(new FileReader("\\\\PDC\\FolderRedirectionStaff$\\yesil\\Desktop\\baby_Names\\yob1999.txt"))){
//	String line;
//	while((line=br.readLine())!=null) {
//		//String list[]=line.split(",");
//		//System.out.println(line);
//		listOfList.add(line);
//		
//	}
//	//System.out.println(listOfList.get(1));
//		
//		
//		
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}

		fileSearching();

	}

	public static void fileSearching() {
		List<String[]> directory = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year between 1980-2020 in the format yyyy");
		int year = input.nextInt();

		try (BufferedReader br = new BufferedReader(
				new FileReader("\\\\PDC\\FolderRedirectionStaff$\\yesil\\Desktop\\baby_Names\\yob" + year + ".txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String list[] = line.split(",");
				directory.add(list);
			}
			
			Collections.sort(directory, new It());
			System.out.println("The most 5 popular names as follows:");
			for (int i = 0; i < 5; i++) {
				System.out.println("Number " + (i + 1) + ")\nName: " + directory.get(i)[0] + "\nGender: "
						+ (directory.get(i)[1].equals("M") ? "Male" : "Female") + "\n" + "Number of Times used: "
						+ directory.get(i)[2]);
				System.out.println("======================================================");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Do you wish to continue? (Y/N)");

		char decision = input.next().toUpperCase().charAt(0);

		if (decision == 'Y') {
			fileSearching();
		} else {
			input.close();
			System.out.println("Have a nice day...");
			System.exit(0);

		}

	}
}

class It implements Comparator<String[]> {

	@Override
	public int compare(String[] o1, String[] o2) {
		if (Integer.parseInt(o1[2]) > Integer.parseInt(o2[2])) {
			return -1;
		} else if (Integer.parseInt(o1[2]) < Integer.parseInt(o2[2])) {
			return 1;
		} else {
			return 0;
		}

	}

}
