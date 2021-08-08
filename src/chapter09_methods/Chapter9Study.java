package chapter09_methods;

import java.util.Arrays;
import java.util.Scanner;
public class Chapter9Study {

	public static void main(String[] args) {

		
		
		
		
		
		
	//divide(121,12);	
	 Scanner in=new Scanner(System.in);
	 System.out.println("Name");
	 String name=in.next();
	 System.out.println("Name");
	 String surName=in.next();
	 System.out.println("Card");
	 int card=in.nextInt();

	 System.out.println("Name : "+name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("[\\S]","*"));
	 
	 Scanner in1=new Scanner(System.in);
	 int month=in1.nextInt();
	 int year=in1.nextInt();
	 Boolean isLeap=2016%400==0?true:2016%4==0?true:false;
	 String x="";
	 switch(month){
	   case 1:
	   x="January "+year+" has 31 days";
	   break;
	   case 2:
	   x="February "+year+" has "+(isLeap?29:28)+" days";
	   break;
	 }
	 System.out.println(x);
	 

	}
	public static void divide(int num, int divisor) {
	int i=1;
	while(i*divisor<=num){
	i++;
	}
	int remainder=num-divisor*(i-1);
	
	System.out.println("The remainder is "+ remainder+"\nThe divisor is "+(i-1));
	}
		
		
	
	
	
	
	// n=d*q+r  44=5*8+4
	// 59=3*19+2
	//	19=2*9+1
	// 9= 1*9+0
	
	

	
	
	
	
	public static void headTails() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer less that 512 and greater than or equal to 0.");
		
		String a = String.format("%09d", Integer.parseInt(Integer.toBinaryString(in.nextInt())));
		System.out.println(a);
		
		String[][] bb= new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(a.charAt(j+i*3)=='0') {
				bb[i][j]="H";
				
			} else if (a.charAt(j+i*3)=='1') {
				bb[i][j]="T";
			}
			}
			
		}
		for(String[] k:bb) {
			for(String t:k) {
				System.out.print(t+" ");
			}
			System.out.println();
		}

	}

	public static int birthDay() {
		Scanner in = new Scanner(System.in);
		int birthDay = 0;
		int[][][] dates = { { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 }, { 25, 27, 29, 31 } },
				{ { 2, 3, 6, 7 }, { 10, 11, 14, 15 }, { 18, 19, 22, 23 }, { 26, 27, 30, 31 } },
				{ { 4, 5, 6, 7 }, { 12, 13, 14, 15 }, { 20, 21, 22, 23 }, { 28, 29, 30, 31 } },
				{ { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } },
				{ { 16, 17, 18, 19 }, { 20, 21, 22, 23 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } } };

		for (int i = 0; i < dates.length; i++) {
			System.out.println("Is your bithDay in the following set? Y/N");
			for (int[] j : dates[i]) {
				System.out.println(Arrays.toString(j));
			}
			char answer = in.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
				birthDay += dates[i][0][0];
			}
		}

		System.out.println("Your birthDay is " + birthDay);
		return birthDay;
	}

}
