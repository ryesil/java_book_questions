package chapter10questions;

import java.util.Date;

public class Employee extends Person{
private String office;
private double salary;
private Date date=new Date();

public Employee(String name) {
	super(name);
}


@Override
public String toString() {
return "My name is "+ super.getName()+" my class is "+this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);	
}





public Employee() {
	super();

}

}
