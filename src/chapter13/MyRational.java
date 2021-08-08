package chapter13;

public class MyRational extends Number implements Comparable<MyRational>{
	private static final long serialVersionUID = 1L;
	private long numerator;
	private long denominator;
	
	public MyRational() {
		numerator=0;
		denominator=1;
	}
	public MyRational(long numerator, long denominator) {
		this.numerator=numerator;

		this.denominator=denominator;
		
	}
	
	public void setNumerator(long numerator) {
		this.numerator=numerator;
	}
	public long getNumerator() {
		return this.numerator;
	}
	public void setDenominator(long denominator) {
		this.denominator=denominator;
	}
	
	public long getDenominator() {
		return this.denominator;
	}
	
	public MyRational add(MyRational secondRational) {
		if(this.denominator==secondRational.denominator) {
			this.numerator+=secondRational.numerator;
			return this;
		}else {
		long num1=secondRational.denominator/obeb(this.denominator, secondRational.denominator);
		long num2=this.denominator/obeb(this.denominator, secondRational.denominator);

		this.numerator=this.numerator*num1+secondRational.numerator*num2;
		this.denominator=okek(this.denominator,secondRational.denominator);
		return this;
		}
	}
	
//	public Rational add2(Rational secondRational) {
//		this.setNumerator(this.numerator*secondRational.denominator+
//				secondRational.numerator*this.denominator);
//		this.setDenominator(this.denominator*secondRational.denominator);
//		return this;
//	}
	
	
	
	
	
	public MyRational subtract(MyRational secondRational) {
		if(this.denominator==secondRational.denominator) {
			this.numerator-=secondRational.numerator;
			return this;
		}else {
		long num1=secondRational.denominator/obeb(this.denominator, secondRational.denominator);
		long num2=this.denominator/obeb(this.denominator, secondRational.denominator);

		this.numerator=this.numerator*num1-secondRational.numerator*num2;
		this.denominator=okek(this.denominator,secondRational.denominator);
		return this;
		}
	}
	public MyRational multiply(MyRational secondRational) {
		this.numerator*=secondRational.numerator;
		this.denominator*=secondRational.denominator;
		return this;
	}
	
	public MyRational divide(MyRational secondRational) {
		this.numerator*=secondRational.denominator;
		this.denominator*=secondRational.numerator;
		return this;
	}
	
	@Override
	public String toString() {
	return "Numerator: "+numerator+"\nDenominator: "+denominator;
	}
	
	
	
	
	public long obeb(long num1, long num2) {
		long max=num1<num2?num1:num2;
		long obeb=1l;
		for(long i=1l;i<=max;i++) {
			if(num1%i==0&&num2%i==0) {
				obeb=i;
			}
		}
		return obeb;
	}

	public long okek(long num1,long num2) {
		return num1*num2/obeb(num1, num2);
	}
	
	
	
	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(MyRational o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
