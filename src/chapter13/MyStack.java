package chapter13;

public class MyStack implements Cloneable{
private String name;
private int id;

public MyStack(String name,int id) {
	this.name=name;
	this.id=id;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public Object clone() {
	
try {
	//shallow Copy
MyStack	myStack=(MyStack) super.clone();
//deepCopy
//		myStack.id=this.id;
//		myStack.name=this.name;
		return myStack;
	
} catch (CloneNotSupportedException e) {
	return null;
}
	
}
	
}
