package power;

public class WashingMachine extends Apliance{
	
	WashingMachine(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }
	@Override
    void turnOn() {
    	System.out.println(brand + " Washing Machine is now ON. Power consumed: "
                + powerConsumption + "W");
    }
	
}
