package chapter10questions;

public class Staff extends Employee{
private String title;

public Staff() {
super();	
}
public Staff(String name) {
	super(name);
}

@Override
public String toString() {
return "My name is "+ super.getName()+" my class is "+this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);	
}
}
