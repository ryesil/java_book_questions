package chapter13;

public class TestRationalClass {
public static void main(String[] args) {
	
	MyRational r1=new MyRational(4,3);
	System.out.println(r1.toString());
	MyRational r2=new MyRational(1,2);
	r1.add(r2);
	System.out.println(r1.getNumerator());
	System.out.println(r1.getDenominator());
//	System.out.println(r1.add(r2).getDenominator());//4
	//System.out.println(r1.add(r2).getNumerator());//12
//	System.out.println(r1.add2(r2).getDenominator());//4
//	System.out.println(r1.add2(r2).getNumerator());//12
	System.out.println(r1.toString());
	System.out.println(r2.toString());
	MyRational r3=new MyRational(2,0);
	

}
}
