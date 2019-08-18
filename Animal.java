package Primjeri;

abstract class Animal {

	public abstract String sound();
	
	public abstract String howToEat();
}

class Duck extends Animal implements Edible{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Qua Qua";
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Duck: Roast it";
	}
	
}
