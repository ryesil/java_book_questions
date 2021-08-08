package chapter17i_o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question04 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	String str="This used to be my favorite short story, "
			+ "and I might only think that because I read it"
			+ " when I was a freshman in high school and I"
			+ " remember being shocked by the ending."
			+ " It’s always stayed with me.It’s a chilling story. A man known as"
			+ " the Traveller is visiting a foreign penal"
			+ " colony where he is shown a special machine"
			+ " used to execute prisoners. The machine inscribes"
			+ " the prisoner’s crime onto their body until they die"
			+ " (kind of sounds familiar if you’ve read the fifth Harry"
			+ " Potter book). It takes twelve hours of torture before the"
			+ " prisoner dies. I told you it was chilling!";
	System.out.println(str.length());
		//text();

		//binary();
		binaryread();
	}
	public static void binaryread() throws FileNotFoundException, IOException {
		int byteCount=0;
		try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("try"))){
			while(true) {
			System.out.println((char)os.readByte());
			
			byteCount++;
			}
		}catch(EOFException e) {
			System.out.println(byteCount);
		}
	}
	
	public static void binary() throws FileNotFoundException, IOException {
		 int bytes=0;
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("try"));
				DataInputStream ds=new DataInputStream(new FileInputStream("Exercise17_04"))){
			
			while(true) {
			char s=(char) ds.readByte();
			System.out.println(s);
			os.writeChar(s);
		
			bytes++;
			}
			
		}catch(EOFException e) {
			
		}
		System.out.println(bytes);
	}
	
	
public static void text() {
	try(DataOutputStream ds=
			new DataOutputStream(new FileOutputStream("Exercise17_04"))){
		
		ds.writeUTF("This used to be my favorite short story, "
				+ "and I might only think that because I read it"
				+ " when I was a freshman in high school and I"
				+ " remember being shocked by the ending."
				+ " It’s always stayed with me.It’s a chilling story. A man known as"
				+ " the Traveller is visiting a foreign penal"
				+ " colony where he is shown a special machine"
				+ " used to execute prisoners. The machine inscribes"
				+ " the prisoner’s crime onto their body until they die"
				+ " (kind of sounds familiar if you’ve read the fifth Harry"
				+ " Potter book). It takes twelve hours of torture before the"
				+ " prisoner dies. I told you it was chilling!");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
