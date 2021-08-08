package chapter10questions;

/*
 A person has a name,
address, phone number, and e-mail address.
 */
public class Person {
private String name;
private String phone;
private String email;

public Person() {
	
}



public Person(String name) {
	this.name=name;
}




@Override
public String toString() {
return "My name is "+ name+" my class is "+this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void greet() {
	System.out.println("Hi I am proud to be Person.");
}

}
