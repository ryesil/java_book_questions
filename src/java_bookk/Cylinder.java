package java_bookk;

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
	
Scanner in=new Scanner(System.in);
System.out.println("radius?");
double radius=in.nextDouble();
System.out.println("height");
double height=in.nextDouble();
double area=Math.round(Math.PI*Math.pow(radius, 2));
double volume=area*height;
	System.out.println(volume+" cubic");
}
}