package chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
//		List<Number> list1=new ArrayList<>();
//		list1.add(12);
//		list1.add(11.2);
//		list1.add(13);
//		list1.add(2.3);
//		list1.add(-12);
		//System.out.println(sort(list1));
		//System.out.println(sorty(list1));	
//	GeometricObject o1=new Circle(1);
//	GeometricObject o2=new Rectangle();
//	GeometricObject o3=new ComparableRectangle(1.5,1.5);
//	System.out.println("****area****");
//	System.out.println(o1.getArea()+" Circle");
//	System.out.println(o3.getArea()+" Rec");
//	System.out.println(o3.compareTo(o1)+" perimeter");
//	System.out.println(o1.compareTo(o3)+" area");
//	System.out.println("****perimeter***");
//	System.out.println(o1.getPerimeter()+"Circle");
//	System.out.println(o3.getPerimeter()+"Rec");
////	System.out.println(o1.compareTo(o2));
////	System.out.println(o1.getArea());
////	System.out.println(o2.getArea());
		
//GeometricObject sq1=new Square();
//GeometricObject c1=new Circle();
//Rectangle rec1=new Rectangle();
//Triangle t1=new Triangle();
//Circle c2=new Circle(3);
//
//List<GeometricObject> list=new ArrayList<>();
//list.add(rec1);
//list.add(c2);
//list.add(t1);
//list.add(rec1);
//list.add(sq1);
//System.out.println(list);
//
//Collections.sort(list,new Runner().new Compare());
//	
//System.out.println(list);
//
//for(GeometricObject w:list) {
//	System.out.println(w.getArea()+" "+w.getClass().toGenericString());
//	if(w instanceof Colorable) {
//		((Colorable) w).howToColor();
//	}
//}

MyStack stack1=new MyStack("Ali",12);
MyStack stack2=(MyStack) stack1.clone();

System.out.println(stack2.getName());		
System.out.println(stack1.equals(stack2));	
System.out.println(stack2.getId());		
stack1.setId(1);	
System.out.println(stack1.getId());	
System.out.println(stack2.getId());
Circle c1=new Circle(1);
Circle c2=new Circle(2);
Circle c3=new Circle(1);
Circle c4=(Circle) c1.clone();
Rectangle r1=new Rectangle(3,2);
Rectangle r2=(Rectangle) r1.clone();
//
//System.out.println(r1.equals(r2));
//
//r2.setHeight(4);
//System.out.println(r1.equals(r2));
System.out.println(r1.equals(c2));
//System.out.println(c1.equals(c4));
//System.out.println(c4.getRadius());
//System.out.println(c1.getRadius()==c4.getRadius());
//System.out.println(c1.equals(c2));
	
	}

class Compare implements Comparator<GeometricObject>{

	@Override
	public int compare(GeometricObject o1, GeometricObject o2) {
		
		return o1.compareTo(o2);
	}
	
}
	
	
	public static List<Number> sorty(List<Number> list){
		long start=System.currentTimeMillis();
		for(int i=0;i<list.size();i++) {
			Number max=list.get(i);
			int maxIndex=i;
			for(int j=i+1;j<list.size();j++) {
			if(list.get(j).doubleValue()>max.doubleValue())	{
				max=list.get(j);
				maxIndex=j;
			}
			}
			if(i!=maxIndex) {
				list.set(maxIndex, list.get(i));
				list.set(i, max);
			}
			
			
		}
		System.out.println(System.currentTimeMillis()-start);
		return list;
	}
	public static int summer(List<Integer> list) {
		int i=0;
		int sum=0;
		while(i<list.size()) {
			sum+=list.get(i);
		}
		return sum;
	}
	
	public static List<Number> sort(List<Number> list){
	for(int i=0;i<list.size();i++) {
		Number max=list.get(i);
		int index=i;
		for(int j=i+1;j<list.size();j++) {
			if(max.doubleValue()<list.get(j).doubleValue()) {
				max=list.get(j);
				index=j;
			}
		}
		
		if(index!=i) {
			list.set(index, list.get(i));
			list.set(i, max);
		}
	}
	
	return list;	
	}

}
