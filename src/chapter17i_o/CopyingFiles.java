package chapter17i_o;

import java.io.*;

public class CopyingFiles {
	
private static final String targetFile = null;

/*
 @param args[0] for sourceFile
 @param args[1] for targetFile
 */
public static void main(String[] args) throws FileNotFoundException, IOException {
	
File sourceFile=new File("ben.txt");

//Check whether source file exists.
if(!sourceFile.exists()) {
	System.out.println("Source File "+ sourceFile+ " does not exist.");
	System.exit(1);
}

//check if the target file exists.
File targetFile=new File("bene");
if(targetFile.exists()) {
	System.out.println("Target File "+ targetFile+ " already exists.");
	System.exit(2);
}

try(
BufferedInputStream input=
new BufferedInputStream(new FileInputStream(sourceFile));
BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(targetFile))		
		){	
	int r, numberBytesCopied = 0;
	while((r=input.read())!=-1) {
		output.write((byte)r);
		numberBytesCopied++;
	}
	
	System.out.println((numberBytesCopied+ "bytes copied"));
}


}
	
	
	
}
