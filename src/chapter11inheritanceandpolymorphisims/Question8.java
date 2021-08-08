package chapter11inheritanceandpolymorphisims;

public class Question8 {
public static void main(String[] args) {
	
	System.out.println(accum("alsld"));
	
}
public static String amazingEdabit(String str) {
return	str.contains("edabit")?str:str.replace("is", "is not");
		
	
}

public static String accum(String str) {
	String accumm="";
	for(int i=0;i<str.length();i++){
		char ch=str.toUpperCase().charAt(i);
		accumm+=ch;
		for(int j=0;j<i;j++){
			accumm+=Character.toLowerCase(ch);
		}
		if(i<str.length()-1)
		accumm+="-";
		
		
	}

	return accumm;
	
	
}	
	
}
