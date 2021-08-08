package chapter13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		
		
		List<Number> list = new ArrayList<>();

		int int1 = 1;
		double dob = 1.2;
		float fl = 12.4f;
		byte bytew = 2;
		BigInteger bi = new BigInteger("123412345634568765438765432345677654");
		BigDecimal bd = new BigDecimal("1234567876543.12345678987654321234567876543");

		list.add(int1);
		list.add(dob);
		list.add(fl);
		list.add(bytew);
		list.add(bi);
		list.add(bd);
		System.out.println(list);
		System.out.println(compare(list));
		Date date=new Date();
	
		
	}

	public static Number compare(List<Number> list) {
		double largest = list.get(0).doubleValue();
		if (list.size() == 0 || list.isEmpty()) {
			return null;
		} else {
			for (Number i : list) {

				if (i.doubleValue() > largest) {
					largest = i.doubleValue();
				}

			}
			return largest;

		}

	}

}
