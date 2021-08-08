package chapter17i_o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
public static void main(String[] args) throws FileNotFoundException, IOException {

try(RandomAccessFile input=new RandomAccessFile("input.dat","rw")){
//Clear the file to destroy old contents if exists.	
input.setLength(0);;	

//write new Integers
for(int i=0;i<200;i++) {
	input.writeInt(i);
}
System.out.println("Current file length is "+ input.length());

//Retieve the first number
input.seek(0);//moves the filepointer to the beginning of the file.
System.out.println("First number is "+ input.readInt());

input.seek(input.length()-4);// every integer is 4 byte long
System.out.println("Last number is "+ input.readInt());
input.seek(input.length());
input.writeInt(200);
System.out.println("new length "+ input.length());
input.seek(800);
input.writeInt(201);
input.seek(input.length()-4);
System.out.println(input.readInt());
}
	
	
	
	
}
}
