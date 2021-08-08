package chapter17i_o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Question1 {
public static void main(String[] args) {

	
textFil();
//textFile();

}

public static void textFil(){
	int num=0;
	List<Integer> list=new ArrayList<>();
try(PrintWriter pr=new PrintWriter(new FileOutputStream("Exercise17_01",false))){
	for(int i=0;i<150;i++) {
		pr.write(i+" ");
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try(Scanner in=new Scanner(new File("Exercise17_01"))){
	while(in.hasNext()) {
		System.out.println(in.next());
	}
	

} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}



public static List<Integer> textFile() {
	long start=System.currentTimeMillis();
	int num=0;
	
	List<Integer> list=new ArrayList<>();
	try(
		DataOutputStream bs=
				new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Exercise17_01",true))))
	{
		
		for(int i=0;i<200;i++) {
			Random random=new Random();
			num=random.nextInt(100);
			bs.writeInt(num);
		}
		
	} catch (FileNotFoundException e) {
	System.out.println("File not found...");
	} catch (IOException e) {
		System.out.println("Could't write "+num);
	}
	
	try(DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("Exercise17_01")))){
		int i=0;
		while((i=in.read())!=-1) {
			list.add(i);
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(System.currentTimeMillis()-start);
	System.out.println(list);
	return list;
}
}
