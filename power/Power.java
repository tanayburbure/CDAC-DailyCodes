package power;

public class Power {
	public static void main(String[] args) {
        Apliance washingMachine = new WashingMachine("LG", 500.0);
        Apliance refrigerator = new Refrigerator("Samsung", 150.0);
        Apliance microwave = new Microwave("Whirlpool", 1200.0);
 
        washingMachine.turnOn();
        refrigerator.turnOn();
        microwave.turnOn();
    }
}
