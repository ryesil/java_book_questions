package java_bookk;

import java.util.Scanner;

public class CelsiusToFahrenheit {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Celsius please");
	double celsius=in.nextDouble();
	double fahrenheit=(9.0/5)*celsius+32;// Watch out 9/5=1 but 9.0/5 =1.8
	System.out.println(fahrenheit+" F");
	
	
}
}
