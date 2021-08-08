package chapter10questions;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class PersonRunner {

	public static void main(String[] args) {
		Person person=new Person("Ahmet");
		System.out.println(person.toString());
		Student student=new Student("Ramazan",3);
		System.out.println(student.toString());
		Employee employee=new Employee("Zuleyha");
		System.out.println(employee);
		Faculty faculty=new Faculty("Ismet");
		System.out.println(faculty.toString());
		Staff staff=new Staff("Zeynep");
		System.out.println(staff);
		
		Person person1=new Student("Zelis",4);
		System.out.println(person1.toString());
		System.out.println(person1.toString());
		Person person3=new Student();
		System.out.println(person3.toString());
		Person person4=person3;
		System.out.println(person4);
		person4.setName("Zillet");
		System.out.println(person4.toString());
		System.out.println(student.toString());
		person3.greet();
		person4.greet();
		
		faculty.greet();
Person person5=new Student();
Person person6=new Employee();
		Student student2=new Student();
		



	}
	public static void days(Days d) {
		System.out.println(d);
	}
	public static void timer(double star) {
	int	start=(int)(star*60);
	System.out.println(start);
		for(int i=start;i>0;i--) {
			int min=start/60;
			int sec=start%60;
			System.out.println("Counting down: "+(min>0?min+" minutes and ":"")+(sec>0?sec+" seconds"+".":""));
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("An error accured in timer! Please start over!");;
			}
			start--;
		}
		System.out.println("Time is up!!!!");
	}
}
