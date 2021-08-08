package chapter13;

public class ComparableRectangle extends Rectangle{

	public ComparableRectangle(double width,double height) {
		super(width,height);
	}
	
	
	
	
	@Override
	public int compareTo(GeometricObject o) {
	if(this.getPerimeter()>o.getPerimeter()) {
		return 1;
	}else if(this.getPerimeter()<o.getPerimeter()) {
	return -1;
	}else {
		return 0;
	}
	}




	@Override
	public String toString() {
		return super.toString()+ "Area"+ getArea();
	}
	
	

}
