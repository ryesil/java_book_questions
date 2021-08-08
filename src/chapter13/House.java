package chapter13;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{
private int id;
private double area;
private Date whenBuilt;

public House(int id, double area) {
	this.id=id;
	this.area=area;
	whenBuilt=new Date();
}
public int getId() {
	return id;
}
public double getArea() {
	return area;
}
	
public Date getWhenbuilt() {
	return whenBuilt;
}



@Override
public Object clone() {
	try {
		return super.clone();
	} catch (CloneNotSupportedException e) {
		return null;
	}
}




	@Override
	public int compareTo(House o) {
	if( area>o.area) {
		return 1;
	}else if(area<o.area) {
		return -1;
	}else {
		return 0;
	}
	}

	public static void main(String[] args) {
//		House house1=new House(1,1234);
//		House house2=(House) house1.clone();
//		House house3=new House(1,1234);
//		System.out.println(house1.compareTo(house2));
//		System.out.println(house1.compareTo(house3));
		
		Animal animal=new Chicken();
		
		
		
		
	}
	
	public static void eat(Animal animal) {
		System.out.println();
		
		
	}
	
}
