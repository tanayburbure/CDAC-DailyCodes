package power;

abstract public class Apliance {
	 protected String brand;
	 protected double powerConsumption;
	 
	 Apliance(String brand, double powerConsumption) {
	        this.brand = brand;
	        this.powerConsumption = powerConsumption;
	 }
	 
	 abstract void turnOn();
}
