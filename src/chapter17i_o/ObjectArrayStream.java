package chapter17i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectArrayStream {

private	static int[] numbers= {1,2,3,4,5};
private static String[] names= {"john","susan","kim"};	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
try(
ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("array.dat"))		
		){
	output.writeObject(numbers);
	output.writeObject(names);
}

try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("array.dat")))
{
	int[] numberss=(int[]) input.readObject();
	String name[]=(String[]) input.readObject();
	System.out.println(Arrays.toString(numberss));
	System.out.println(Arrays.toString(name));
}

	}

}
