package chapter13;



public class RationalRunner {
	public static void main(String[] args) {
		
		Rational r1=new Rational(1,2);
		System.out.println(r1.getDenominator());
		System.out.println(r1.getNumerator());
		System.out.println(r1);
		MyRational r3=new MyRational();
		
		
		System.out.println(r3);
		Rational r4=new Rational(1,0);
		System.out.println(r4);
	}

}
