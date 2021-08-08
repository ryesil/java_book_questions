package chapter04;

import java.util.Scanner;

public class Chapter04Study {
	public static void main(String[] args) {

//	System.out.println(Math.ceil(2.1));
//	System.out.println(Math.sin(2*Math.PI));
//	System.out.println(Math.rint(2.5));
//	
//	double x=Math.round(Math.abs(-2.5));
//	System.out.println(x);
//	System.out.println(Math.toRadians(47));
//	System.out.println(Math.toDegrees(Math.PI/7));
//	lottery3("00");
//	double xx=34+(int)(Math.random()*22);
//	double yy=(int)(Math.random()*1000);
//	double zz= 5.5+(int)(Math.random()*5000)/100.0;
//	pentagon(4.5);
//  triangle(11,11,12);

//	System.out.println(zz);
//	//Chars ******************************
//	char ch='a';
//	System.out.println(++ch);
//	System.out.println((int)'a');
//	System.out.println("He said \"Java is fun\"");
//	System.out.println("Javaismis".contains("is"));
//	cities("Konya","Ankara");
//	String s= "Welcome to Java";
//	int last=s.lastIndexOf("o",20);
//	System.out.println(last);
//	String ch="\t Wel \t".trim();
//	System.out.println(ch);
//	String a="welcome";
//	int aaa=a.indexOf('a');
//	birthDayFinder();
//	System.out.println(40*21*4+"\\"+40*26*4);
//	System.out.println((52750/52)/40);
//	threePointsOnCircle();
//greatCircle(39.55,-116.25,41.5,87.37);
//10691.79183231593 km
//plate();



	}

static void triangle(double aa, double bb, double cc) {
double side1=(int)(aa*100)/100.0;
double side2=(int)(bb*100)/100.0;
double side3=(int)(cc*100)/100.0;
double angle1=(int)((Math.toDegrees(Math.acos((Math.pow(side2, 2)+Math.pow(side3, 2)-Math.pow(side1, 2))/(2*side2*side3))))*100)/100.0;
double angle2=(int)(Math.toDegrees(Math.acos((Math.pow(side3, 2)+Math.pow(side1, 2)-Math.pow(side2, 2))/(2*side1*side3)))*100)/100.0;
double angle3=(int)(Math.toDegrees(Math.acos((Math.pow(side2, 2)+Math.pow(side1, 2)-Math.pow(side3, 2))/(2*side2*side1)))*100)/100.0;

boolean a= (Math.abs(side1-side2)<side3)&&(side3<(side1+side2));
boolean b= (Math.abs(side2-side3)<side1)&&(side1<(side2+side3));
boolean c= (Math.abs(side1-side3)<side2)&&(side2<(side1+side3));
boolean d= side1==side2;
boolean e= side1==side3;
boolean f= side2==side3;
boolean g=angle1>90;
boolean h= angle2>90;
boolean k= angle3>90;
boolean l=angle1==90;
boolean m=angle2==90;
boolean n=angle3==90;
String result1="";
String result2="";

if(g||h||k) {
	result2="obtuse";
} else if(l||m||n) {
	result2="right";
}else {
	result2="acute";
}

if(a&&b&&c) {
	
	if(d&&e&&f) {
	result1=String.format("The given sides %.2f, %.2f, %.2f form an %s-angled equilateral triangle with angles %.2f, %.2f, %.2f." 
			,side1,side2,side3,result2,angle1,angle2,angle3);
	}else if (d||e||f) {
	result1=String.format("The given sides %.2f, %.2f, %.2f form an %s-angled isoscelles triangle with angles %.2f, %.2f, %.2f."
			,side1,side2,side3,result2 ,angle1,angle2,angle3);
} else {
	result1=String.format("The given sides %.2f, %.2f, %.2f form an %s-angled scalene triangle with angles %.2f, %.2f, %.2f."
			,side1,side2,side3,result2,angle1,angle2,angle3);
}
} else {
	result1=String.format("The given sides %.2f, %.2f, %.2f don't form a triangle ",side1,side2,side3);
}
System.out.println(result1);
}

	static void threePointsOnCircle() {
		double r = 40;
		double degree = Math.round(1 + Math.random() * 89);
		double angle1 = Math.round(Math.toRadians(degree));
		double degree2 = Math.round(degree + Math.random() * (90 - degree));
		double angle2 = Math.round(Math.toRadians(degree2));
		double degree3 = 180 - (degree + degree2);
		double angle3 = Math.round(Math.toRadians(degree3));
		double xCor1 = 40 * Math.cos(angle1);
		double yCor1 = 40 * Math.sin(angle1);
		double xCor2 = 40 * Math.cos(angle2);
		double yCor2 = 40 * Math.sin(angle2);
		double xCor3 = 40 * Math.cos(angle3);
		double yCor3 = 40 * Math.sin(angle3);

		System.out.printf(
				"Three points of a triangle that are on a circle with %.0f radius are (%.0f,%.0f), (%.0f,%.0f), (%.0f,%.0f)",
				r, xCor1, yCor1, xCor2, yCor2, xCor3, yCor3);

	}

	static void plate() {
		char let1 = (char) ((int) ('A' + Math.random() * (1 + 'Z' - 'A')));
		char let2 = (char) ((int) ('A' + Math.random() * (1 + 'Z' - 'A')));
		char let3 = (char) ((int) ('A' + Math.random() * (1 + 'Z' - 'A')));
		int dit1 = (int) (Math.random() * 10);
		int dit2 = (int) (Math.random() * 10);
		int dit3 = (int) (Math.random() * 10);
		int dit4 = (int) (Math.random() * 10);
		String platee = String.format("%c%c%c%d%d%d%d", let1, let2, let3, dit1, dit2, dit3, dit4);
		System.out.println(platee);
	}

	static void greatCircle(double lat1, double lon1, double lat2, double lon2) {
		double lat1R = Math.toRadians(lat1);
		double lon1R = Math.toRadians(lon1);
		double lat2R = Math.toRadians(lat2);
		double lon2R = Math.toRadians(lon2);
		double radius = 6371.01;
		double d = radius * Math
				.acos(Math.sin(lat1R) * Math.sin(lat2R) + Math.cos(lat1R) * Math.cos(lat2R) * Math.cos(lon1R - lon2R));
		System.out.println(d);
		System.out.printf("%.1f km", d);
	}

	static void pentagon(double r) {

		double s = 2 * r * Math.sin(Math.PI / 5);

		double area = Math.round(((5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5)) * 100)) / 100.0;
		System.out.println("The area of the pantegon with " + r + "0" + " radius is " + area + " sq");
		System.out.printf("The area of the pantegon with %.2f radius is %.2f sq", r, area);
	}

	static void lottery3(String num) {
		String random = "" + ((int) (Math.random() * 10)) + ((int) (Math.random() * 10));
		String price = "";
		if (num.equals(random)) {
			price = "10000";
		} else if (num.charAt(0) == random.charAt(1) && num.charAt(1) == random.charAt(0)) {
			price = "3000";
		} else if (num.charAt(0) == random.charAt(0) || num.charAt(0) == random.charAt(1)
				|| num.charAt(1) == random.charAt(0) || num.charAt(1) == random.charAt(1)) {
			price = "1000";
		} else {
			price = " No Price";
		}

		System.out.println("Lottery number is " + random + " your number is " + num + " adn the price is " + price);
	}

	static void birthDayFinder() {
		String set1 = "{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31}";
		String set2 = "{2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31}";
		String set3 = "{4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31}";
		String set4 = "{8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31}";
		String set5 = "{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}";
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		System.out.println("Does your birthday appear in the following set, Y/N?" + "\n" + set1);
		String answer1 = in.next();
		System.out.println("Does your birthday appear in the following set, Y/N?" + "\n" + set2);
		String answer2 = in.next();
		System.out.println("Does your birthday appear in the following set, Y/N?" + "\n" + set3);
		String answer3 = in.next();
		System.out.println("Does your birthday appear in the following set, Y/N?" + "\n" + set4);
		String answer4 = in.next();
		System.out.println("Does your birthday appear in the following set, Y/N?" + "\n" + set5);
		String answer5 = in.next();
		if (answer1.equalsIgnoreCase("y")) {
			a = Integer.parseInt(Character.toString(set1.charAt(1)));
		}
		if (answer2.equalsIgnoreCase("y")) {
			b = Integer.parseInt(Character.toString(set2.charAt(1)));
		}
		if (answer3.equalsIgnoreCase("y")) {
			c = Integer.parseInt(Character.toString(set3.charAt(1)));
		}
		if (answer4.equalsIgnoreCase("y")) {
			d = Integer.parseInt(Character.toString(set4.charAt(1)));
		}
		if (answer5.equalsIgnoreCase("y")) {
			e = Integer.parseInt(set5.substring(1, 3));
		}
		int birthday = a + b + c + d + e;
		System.out.println("Your birthDay is : " + birthday);
	}

	static void cities(String city1, String city2) {
		int com = city1.compareTo(city2);
		if (com < 0) {
			System.out.println("\tNumber 1: " + city1 + "\nNumber two is :" + city2);
		} else if (com > 0) {
			System.out.println("Number 1: " + city2 + "\nNumber two is :" + city1);
		}

	}
}
