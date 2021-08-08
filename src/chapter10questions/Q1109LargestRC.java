package chapter10questions;

import java.util.Arrays;
import java.util.Random;

public class Q1109LargestRC {

	public static void main(String[] args) {
		int[][] matrix= new int[3][2];
System.out.println(Arrays.deepToString(matrixm(matrix)));
	}
public static int[][] matrixm(int[][] arr) {
	int row=0;
	int column=0;
	int sum=0;
	int rowNum=0;
	Random random=new Random();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=random.nextInt(2);
			sum+=arr[i][j];
		}
	if(row<sum) {
		row=sum;
		rowNum=i;
	}
	sum=0;
	}
	System.out.println("Row Number" + rowNum +"Sum"+ row);
	return arr;
	
}
}
