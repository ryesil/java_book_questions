package chapter13;

public class Rectangle extends GeometricObject  {
@Override
	public String toString() {
		return "Rectangle [height=" + height + ", length=" + length + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
private double height=1;
private double length=1;

public Rectangle() {
	
}
public Rectangle(double height, double length) {
	this.length=length;
	this.height=height;
}

public Rectangle(String color, boolean filled,double height,double length) {
	super(color,filled);
	this.height=height;
	this.length=length;
	
}



@Override
public double getArea() {

	return height*length;
}
@Override
public double getPerimeter() {

	return 2*(height+length);
}
@Override
public int compareTo(GeometricObject o) {

if(getArea()>o.getArea()) {
	return 1;
}else if(getArea()<o.getArea()) {
	return -1;
}else {
	return 0;
}
	
	
}
@Override
public String display() {

	return toString();
}


@Override
public int compare(GeometricObject o1, GeometricObject o2) {
if(o1.getArea()>o2.getArea()) {
	return 1;
}else {
	return -1;
}

}
@Override
public boolean equals(GeometricObject o) {
	try {
		if(o instanceof Rectangle) {
		return getArea()==o.getArea();
		}
	}catch(Exception e) {
		System.out.println("You have to pass in a rectangle object");
	}
	return false;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}

}
