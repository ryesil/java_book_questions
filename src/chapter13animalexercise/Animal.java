package chapter13animalexercise;

import chapter13.Edible;

abstract class Animal {

public abstract String howToEat();

}


class Chicken extends Animal implements Edible{

	@Override
	public String howToEat() {
	
		return "Chicken: Fry it";
	}
	
}

class Duck extends Animal{

	@Override
	public String howToEat() {

		return "Duck: Roast it";
	}	
}




