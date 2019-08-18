package Primjeri;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Chicken();
		eat(animal);
		
		animal = new Duck();
		eat(animal);
		
		Edible stuff = new Chicken();
		eat(stuff);
		
		stuff = new Duck();
		eat(stuff);
		
		stuff = new Broccoli();
		eat(stuff);
	}

	private static void eat(Edible stuff) {
		// TODO Auto-generated method stub
		System.out.println(stuff.howToEat());
	}

	private static void eat(Animal animal) {
		System.out.println(animal.howToEat());
	}

}
