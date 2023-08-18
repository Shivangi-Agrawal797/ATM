package inheritanceAndpolymorphism;

public class Zoo {
	

	public static void main(String[] args) {
		
		System.out.println(" welcome to zoo");

		Animal animal = new Animal("animal" , 0);
		
		Elephant elephant = new Elephant ("elephant" , 20);
		Lion lion = new Lion("lion" , 30);
		Giraffe giraffe = new Giraffe("giraffe" , 40);
		
		animal.makeSound();
		elephant.makeSound();
		lion.makeSound();
		giraffe.makeSound();
		
		
	}

}
