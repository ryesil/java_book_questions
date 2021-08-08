package chapter13;

public class Circle extends GeometricObject{

private double radius;


@Override
public String toString() {
	return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
			+ ", getPerimeter()=" + getPerimeter() + "]";
}
public void setRadius(double radius) {
	this.radius=radius;
}
public Circle(double radius) {
	this.radius=radius;
}

public Circle() {
}
public Circle(String color,boolean filled,double radius) {
	super(color,filled);
	this.radius=radius;
}
public double getRadius() {
	return radius;
}

	@Override
	public double getArea() {
	
		return Math.PI*radius*radius;
	}
	
	
	@Override
	public double getPerimeter() {
	
		return Math.PI*radius*2;
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
		// TODO Auto-generated method stub
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
public Object equals(Circle o) {
	
	if(this.getRadius()==o.getRadius()) {
		return true;
}
return false;	
}
@Override
public boolean equals(GeometricObject o) {
	// TODO Auto-generated method stub
	return false;
}



}
