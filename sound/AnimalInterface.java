package sound;

public class AnimalInterface {
	public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
 
        dog.makeSound();
        dog.eats();
 
        cat.makeSound();
        cat.eats();
    }
}
