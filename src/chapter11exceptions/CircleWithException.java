package chapter11exceptions;

public class CircleWithException {
	//Radius of the circle
private double radius;

/* The number of objects created*/
private static int numberOfObjects=0;

/*Construct a circle with radius 1*/
public CircleWithException() throws InvalidRadiusException{
	this.radius=1.0;
}
	
/*Construct a circle with a specified radius*/
public CircleWithException(double newRadius) throws InvalidRadiusException {
	setRadius(newRadius);
	numberOfObjects++;
}
//Return Radius
public double getRadius() {
	return radius;
}

/* Set e new radius*/
public void setRadius(double newRadius) throws InvalidRadiusException{// Declare Exception
		if(newRadius>=0) {
			radius=newRadius;
		}
		else {
			throw new InvalidRadiusException(newRadius);
		}
	}
/* Return number of Objects*/
public static int getNumberOfObjects() {
	return numberOfObjects;
}

/*Return the area of this circle*/
public double findArea() {
	return radius*radius*Math.PI;
}


}
