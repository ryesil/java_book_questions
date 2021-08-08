package stringstudy;

public class StringStudy {
public static void main(String[] args) {
	
//String string=new String("Welcome to java");	
//	
//	System.out.println(string);
//	char[] charArray= {'G','u','n','a','y','d','i','n'};
//	String str=new String(charArray);
//	System.out.println(str);
//	String[] token="Java#HTML#Perl".split("#");
//	for(int i=0;i<token.length;i++) {
//		System.out.print(token[i]+" ");
//}
//	System.out.println("Java is fun".matches("Java.*"));
//	
//	System.out.println();
	
//	Scanner in=new Scanner(System.in);
//	System.out.println("ssn");
//	String ssn=in.next();
//	String ssn2=ssn.replaceAll("\\d{5}","******");
//	System.out.println(ssn2);
	String s="a+b$#c".replaceAll("[+$#]", "");
//	System.out.println(s);
	String[] array="Java,C?C#,C++".split("[,?,]");
//	for(int i=0;i<array.length;i++) {
//		System.out.print(array[i]+" ");
//	}
//	System.out.println(array.length);
//	System.out.println(array[1]);
//	System.out.println(array[2]);
//	String s1=new String("Java");
//	char[] char1=s1.toCharArray();
//	System.out.println(char1);
//	System.out.println(char1[0]);
//	System.out.println(char1.length);
//	String a=String.valueOf(5.44);
//	char b[]=a.toCharArray();
//	System.out.println(b);
//	System.out.println(a.replaceAll("\\A","\\$"));
//	String s3=String.format("%7.2f%6d%-4s", 45.556,14,"AB");
//	System.out.println(s3);
//	String s1="Welcome to Java";
//	String s2=s1;
//	String s3= new String("Welcome to Java");
//	String s4="Welcome to Java";
//	System.out.println(s1==s2);
//	System.out.println(s1==s3);
//	System.out.println(s1==s4);
//	System.out.println(s1.equals(s3));
//	String s1="Welcome";
//	String s2= "welcome";
//	s2=s1.replace("e","E");
//	System.out.println(s2);
//	String[] token="Welcome to Java and HTML".split(" ");
//	s1=token[0];
//	s2=token[1];
//	System.out.println(s1+s2);
//	String s3=new String();
//	System.out.println(s3.length());
//	char char1[]= {'1','2','3','4'};
//	String s5=new String(char1);
//	String s6=char1.toString();
//	Scanner in=new Scanner(System.in);
//	String pasword=in.nextLine();
//	if(pasword=="Java Learner") {
//		System.out.println("true");
//	} else {
//		System.out.println("false");
//	}
//	StringBuilder sb=new StringBuilder();
//	sb.append("Welcome").append("to").append("Java");
//	
//	sb.insert(0, "HTML and ");
//	System.out.println(sb);
//	String s1="Java";
//	String s2="Java";
//	System.out.println(s1=="Java");
	//palindrome("agsdade1234sd!?_)...fa");
	//palindrome("abcc><?cab");
	//palindrome("ab<c>cb?a");
	
	
	
	
}



static void  palindrome(String st) {
	st = st.replaceAll("[^a-zA-Z1-9]", "");
	StringBuilder sb=new StringBuilder(st).reverse();
	String ts=sb.toString();
	if(st.equals(ts)) {
		System.out.println(st+ " is a pelindrome");
	}else {
		System.out.println(st + " is not a pelindrome");
	}
	
}


	


}
 