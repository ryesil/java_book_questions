package chapter10questions;

public class Faculty extends Employee{
private String officeHours;
private String rank;
public Faculty() {
	super();
}

public Faculty(String name) {
	super(name);
}


@Override
public String toString() {
return "My name is "+ super.getName()+" my class is "+this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);	
}

}
