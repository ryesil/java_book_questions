package chapter23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CreateLargeFile {
public static void main(String[] args) throws Exception {

//write();
//read("largedata.dat");
//initializeSegments(3,"read","write");	
	
	
}
public static void copyHalfToF2(int numberOfSegments,int segmentSize,
		DataInputStream f1,DataOutputStream f2) throws Exception{
	for(int i=0;i<(numberOfSegments/2)*segmentSize;i++) {
		f2.writeInt(f1.read());
	}
}

public static void mergeSegments(int numberOfSegments,
		int segmentSize, DataInputStream f1,DataInputStream f2,
		DataOutputStream f3) throws Exception {
	for(int i=0;i<numberOfSegments;i++) {
		mergeTwoSegments(segmentSize,f1,f2,f3);
	}
	
	while(f1.available()>0) {
		f3.writeInt(f1.readInt());
	}
}

public static void mergeTwoSegments(int segmentSize,
		DataInputStream f1, DataInputStream f2,
		DataOutputStream f3) throws Exception {
	int intFromF1=f1.readInt();
	int intFromF2=f2.readInt();
	int f1Count=1;
	int f2Count=1;
	while(true) {
		if(intFromF1<intFromF2) {
			f3.writeInt(intFromF1);
		
		
		
		}
	}
	
}



public static int initializeSegments(
		int segmentSize,String originalFile,String f1) throws Exception{
	
	int[] list=new int[segmentSize];
	DataInputStream input=new DataInputStream(
			new BufferedInputStream(new FileInputStream(originalFile)));
	DataOutputStream output=new DataOutputStream(
			new BufferedOutputStream(
					new FileOutputStream(f1)));
	
	int numberOfSegments =0;
	while (input.available()>0) {
		numberOfSegments++;
		int i=0;
		for(;input.available()>0&&i<segmentSize;i++) {
			list[i]=input.readInt();
		}
		//Sort an array list[0,1,....i-1]
		Arrays.sort(list,0,i);
		for(int j=0;j<i;j++) {
			output.writeInt(list[j]);
		}
	}
	input.close();
	output.close();
	return numberOfSegments;
	}


public static void read(String file) throws Exception {
	DataInputStream input=new DataInputStream(
			new BufferedInputStream(
					new FileInputStream(file)));
	for(int i=0;i<100;i++) {
		System.out.println(input.readInt()+" ");
	}
	input.close();
	
	
	
}

public static void write() throws Exception {
	DataOutputStream output=new DataOutputStream(
			new BufferedOutputStream(new FileOutputStream("largedata.dat")));
	for(int i=0;i<2_000_000;i++) {
		output.writeInt((int)(Math.random()*(1E6)));
	}
	output.close();
}

}
