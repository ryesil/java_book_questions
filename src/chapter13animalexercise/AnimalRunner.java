package chapter13animalexercise;

import chapter13.Edible;

public class AnimalRunner {
public static void main(String[] args) {
	Animal animal=new Chicken();
	//eat(animal);
	animal=new Duck();
	//eat(animal);
	Edible stuff=new Chicken();
	eat(stuff);
	
}

public static void eat(Edible stuff) {
	System.out.println(stuff.howToEat());
	
	
}

}
