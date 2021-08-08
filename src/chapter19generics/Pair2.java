package chapter19generics;

import java.util.Comparator;

public class Pair2<T>{
private T e1;
private T e2;

public Pair2(T e1,T e2) {
this.e1=e1;
this.e2=e2;
}

public static void  smallest(Pair2<? extends Number> t) { 
	if(t.e1.doubleValue()<t.e2.doubleValue()) {
		System.out.println(t.e1);
	}else {
		System.out.println(t.e2);
	}
}

public static int smallestt(Pair2<? extends String> t) {
	return t.e1.compareTo(t.e2);
}


@Override
public String toString() {
	return "{"+e1+" , "+e2+"}";
}













	
}
