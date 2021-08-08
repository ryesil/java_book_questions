package chapter10questions;

public class Student extends Person {
private Status classStatus=Status.FRESHMEN;


public Student() {
	super();
}
public Student(String name, int status) {
	super(name);
	switch(status) {
	case 1:
	this.classStatus=Status.FRESHMEN;
	break;
	case 2:
		this.classStatus=Status.SOPHOMORE;
		break;
	case 3:
	this.classStatus=Status.JUNIOR;
	break;
	case 4:
	this.classStatus=Status.SENIOR;
	break;
	}
}


@Override
public String toString() {
return "My name is "+ super.getName()+" my class is "+this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1)+" My status is "+classStatus;	
}

public void greet() {
	System.out.println("Hi I am student.");
}
	
}
