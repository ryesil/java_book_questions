package chapter19generics;

public class TestMatrix {
public static void main(String[] args) {
	IntegerMatrix i1=new IntegerMatrix();
	Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
	Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
	
	System.out.println("m1+m2 is ");
	IntegerMatrix.printMatrix(m1, m2, i1.addMatrix(m1, m2), '+');
	GenericMatrix.printMatrix(m1, m2, i1.multiplyMatrix(m1, m2), 'X');
}
}
