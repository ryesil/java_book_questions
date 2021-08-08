package chapter13;

import java.util.Arrays;

public class ObjectRunner {
public static void main(String[] args) {
	Circle circle1=new Circle();
	System.out.println(circle1.getArea());
	circle1.setRadius(12);
	System.out.println(circle1.getArea());
	Circle circle2=new Circle(10);
	Circle circle3=new Circle("Blue",true,11);
	System.out.println(circle3.getPerimeter());
	Rectangle rec1=new Rectangle();
	System.out.println(rec1.getDateCreated());
	Rectangle rec2=new Rectangle(2,3);
	Rectangle rec3=new Rectangle("red",false,12,10);
	System.out.println(Double.compare(rec1.getArea(), circle1.getArea()));
	System.out.println(rec1.isEqualArea(circle1));
	GeometricObject.display(rec3);
	rec3.displayy();
	ComparableRectangle list[]= {new ComparableRectangle(1,2), new ComparableRectangle(12,21),
			new ComparableRectangle(21,54), new ComparableRectangle(1,1)};
	
Arrays.sort(list);
for(ComparableRectangle i:list) {
	System.out.println(i.toString());
}




}
	
	
	
	
}

