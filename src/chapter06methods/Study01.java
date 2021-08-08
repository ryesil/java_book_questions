package chapter06methods;

import java.util.Arrays;
import java.util.Scanner;

public class Study01 {
public static void main(String[] args) {
//pentas(100);
//sum(123);
//sum(213456);
//System.out.println(isPal(1221));
//System.out.println(isPal(12020));
	//order(1.27,1.28,1.29);
//testings(1,2,3,4,5,656,7,9,67);
//int[] list= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
//int a=search(list,0);
//System.out.println(a);
	
	
final int NUMBER_OF_DAYS=10;
final int NUMBER_OF_HOURS=24;
double[][][] data=new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

Scanner input=new Scanner(System.in);
for(int k=0; k<NUMBER_OF_DAYS*NUMBER_OF_HOURS;k++) {
	int day=input.nextInt();
	int hour=input.nextInt();
	double temperature=input.nextDouble();
	double humidity=input.nextDouble();
	data[day-1][hour-1][0]=temperature;
	data[day-1][hour-1][1]=humidity;
}
	
for(int i=0;i<NUMBER_OF_DAYS;i++) {
	double dailyTempTotal=0, dailyHumidTotal=0;
	for(int j=0;j<NUMBER_OF_HOURS;j++) {
		dailyTempTotal+=data[i][j][0];
		dailyHumidTotal=data[i][j][1];
	
		
	}
	System.out.println("day"+i+"'s average temps is"+ dailyTempTotal/NUMBER_OF_HOURS);
	System.out.println("day"+i+"'s average humidity is"+ dailyHumidTotal/NUMBER_OF_HOURS);
}



}








public static void closestPairs() {
	Scanner in=new Scanner(System.in);
	
	
}



public static int[] sorting(int...num) {
	int small=0;
	for(int i:num) {
		if(i<small) {
			small=i;
			i=small;
		}
	}
	
	
	
	
return num;	
}



public static int search(int[] list, int key) {
int low =0;//
int high=list.length-1;//7
int mid=(high+low)/2;
while(high>=low) {
	mid=(high+low)/2;
	if(key==list[mid]) {
		return mid;
	}
	if(key<list[mid]) {
		high=mid-1;
	}else if(key>list[mid]){
		low=mid+1;
	}
}
return -1;
}





public static void testings(int...numbers) {
	
System.out.println(numbers[numbers.length-1]);	
	
}





public static void pyramid(int a) {
	
	for(int i=1;i<=a;i++) {
		for(int j=a;j>=0;j--) {
			System.out.println();
		}
		
		
	}
}



public static void order(double num1, double num2, double num3) {
	double temp=0;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num2>num3) {
			temp=num2;
			num2=num3;
			num3=temp;	
		}
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
	
	System.out.printf("%.2f < %.2f < %.2f",num1,num2,num3);
	
}

public static boolean isPal(int num) {
	int a=reverse(num);
	return a==num;
}


public static int reverse(int num) {
	String a=Integer.toString(num);
	String b="";
	
	while(num>0) {
		int y=num%10;
		b+=y;
		num=num/10;
		
	}
	
	
	
	return Integer.parseInt(b);
}



public static int sum(long n) {
	int summ=0;
	String a=Long.toString(n);
	int i=0;
	while(n!=0) {
	int x=(int) (n%10);
	n=n/10;
	summ+=x;
		i++;
	}
	System.out.println(summ);
	return summ;
}





public static void pentas(int n) {
	int x=0;
	int i=1;
	while (i<=n) {
		
		for(int j=1;j<=10;j++) {
			x= pentagonal(i);
		System.out.printf("%7d",x);
		i++;
		}
		System.out.println();
	}
}

public static int pentagonal(int n) {
	int penNum=n*(3*n-1)/2;
	return penNum;
}
}
