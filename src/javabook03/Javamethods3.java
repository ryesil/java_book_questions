package javabook03;

import java.util.Scanner;

public class Javamethods3 {
	public static void main(String[] args) {
//	double tax1=835;
//	double tax2=3840;
//	double tax3=12075;
//	double tax4=25004;
//	double tax5=66462;
//	double tax6=(income-372950)*0.35;

//	bodyM(12);
//	bodyM(18);
//	bodyM(23);
//	bodyM(32);
//	incomeTax(10000,"single");
//	System.out.println();
//	incomeTax(400000,"single");
//	divide(12);
//	divide(10);
//	divide(9);
//	isTrue(4.6);
//	isLeapYear(2002);
//	lottery(41);
//	lottery2(21);
		// quadratic(1,3,2);
		// quadratic(1,2,3);
		// System.out.println(Math.pow(4, 2)-4*2*2);
		// month();
		// futureDayOfWeek("sunday",31);
		// orderThreeIntegers(4,3,4);
		// isbn10(123456788);
		// isbn10(013601267);
		// headsTails("t");
		// calander(2012, 2);
		// palindrome(011);
		// lottery1(222);
		// cost(50.1);
		// RPS();
		// twoCircles(5.5,3,3.4,5.7,6.7,3.5);
//	System.out.println(Integer.parseInt(Integer.toString(024,8))==24);
//	System.out.println(Integer.toString(024,8).length());
//Scanner in=new Scanner(System.in);
//System.out.println("ssn?");
//String ssn=String.format("%9s",in.next().substring(5));
//System.out.println(ssn.length()==9?"The ssn is "+ssn:"The number of digits must be 9.");
//Scanner in=new Scanner(System.in);
//System.out.println("SSN?");
//StringBuilder ssn=new StringBuilder(in.next()).replace(0, 5, "*****");
//System.out.println(ssn.length()==9?ssn:"ssn must be 9-digit long.");
//	Scanner in=new Scanner(System.in);
//	System.out.println("ssn?");
//	String ssn=in.next().replaceAll("[/-]", "");
//	String ssn1=String.format("*****%s",ssn.matches("\\d{9}")?ssn.substring(5):"Oppsss!!!!");
//	System.out.println(ssn1.length()==9?"The ssn is "+ssn1:"SSN must be 9-digit long and nothing but numbers please!.");

	}

	static void twoCircles(double radius1, double radius2, double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y1 - y2), 2));
		double sum = radius1 + radius2;
		double diff = Math.abs(radius1 - radius2);
		String result = "";
		if (distance < diff) {
			result = "Circle2 is inside circle1.";
		} else if (distance < sum) {
			result = "Circle2 overlaps circle1";
		} else {
			result = "Circles are seperate";
		}
		System.out.println(result);
	}

	static void cost(double weight) {
		double cost = 0;
		String warning = "";
		if (weight > 0 && weight <= 1) {
			cost = 3.5;
		} else if (weight > 1 && weight <= 3) {
			cost = 5.5;
		} else if (weight > 3 && weight <= 10) {
			cost = 8.5;
		} else if (weight > 10 && weight <= 20) {
			cost = 10.5;
		} else if (weight > 20 && weight <= 50) {
			double weight2 = weight % 20;
			double cost1 = 0;
			if (weight2 > 0 && weight2 <= 1) {
				cost1 = 3.5;
			} else if (weight2 > 1 && weight2 <= 3) {
				cost1 = 5.5;
			} else if (weight2 > 3 && weight2 <= 10) {
				cost1 = 8.5;
			} else if (weight2 > 10 && weight2 <= 20) {
				cost1 = 10.5;
			}
			cost = (int) (weight / 20) * 10.5 + cost1;
		} else {
			warning = "It cannot be shipped";
		}
		System.out.println(weight <= 50 ? cost : warning);

	}

	static void RPS() {
		Scanner in = new Scanner(System.in);
		System.out.println("Rock, Paper, Scissors");
		String str = in.next();// player makes his/her choice.
		int computerChoice = (int) (Math.random() * 3); // Computer choice: 0 is for Scissors, 1 is for Rock, 2 is for
														// Paper.
		boolean rock = str.toLowerCase().startsWith("r"); // True if player selects rock.
		boolean scissors = str.toLowerCase().startsWith("s"); // True if player selects scissors.
		boolean paper = str.toLowerCase().startsWith("p"); // True if player selects paper.

		String result = "";
		switch (computerChoice) {
		case 0:
			result = rock ? "Player wins" : paper ? "Computer wins" : "draw";

			break;
		case 1:
			result = paper ? "Player wins" : scissors ? "Computer wins" : "draw";
			break;
		case 2:
			result = scissors ? "Player wins" : rock ? "computer wins" : "draw";
			break;
		default:
			result = "Wrong entry";
		}
		System.out.println(result);
	}

	// System.out.println(userEntry?(computerChoice-userValue)<0?"Player
	// wins":(computerChoice-userValue)==0?"Draw":"Computer wins":"Invalid entry");

	static void lottery1(int num) {// took me all day.
		int random = (int) (Math.random() * 1000);
		StringBuffer random1 = new StringBuffer(String.format("%03d",
				Integer.toString(random, 8).length() < 3 ? Integer.parseInt(Integer.toString(random, 8)) : random));
		String random2 = random1.toString();
		StringBuffer num1 = new StringBuffer(String.format("%03d",
				Integer.toString(num, 8).length() < 3 ? Integer.parseInt(Integer.toString(num, 8)) : num));
		String num2 = num1.toString();
//	char[] random1=String.format("%03d",21).toCharArray();
//	char[] num1=String.format("%03d", num).toCharArray();
		char[] store = { 'a', 'a', 'a' };

		int suprise = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (random1.charAt(i) == num1.charAt(j)) {
					store[i] = num1.charAt(j);
					num1.replace(j, j + 1, "b");
					random1.replace(i, i + 1, "c");
				}
			}

		}
		String finale = ("" + store[0] + store[1] + store[2]).replaceAll("[a]", "");
		if (("" + store[0] + store[1] + store[2]).equals(num2)) {
			suprise = 10000;
		} else if (finale.length() == 3) {
			suprise = 3000;
		} else if (finale.length() > 0) {
			suprise = 1000;
		} else {
			suprise = 0;
		}
		System.out.println("The big suprise is " + "$" + suprise);
//	System.out.println((""+store[0]+store[1]+store[2]).equals(num2));
//	System.out.println(""+store[0]+store[1]+store[2]);
//	System.out.println(random1); 
//	System.out.println(random2);
//	System.out.println(num1);
//	System.out.println(num2);

	}

	static void palindrome(int num) {
		String mun = Integer.toString(num, 8).length() < 2 ? Integer.toString(num, 8).replaceAll("\\A", "00")
				: Integer.toString(num, 8).length() < 3 ? Integer.toString(num, 8).replaceAll("\\A", "0")
						: Integer.toString(num);
		System.out.println(mun);
		String m = new StringBuilder(mun).reverse().toString();
		System.out.println(m);
		if (mun.equals(m)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a Palindrome");
		}
	}

	static void calander(int year, int month) {
		String x = "";// takes up the month.
		// String
		// mnth=month.toUpperCase().substring(0,1).concat(month.toLowerCase().substring(1));
		boolean isLeap = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
		int y = 0;// takes up the number of days.
		switch (month) {
		case 1:
			x = "January";
			y = 31;
			break;
		case 2:
			x = "February";
			y = isLeap ? 29 : 28;
			break;
		case 3:
			x = "March";
			y = 31;
			break;
		case 4:
			x = "April";
			y = 30;
			break;
		case 5:
			x = "May";
			y = 31;
			break;
		case 6:
			x = "June";
			y = 30;
			break;
		case 7:
			x = "July";
			y = 31;
			break;
		case 8:
			x = "August";
			y = 31;
			break;
		case 9:
			x = "September";
			y = 30;
			break;
		case 10:
			x = "October";
			y = 31;
			break;
		case 11:
			x = "November";
			y = 30;
			break;
		case 12:
			x = "December";
			y = 31;
		default:
			x = "Month should be between 1 and 12 inclusive";
		}
		System.out.println(x + " " + year + " had " + y + " days.");
	}

	static void headsTails(String flip) {
		int x = (int) (Math.random() * 2);
		String y = x == 1 ? "Tails" : "Heads";
		String toss = flip.equalsIgnoreCase("Heads") || flip.equalsIgnoreCase("h") ? "Heads"
				: flip.equalsIgnoreCase("Tails") || flip.equalsIgnoreCase("t") ? "Tails" : "wrong entry";
		System.out.println(y);
		System.out.println(toss);
		if (y.equals(toss)) {
			System.out.println("You won");
		} else {
			System.out.println("I won");
		}
	}

	static void isbn10(long num) {
		int length = String.valueOf(num).length();
		int lastDigit = 0;
		long num2 = num;
		String isbn = "";
		if (length == 9) {
			for (int i = 1; i < 11; i++) {
				int d = (int) num % 10 * i;
				num /= 10;
				lastDigit += d;
			}
			lastDigit = lastDigit % 11;
			System.out.println("10th digit is " + lastDigit);
			System.out.println(isbn.concat("" + num2).concat("" + (lastDigit < 10 ? lastDigit : "X")));
		}

	}

	static void orderThreeIntegers(int a, int b, int c) {
		int x = a <= b ? a <= c ? a : c : b <= c ? b : c;
		int y = 0;
		int z = 0;
		if (x == a) {
			if (b <= c) {
				y = b;
				z = c;
			} else {
				y = c;
				z = b;
			}

		} else if (x == b) {
			if (a <= c) {
				y = a;
				z = c;
			} else {
				y = c;
				z = a;
			}

		} else if (x == c) {
			if (a <= b) {
				y = a;
				z = b;
			} else {
				y = b;
				z = a;
			}
		}
		System.out.println(x + " < " + y + " < " + z);

	}

	static void futureDayOfWeek(String day, int num) {
		String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		for (int i = 0; i < 7; i++) {
			if (week[i].equals(day.toUpperCase().substring(0, 1).concat(day.toLowerCase().substring(1)))) {
				int x = (num % 7 + i) % 7;
				System.out.println(week[x]);

			}
		}

	}

	static void month() {
		int random = (int) (Math.random() * 12 + 1);
		String m = "";
		switch (random) {
		case 1:
			m = "January";
			break;
		case 2:
			m = "February";
			break;
		case 3:
			m = "March";
			break;
		case 4:
			m = "April";
			break;
		case 5:
			m = "May";
			break;
		case 6:
			m = "June";
			break;
		case 7:
			m = "July";
			break;
		case 8:
			m = "August";
			break;
		case 9:
			m = "September";
			break;
		case 10:
			m = "October";
			break;
		case 11:
			m = "November";
			break;
		case 12:
			m = "December";
		}
		System.out.println(m);
	}

	static void quadratic(double a, double b, double c) {
		double discriminant = Math.round((Math.pow(b, 2) - 4 * a * c) * 100) / 100.0;
		double r1 = discriminant >= 0 ? Math.round(((-1 * b + Math.pow(discriminant, 0.5)) / (2 * a)) * 100) / 100.0
				: 0;// if discriminant is less than 0, it outputs 0.
		double r2 = discriminant >= 0 ? Math.round(((-1 * b - Math.pow(discriminant, 0.5)) / (2 * a)) * 100) / 100.0
				: 0;
		System.out.println(discriminant);
		System.out.println(r1 + ", " + r2);

		if (discriminant > 0) {
			System.out.printf("has two roots. Roots are %.2f and %.2f", r1, r2);

		} else if (discriminant == 0) {
			System.out.printf("has one root. Root is %.2f", r1);
		} else {
			System.out.println("Has no roots.");
		}

	}

	static void bodyM(double bdm) {
		String x;
		if (bdm < 18) {
			x = "Underweight";
		} else if (bdm < 25) {
			x = "Normal";
		} else if (bdm < 30) {
			x = "Overweight";
		} else {
			x = "Obese";
		}
		System.out.println(x);

	}

	static void incomeTax(double income, String status) {
		double taxBreaks[] = { 0.1, 0.15, 0.25, 0.28, 0.33, 0.35 };
		double tax;
		if (status.equals("single")) {
			if (income < 8351) {
				tax = income * 0.1;

			} else if (income < 33951) {
				tax = 8350 * 0.1 + (income - 8350) * 0.15;

			} else if (income < 82251) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			} else if (income < 171551) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			} else if (income < 372951) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.33;
			} else {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

			}
			System.out.printf("$%.2f", tax);

		} else if (status.equals("marriedJoint")) {

			if (income < 16701) {
				tax = income * 0.1;

			} else if (income < 67901) {
				tax = 16700 * 0.1 + (income - 16700) * 0.15;

			} else if (income < 137051) {
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;

			} else if (income < 208851) {
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			} else if (income < 372951) {
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (income - 208850) * 0.33;
			} else {
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;

			}

		} else if (status.equals("marriedSep")) {

			if (income < 8351) {
				tax = income * 0.1;

			} else if (income < 33951) {
				tax = 8350 * 0.1 + (income - 8350) * 0.15;

			} else if (income < 68526) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			} else if (income < 104426) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			} else if (income < 186476) {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (income - 104425) * 0.33;
			} else {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104425) * 0.33 + (income - 186475) * 0.35;

			}

		} else if (status.equals("Head")) {
			if (income < 11951) {
				tax = income * 0.1;

			} else if (income < 45501) {
				tax = 11950 * 0.1 + (income - 11950) * 0.15;

			} else if (income < 117451) {
				tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;

			} else if (income < 190201) {
				tax = 8350 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			} else if (income < 372951) {
				tax = 8350 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (income - 190200) * 0.33;
			} else {
				tax = 8350 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (372950 - 190200) * 0.33 + (income - 372950) * 0.35;

			}

		}

	}

	static void divide(int num) {

		String x = "";
		if (num % 2 == 0 && num % 3 == 0) {
			x = "2 and 3";
		} else if (num % 2 == 0 ^ num % 3 == 0) {
			x = "2 but 3 or 3 but 2";
		} else if (num % 2 == 0 || num % 3 == 0) {
			x = "2 or 3";
		}
		System.out.println(x);
	}

	static void isTrue(double x) {

		System.out.println(x >= 1 && x <= 100);
		System.out.println(Math.abs(x - 5) < 5);
		System.out.println(Math.abs(x - 5) > 4.5);
		System.out.println(12 > 1 ^ 11 < 1);
	}

	static void isLeapYear(int year) {
		boolean isTrue = (year % 400 == 0) || (year % 100 != 0 & year % 4 == 0);
		String x = "";
		if (isTrue) {
			x = "is leap year";
		} else {
			x = "not a leap year";
		}
		System.out.println(x);
	}

	static void lottery(int num) {
		String random = String.format("%02d", (int) (Math.random() * 100));
		char x = random.charAt(0);
		char y = random.charAt(1);
		char a = String.format("%02d", num).charAt(0);
		char b = String.format("%2d", num).charAt(1);
		int price = 0;
		if (a == x && b == y) {
			price = 10000;
		} else if (a == y && b == x) {
			price = 3000;
		} else if ((a == x ^ b == y) || (a == y ^ b == x)) {
			price = 1000;
		}
		System.out.println(price);
	}

	static void lottery2(int num) {
		int random = ((int) Math.random() * 100);
		int a = num % 10;
		int b = (num / 10) % 10;
		int c = random % 10;
		int d = (random / 10) % 10;
		int e = 0;
		if (a == c && b == d) {
			e = 10000;
		} else if (a == d && b == c) {
			e = 3000;
		} else if ((a == c ^ b == d) || (a == d ^ b == c)) {
			e = 1000;
		}
		System.out.println(e);
	}

}
