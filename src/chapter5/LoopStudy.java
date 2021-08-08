package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoopStudy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//	guess();
//	isPrime(2);
//	isPrime(8);
//	isPrime(21);
//	isPrime(5);
//	isPrime(7);
//	isPrime(13);
//	isPrime(257);
//	isPrime(0);
//	isPrime(1);

//String a="ramazan";
//String b="namazar";
//String c="";
//char d=' ';
//
//for(int i=0;i<a.length();i++) {
//	
//}
////if (num[i] > num[j]) 
////{
////    temp = num[i];
////    num[i] = num[j];
////    num[j] = temp;
//
//
//String aa="ramazan";
//String bb="";
//for(int i=0;i<a.length();i++) {
//	if(aa.indexOf(a.charAt(i))==aa.lastIndexOf(a.charAt(i))){
//		bb+=aa.charAt(i);
//	}
//}
//System.out.println(bb);
//
//
//String alpha="ana";
//String beta="";
//
//
//for(int i=alpha.length()-1;i>-1;i--) {
//	beta+=alpha.charAt(i);
//}
//if(alpha.equals(beta)) {
//	System.out.println("true");
//}else {
//	System.out.println("false");
//}
//subtractionQuiz();
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter an integer; if 0 entered, the addition ends.");
//	int data=in.nextInt();
//	int sum=0;
//	while(data!=0) {
//		sum+=data;
//	System.out.println("Enter an integer; if 0 entered, the addition ends.");
//	data=in.nextInt();
//	}
//	
//	System.out.println("The sum is "+sum);
//	
//	
//	int number=in.nextInt();
//	int max=number;
//	while (number!=0) {
//		System.out.println("int?");
//		number=in.nextInt();
//		if(number>max) {
//			max=number;
//		}
//	}
//	System.out.println(max);
//	int num;
//	int s=0;
//	do {
//		System.out.println("Integer if 0 terminates");
//		num=in.nextInt();
//		s+=num;
//	}while(num!=0);
//	multiplicationTable();

//	System.out.println("Enter a number");
//	int num = in.nextInt();
//	System.out.println("Multiplication Table");
//	for (int i=1;i<=num;i++) {
//		for(int j=1;j<10;j++) {
//			System.out.printf("%4d",i*j);
//		}
//		System.out.println();
//	}
//	gcd(72,99);

//	System.out.println("Email?");
//	
//	String email=in.nextLine();
//	
//	if(email.contains("hotmail")){
//		email=email.replace("hotmail","gmail");
//	}
//	System.out.println(email);
		// gcd(125,2525);

//	String a="alpha";
//	int b=a.length()-1;
//	if(b%2==1&&b>=3) {
//		char c=a.charAt((b+1)/2);
//		System.out.println(c);
//	} else if(b%2==0&&b>=3) {
//		String d=a.substring(b,b+1);
//		System.out.println(d);
//	}

//	for (int i=1;i<=7;i++) {
//		System.out.print(i+" | ");
//		for(int j=1;j<=i;j++) {
//			System.out.printf("%3d",i);
//		}
//		System.out.println();
//		
//	}
//	futureTuiton2(10000,7);
//	System.out.println();
//	futureTuiton(10000,7);
//	System.out.println();
//	
//	Scanner input=new Scanner(System.in);
//	System.out.println("A number?");
//	int next=input.nextInt();
//	int next1=(int) (Math.pow(next,3)/2);
//	System.out.println(next1);
//  hexadecimals(1234);	
//int sum=0;
//int count=0;
//while(count<20) {
//System.out.println("integer");
//int x=in.nextInt();
//sum+=x;
//count++;
//if(sum>100) {
//	break;
//}
//}
//System.out.println(sum);			
//System.out.println("integer");
//int x=in.nextInt();
//int count=2;
//while(count<=x) {
//if(x%count==0) {
//	break;
//}
//count++;
//}		
//System.out.println(count);		

//	System.out.println("integer");
//	int x=in.nextInt();
//	int count=2;
//	while(count<=x&&x%count!=0) {
//		count++;
//	}
//		
//	System.out.println(count);			
//		System.out.println("string");
//		String x=in.nextLine();	
//		int count=0;
//		boolean isPalindrome=true;
//		while(count<x.length()) {
//			if(x.charAt(0+count)!=x.charAt(x.length()-1-count)) {
//				isPalindrome=false;
//				break;
//			}
//			count++;
//		}
//		System.out.println(isPalindrome);

//		System.out.println("integer");
//		int count=0;
//		String list="";
//		int x=in.nextInt();
//		for(int i=1;i<=x;i++) {
//			int k=i/2;
//			for(int j=1;j<=k;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==1) {
//				list=list+i+", ";
//			}
//			count=0;
//		}
//		System.out.println(list);
//	kg(199);
//		mile(10);
//pyramid(3);
//financial(10,10000,5);
//highestScore();
//longestString();
//upperCaseCount();	
//vowelConsanant();	
//oddChars();
//isbn13("97801320");
//reverseString("ramazan");
//double[] a= {1,2,3,4.5,5.6,6,7,8,9,10};
//	mean(a);	
//	std(a);
//combinations(7);
	//greatestNum();
	
	hTSimulation(1000);
	
		
	}

	public static void hTSimulation(int num) {
		String flip="";
		int k=num/20>0?num/20:1;
		int heads=0;
		int tails=0;
		for(int j=1;j<=k;j++) {
		for(int i=1;i<=20;i++) {
			int random= (int) (Math.random()*2);
			if(random==0) {
				flip="H";
				heads++;
			}else {
				flip="T";
				tails++;
			}
			System.out.print(flip+" ");
		}
		System.out.println();
		}
		for(int i=1;i<=num%20;i++) {
			int random= (int) (Math.random()*2);
			if(random==0) {
				flip="H";
				heads++;
			}else {
				flip="T";
				tails++;
			}
			System.out.print(flip+" ");
		}
		
		System.out.println();
		System.out.printf("Number of tails : %d",tails);
		System.out.println();
		System.out.printf("Number of heads : %d", heads);
	}
	
	
	public static void greatestNum() {
		ArrayList<Integer> list = new ArrayList<>();
		int temp2=0;
		int temp1=0;
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers will you enter");
		int numOfNumbers=in.nextInt();
		for(int i=1;i<=numOfNumbers;i++) {
			System.out.println("Number "+i);
			temp1=in.nextInt();
			list.add(temp1);
			if(temp1>=temp2) {
			temp2=temp1;
			}
			
		}
		int count=0;
		for(int i=0;i<=list.size()-1;i++) {
			if(list.get(i)==temp2) {
				count++;
			}
		}
		System.out.println("The greates number is "+temp2+" and " + temp2+ " appears "+count+ " times.");
		System.out.printf("The greatest num is %d and %d appears %d times",temp2,temp2,count);
		
	}
	
	
	
	public static void combinations(int num) {
		int count=0;
		for(int i=1;i<=num-1;i++) {
			for(int j=i+1;j<=num;j++) {
			count++;
				
			}
			
			
			
		}
		
	System.out.println(count);
	}
	
	
	
	
	public static double std(double[] arr) {
		double distSum = 0;
		for (double i : arr) {
			distSum += Math.pow(i, 2);
		}
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}
		double stds = Math.sqrt((distSum - (Math.pow(sum, 2) / arr.length)) / (arr.length - 1));
		System.out.println(stds);
		return stds;
	}

	public static double mean(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double ave = Math.round((sum / arr.length) * 100) / 100.0;
		System.out.println(ave);
		return ave;
	}

	public static void reverseString(String string) {
		String gnirts = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			gnirts += string.charAt(i);
		}
		System.out.println(gnirts);
	}

	public static void isbn13(String num) {
		int sum = 0;
		if (num.length() != 12) {
			return;
		}
		for (int i = 1; i <= num.length(); i += 2) {
			sum += (Character.getNumericValue(num.charAt(i))) * 3;
		}
		System.out.println(sum + " sum");
		System.out.println(num.charAt(11));
		sum = 10 - sum % 10;
		num += sum == 10 ? "0" : sum;
		System.out.println(num);

	}

	static void oddChars() {
		Scanner in = new Scanner(System.in);
		System.out.println("String");
		String str = in.nextLine();
		String temp = "";
		int i = 1;
		while (i <= str.length() / 2) {
			temp += str.charAt(2 * i - 1);
			i++;
		}
		System.out.println(temp);
	}

	static void vowelConsanant() {
		Scanner in = new Scanner(System.in);
		System.out.println("String");
		String str = in.nextLine().replaceAll("[^a-zA-Z]", "");
		int consts = 0;
		int vows = 0;
		int i = 0;
		ArrayList<Character> a = new ArrayList<>();
		a.add('a');
		a.add('e');
		a.add('i');
		a.add('o');

		str.toLowerCase();
		while (i < str.length()) {
			str.toLowerCase();
			if (a.contains(str.charAt(i))) {
				vows++;
			} else {
				consts++;
			}
			i++;
		}
		System.out.printf("Number of Consanants is %d", consts);
		System.out.println();
		System.out.printf("Number of Vowels is %d", vows);
	}

	static void upperCaseCount() {
		Scanner in = new Scanner(System.in);
		System.out.println("String");
		String str = in.nextLine();
		int i = 0;
		int count = 0;
		while (i < str.length()) {
			if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
				count++;
			}
			i++;
		}
		System.out.println("# of UpperCases is: " + count + ".");

	}

	static void longestString() {
		Scanner in = new Scanner(System.in);
		System.out.println("String 1");
		String one = in.nextLine();
		System.out.println("String 2");
		String two = in.nextLine();
		String a = "";
		String b = "";
		String aa = one.length() >= two.length() ? two : one;
		for (int i = 0; i < aa.length(); i++) {
			if (one.charAt(i) == two.charAt(i)) {
				a += aa.charAt(i);
				if (a.length() > b.length()) {
					b = a;
				}
			} else {

				a = "";
			}
		}
		System.out.println("Second Longest String: " + "(" + a + ")");
		System.out.println("-----------------");
		System.out.println("Longest String: " + "(" + b + ")");
	}

	static void highestScore() {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of Students");
		int number = in.nextInt();
		double temp1 = 0;
		String most = "";
		String most2 = "";
		String list[] = new String[number];
		for (int i = 0; i <= list.length - 1; i++) {
			System.out.println("Student " + (i + 1));
			list[i] = list();
			if (Double.parseDouble(list[i].substring((list[i].indexOf('#') + 1))) > temp1) {
				temp1 = Double.parseDouble(list[i].substring((list[i].indexOf('#') + 1)));
				most2 = most;
				most = list[i].replace('#', ' ');
				in.close();
			}

		}

		System.out.printf("The student with the highest score is %s with a score of %.0f.",
				most.substring(0, most.lastIndexOf(' ')),
				Double.parseDouble(most.substring(most.lastIndexOf(" ") + 1)));
		System.out.println();
		System.out.printf("The student with the second highest score is %s with a score of %.0f.",
				most2.substring(0, most.lastIndexOf(' ')),
				Double.parseDouble(most2.substring(most2.lastIndexOf(" ") + 1)));
	}

	static String list() {
		Scanner in = new Scanner(System.in);
		System.out.println("Name?");
		String name = in.nextLine();
		System.out.println(name + "'s Score");
		double score = in.nextDouble();
		return name + "#" + score;

	}

	static void financial(int year, double tuiton, double rate) {
		int count = 0;
		double total = 0;
		while (count <= year) {
			tuiton += tuiton * (rate / 100);
			count++;
			if (count == 4) {
				total = tuiton;
			}

		}
		System.out.println("Four year :$" + ((int) (total * 100)) / 100.0);
		System.out.println("Total :$" + ((int) (tuiton * 100)) / 100.0);

	}

	static void pyramid(int num) {
		String f = "";
		for (int i = 1; i <= num; i++) {
			f += " ";
		}
		int l = f.length();
		for (int i = 1; i <= num; i++) {
			String before = f.substring(0, l - i);
			for (int j = 1; j <= i; j++) {

				System.out.print(before + j);

			}
			System.out.println();
		}
	}

	static void mile(int mile) {
		int count = 1;
		System.out.println("Mile" + "           " + "KM");
		while (count <= mile) {
			System.out.println(count + "             " + (int) (count * 1.609 * 100) / 100.0);
			count++;
		}
	}

	static void kg(int num) {
		int count = 0;
		System.out.println("Kg" + "       " + "Pounds");
		while (count <= num) {
			System.out.println(count + "        " + Math.round(count * 22) / 10.0);
			count++;
		}

	}

	static void hexadecimals(int num) {
		String str = "";
		int reminder = 0;
		while (num > 0) {
			reminder = num % 16;
			num = num / 16;
			System.out.println(reminder);
			if (reminder < 10) {
				str = reminder + str;
			} else if (reminder == 10) {
				str = 'A' + str;
			} else if (reminder == 11) {
				str = 'B' + str;
			} else if (reminder == 12) {
				str = 'C' + str;
			} else if (reminder == 13) {
				str = 'D' + str;
			} else if (reminder == 14) {
				str = 'E' + str;
			} else if (reminder == 15) {
				str = 'F' + str;
			}
		}
		System.out.println(str);

	}

	static void futureTuiton2(double tuiton, double rate) {// Neden bu alttakinden farkli?
		int count = 0;
		double doub = 2 * tuiton;
		while (tuiton <= doub) {
			tuiton += tuiton * (rate / 100);
			count++;
		}
		System.out.printf("In %d years, The tuiton will be $%.2f", count, tuiton);
	}

	static void futureTuiton(double tuiton, double rate) {
		int count = 0;
		double temp = tuiton;
		for (double i = tuiton; i <= 20000; i = temp * (1 + rate / 100)) {
			temp = i;
			count++;
		}
		System.out.printf("In %d years, The tuiton will be $%.2f", count, temp);

	}

	static void gcd(int num1, int num2) {
		int temp = num1 < num2 ? num1 : num2;
		int divisor = 1;

		for (int i = 1; i <= temp; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				divisor = divisor > i ? divisor : i;
			}
		}

		System.out.println(divisor);
	}

	static void multiplicationTable() {
		System.out.println("Multiplication Table");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.printf("%4d", i * j);

			}
			System.out.println();
		}

	}

	static void subtractionQuiz() {
		int correct = 0;
		int wrong = 0;
		for (int i = 1; i < 6; i++) {
			Scanner in = new Scanner(System.in);
			int random = (int) (Math.random() * 101);
			int random2 = (int) (Math.random() * 101);
			String x = "";
			if (random > random2) {
				x = random + " - " + random2;
			} else {
				x = random2 + " - " + random;
			}
			System.out.println("What is " + x + " ?");
			int result = in.nextInt();
			if (result == Math.abs(random - random2)) {
				System.out.println("Correct.");
				correct++;
			} else {
				System.out.println("false, the correct answer was " + Math.abs(random - random2));
				wrong++;
			}
		}
		System.out.println("Correct answers: " + correct + "\n" + "Wrong answers: " + wrong);

	}

	static void anagram(String a, String b) {
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if (Arrays.equals(c, d)) {
			System.out.println(a + " and " + b + " are anagrams.");
		} else {
			System.out.println(a + " and " + b + " are not anagrams.");
		}
	}

	static void isPrime(int num) {
		int dividers = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				dividers++;
			}
		}
		System.out.println(dividers == 1 ? num + " is a prime number." : num + " is not a prime number");
	}

	static void guess() {
		Scanner in = new Scanner(System.in);
		int random = (int) (Math.random() * 101);
		System.out.println("Guess a magic number between 0 and 100!");
		int guess = in.nextInt();
		for (int i = 0; i != random; i = guess) {
			if (guess < random) {
				System.out.println("Too low! Try again ");
				guess = in.nextInt();
			} else if (guess > random) {
				System.out.println("Too high! Try again");
				guess = in.nextInt();
			}

		}
		System.out.println("Great you found the magic number: " + random);

	}

}
