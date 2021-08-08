package chapter19generics;

import java.util.ArrayList;

public class Chapter19Runner {
public static void main(String[] args) {
GenericStack<String> stack1=new GenericStack<>();
stack1.push("London");
stack1.push("Paris");
stack1.push("Berlin");
GenericStack<Integer> stack2=new GenericStack<>();
stack2.push(1);
stack2.push(2);
stack2.push(3);
System.out.println(stack1);
System.out.println(stack2);

//Integer[] ints= {1,2,7,4,5,5,5};
//String[] str= {"London","Moscov","Turkeyt"};
//print(ints);
//print(str);

GenericStack stack=new GenericStack<>();//Raw type
GenericStack stack02=new GenericStack<>();



}
public static <E> void print(E[] list) {
	for(int i=0;i<list.length;i++) {
	System.out.println(list[i]+"");	
	System.out.println();	
	}
}
}
