package chapter11exceptions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Number?");
	int num=input.nextInt();
	
	Random random=new Random(10);
	Random random1=new Random(10);
	System.out.println(random.nextInt(3)+" "+random1.nextInt(3));
	String str=String.valueOf(random.nextInt(num));
	int sum=0;
	for(int i=0;i<str.length();i++) {
		sum+=Character.getNumericValue(str.charAt(i));
	}
	System.out.println(str);
	System.out.println("****************");
	System.out.println(sum);
	
	
	
	int[][] arr= {{1,3,6},{2,8},{5,7,9,14}};
	
	sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]%2==0) {
				sum+=arr[i][j];
			}
			
		}
	}
	System.out.println(sum);
	int arr2[]= {3,2,5,4,1,6};
	
	Arrays.sort(arr2);
	System.out.printf("min is %d\nand max is %d",arr2[0],arr2[arr2.length-1]);
	
}
}
