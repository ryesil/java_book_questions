package chapter19generics;

public class BoundedType {

	public static void main(String[] args) {
		Rectangle1 rec1=new Rectangle1();
		Circle1 circle1=new Circle1();
		System.out.println(isEqualArea(rec1,circle1));
	}
	
public static <E extends GeometricObj> boolean isEqualArea(
		GeometricObj o1,GeometricObj o2){
	return o1.getArea()==o2.getArea();
}
}
