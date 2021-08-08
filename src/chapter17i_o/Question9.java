package chapter17i_o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Question9 {
public static void main(String[] args) {
	
File file=new File("Exercise17_08.dat")	;

try(RandomAccessFile raf=new RandomAccessFile(file,"rw")){
int count = (raf.length()!=0)?raf.readInt()+1:1;
raf.seek(0);
raf.writeInt(count);
System.out.println("The count is "+count);
	
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}




}
