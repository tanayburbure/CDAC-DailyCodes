package sound;

public class Cat implements Animal{
	 @Override
	    public void makeSound() {
	        System.out.println("Cat says: Meow! Meow!");
	    }
	 
	    @Override
	    public void eats() {
	        System.out.println("Cat is eating food");
	    }
}
