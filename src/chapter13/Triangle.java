package chapter13;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	
	
public Triangle() {
	
}


	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		if (side1 > (side2 + side3) || side2 > (side1 + side3) || side3 > side1 + side2)
throw new RuntimeException("a side must be" + " less than the sum of the other two sides.");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}



	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + "]";
	}


	public static void main(String[] args) {
		//Triangle t1=new Triangle(10,2,3,"Blue",true);
		Triangle t2=new Triangle(3,4,5,"Red",false);
		System.out.println("Count is "+Triangle.count);
		System.out.println(t2);
	}

	@Override
	public double getArea() {
		double u = (side1 + side2 + side3) / 2;
		return Math.sqrt((u * (u - side1) * (u - side2) * (u - side3)));
	}

	@Override
	public double getPerimeter() {

		return side1 + side2 + side3;
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


	@Override
	public boolean equals(GeometricObject o) {
		// TODO Auto-generated method stub
		return false;
	}
}