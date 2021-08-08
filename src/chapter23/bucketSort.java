package chapter23;

import java.util.ArrayList;

public class bucketSort {
public static void main(String[] args) {
	
	
	
	
	
}
	public static <E> void bucketSorting(E[] list) {
		E[] bucket =(E[]) new ArrayList[t+1];
		
		//Distribute the elements from list to buckets
		for(int i=0;i<list.length;i++) {
			int key =list[i].getKey() // assume element has the get key()
		
		if(bucket[key]==null)
		bucket[key]=new ArrayList<>();
			bucket[key].add(list[i]);
		
		}
	//Now move the elements from the buckets back to list
		int k=0; // k is na index for list
		for(int i=0;i<bucket.length;i++) {
			if(bucket[i]!=null) {
				for(int j=0;j<bucket[i].size(); j++)
					list[k++]=bucket[i].get(j);
			}
		}
	}
}	
	

 