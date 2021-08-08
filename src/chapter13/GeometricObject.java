package chapter13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Date;


public abstract class GeometricObject implements Comparable<GeometricObject>, Comparator<GeometricObject>, Cloneable{
private String color;
private boolean filled;
private LocalDate dateCreated;
protected static int count=0;
protected GeometricObject() {
this.dateCreated=LocalDate.now();
}
protected GeometricObject(String color,boolean filled) {
	this.dateCreated=LocalDate.now();
	this.color=color;
	this.filled=filled;
	count++;
}
public String getColor() {
	return color;
}

public String getDateCreated() {
	DateTimeFormatter format=DateTimeFormatter.ofPattern("yy/MM");
	return dateCreated.format(format);
}


public void setColor(String color) {
	this.color=color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled=filled;
}
@Override
public String toString() {

	return "Color: "+color+
			"\nfilled: "+filled+"\ndateCreated: "+dateCreated;
}


public abstract double getArea ();


public abstract double getPerimeter();

//public int max(GeometricObject o2) {
//return this.compareTo(o2);
//}



public boolean isEqualArea(GeometricObject obj) {
	boolean equal=false;
	if(this.getArea()==obj.getArea()) {
		equal=true;
	}
	return equal;
}
public boolean isEqualPerimeter(GeometricObject obj) {
	boolean equal=false;
	if(this.getPerimeter()==obj.getPerimeter()) {
		equal=true;
	}
	return equal;
}

public static void display(GeometricObject obj) {
	String name=obj.getClass().getName();
	System.out.println("this is a: "+name.substring(name.lastIndexOf("."))+"\nThe area is: "
	+obj.getArea()+"\nThe perimeter is: "+obj.getPerimeter());
}
public void displayy() {
	String name=this.getClass().getName();
	System.out.println("this is a: "+name.substring(name.lastIndexOf("."))+"\nThe area is: "
	+getArea()+"\nThe perimeter is: "+getPerimeter());
}
public abstract String display();

public Object clone() {
	
try {
	GeometricObject circle= (GeometricObject) super.clone();
	return circle;
}catch(CloneNotSupportedException e){
	return null;
}
	
}
public abstract boolean equals(GeometricObject o);
}
