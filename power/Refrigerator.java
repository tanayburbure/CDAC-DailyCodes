package power;

public class Refrigerator extends Apliance{
	public Refrigerator(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }
 
    @Override
    void turnOn() {
        System.out.println(brand + " Refrigerator is now ON. Power consumed: "
                + powerConsumption + "W");
    }
}
