package sound;

public class Dog implements Animal {
	@Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
 
    @Override
    public void eats() {
        System.out.println("Dog is eating food");
    }
}
