package chapter13;

public class Square extends GeometricObject implements Colorable {
private double side;


public Square() {
}
public Square(double side) {
	this.side=side;
}
public Square(double side,String color, boolean filled) {
	super(color,filled);
	this.side=side;
}

public void setSide(double side) {
	this.side=side;
}

public double getSide() {
	return side;
}

	@Override
	public int compareTo(GeometricObject o) {
		if(this.getArea()>o.getArea()) {
			return 1;
		}else if(this.getArea()<o.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}

	@Override
	public void howToColor() {
	System.out.println("Color all four sides");
		
	}

	@Override
	public double getArea() {
		
		return side*side ;
	}

	@Override
	public double getPerimeter() {
	
		return 4*side;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return toString();
	}
	@Override
	public String toString() {
		return "Square [side=" + side + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
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
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
