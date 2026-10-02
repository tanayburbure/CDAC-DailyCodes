package power;

public class Microwave extends Apliance{
	public Microwave(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }
 
    @Override
    void turnOn() {
        System.out.println(brand + " Microwave is now ON. Power consumed: "
                + powerConsumption + "W");
    }
}
