package chapter10questions;

import java.util.ArrayList;
import java.util.List;

public class Q1117PerfectSquare {

	public static void main(String[] args) {

		perfectSquare(6323456);
		
		
		

	}
public static int perfectSquare(int m) {
	int n=1;
	List<Integer> list=new ArrayList<>();
	
	for(int i=2;i<=m;i++) {
		if(m%i==0) {
			list.add(i);
			m/=i;
			i--;
		}
	}
	List<Integer> list2= new ArrayList<>(list);
	for(int i=0;i<list.size();i++) {
		int count=0;
		for(int j=0;j<list2.size();j++) {
			if(list.get(i)==list2.get(0)) {
				count++;
				list2.remove(0);
				j--;
			}
			
		}
		if(count%2==1) {
			n*=list.get(i);
		}
		count=0;
		
	}
	System.out.println(list);
	System.out.println(n);
	return n;
}
}
