package chapter20lists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import chapter13.Circle;
import chapter13.GeometricObject;
import chapter13.Rectangle;

public class GeometricObjectsComparator implements Comparator<GeometricObject>, Serializable {

	@Override
	public int compare(GeometricObject o1, GeometricObject o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();
		if (area1 > area2) {
			return 1;
		} else if (area1 < area2) {
			return -1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		GeometricObjectsComparator goc = new GeometricObjectsComparator();
		Circle c1 = new Circle(3);
		Rectangle rec1 = new Rectangle(2, 5);

		Integer arr[] = { 1, 2, 3, 4, 5 };

		Arrays.sort(arr, (s1, s2) -> {
			return s1 - s2;
		});

		System.out.println(goc.compare(c1, rec1));

		List<String> list2 = new ArrayList<>();
		list2.add("Ahmet");
		list2.add("Mehmet");
		list2.add("Cemal");
		list2.add("Kemal");
		list2.add("Abuzer");
		list2.add("Abuziddin");

		list2.sort(String::compareToIgnoreCase);
		System.out.println(list2);
		

	}

}
