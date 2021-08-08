package chapter19generics;

public class WildCardNeed {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		GenericStack<Double>  doubleStack=new GenericStack<>();
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		doubleStack.push(2.2);
		doubleStack.push(4.4);
		doubleStack.push(-1.2);
		System.out.println(max(doubleStack));
System.out.println(max(intStack));
	}

	/** Find the maximum in a stack of numbers */
	public static double max(GenericStack<? extends Number> stack) {

		double max = stack.pop().doubleValue();
		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max) {
				max = value;
			}

		}
		return max;
	}

}
