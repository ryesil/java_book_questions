package chapter11exceptions;

public class TestException {
public static void main(String[] args) {
	try {
		System.out.println(sum(new int[]{1,2,3,4,5}));
	}
	catch( Exception ex) {
		ex.printStackTrace();
		System.out.println();
		ex.getMessage();
		System.out.println();
		ex.toString();
		System.out.println();
		System.out.println("TraceInfo obtained from getStackTrace");
		StackTraceElement[] traceElements=ex.getStackTrace();//get stackTrace
		for (int i=0;i<traceElements.length;i++) {
			System.out.println("Method"+ traceElements[i].getMethodName());
			System.out.println("( "+traceElements[i].getClassName()+":");
			System.out.println(traceElements[i].getLineNumber()+")");
		}
	}
	
	
	
}
private static int sum(int[] list) {
	int result = 0;
	for(int i=0;i<=list.length;i++) {
		result+=list[i];
	}
	return result;
}
}
