package java_bookk;

public class Exercise01 {
	public static void main(String[] args) {
		
//		convert(16.5);
//		tip(10,1);
//		adder(19);
//		adder(234);
//		trip(900,30,3);
//		invest(1000,3.25,1);
//		invest(1000.56,4.25,1);
//		interest(1000,3.5);
//		areaTriangle(1.5,-3.4,4.6,5,9.5,-3.4);
//		power(1,2);
//		power(5,6);
//		compundValue(100);
//		bmi(95.5,50);	
		//areaHexagon(5.5);
		//windChill(5.3,6);
	
	
	}
	public static void convert(double ft) {
		System.out.println(ft+ " is "+0.305*ft+ " m.");
	}
	
	public static void tip(double bill, double tipRate) {
		double total=bill*(1+tipRate/100);
		double tip=bill*(tipRate/100);
		System.out.printf("The total is $%.2f and tip is $%.2f", total,tip);
	}
	
	public static void adder(int addend) {
		int x;
		int y=addend;
		int total=0;
		do {
			x=addend%10;
			addend/=10;
			total+=x;
		}while(addend>10);
		System.out.println("the sum of the integers of "+y+" is "+(total+addend));
	}
	static void trip(double distance,double mpg,double price) {
		System.out.printf("The cost of driving is $%.2f",distance/mpg*price);
	}

	static void invest(double capital, double monthlyRate,double years) {
		double futureInvestmentValue=capital*Math.pow((1+monthlyRate/100),years);
		System.out.println("Future investment value is $"+ futureInvestmentValue);
		//Sonra bak bi yanlis var sankim. PAge 74 soru 2.21
	}
	
	static void interest(double balance,double rate) {
		double interest=balance*(rate/1200);
		System.out.println("interest of next month : $"+Math.round(interest*100)/100.0);
	}
	static void areaTriangle(double x1, double y1, double x2,double y2,double x3,double y3) {
		double sideA=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		double sideB=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double sideC=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
		double s=(sideA+sideB+sideC)/2;
		double area=Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		System.out.println(Math.round(area*10)/10.0);
	}
	
	static void power(int a, int b) {
	System.out.println((int)Math.pow(a, b));	
		
	}
	
	static void compundValue(double amount) {
		int count=1;
		double temp=amount;
		amount=amount*(1+0.00417);
		while(count<2) {
			amount=(temp+amount)*(1+0.00417);
			count++;
		}
		System.out.println(amount+temp);
	}
	
	static void bmi(double weight, double height) {
		double weightKg=0.45359237*weight;
		double heightM=height*0.0254;
		double bmi=weightKg/Math.pow(heightM,2);
		System.out.println(Math.round(bmi*10000)/10000.0);
		
	}
	static void areaHexagon(double side) {
		double area=(3*Math.sqrt(3)/2)*Math.pow(side, 2);
		System.out.println(Math.round(area*10000)/10000.0);
	}
	
	static void windChill(double temp,double speed) {
		double windChill=(35.74+0.6215*temp-35.75*Math.pow(speed, 0.16)+0.4275*temp*Math.pow(speed, 0.16));
		System.out.println(windChill);
		
	}
	
	
	
}
