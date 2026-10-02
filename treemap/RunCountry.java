package treemap;

import java.util.TreeMap;

public class RunCountry {
	public static void main(String[] args) {
		TreeMap<Integer, Country> cou = new TreeMap<Integer, Country>();
		CountryDetails c1 = new CountryDetails(cou);
		
		c1.addCountry(new Country(91,"INDIA","1.5B"));
		c1.addCountry(new Country(01,"USA","55M"));
		c1.addCountry(new Country(51,"DUBAI","15M"));
		c1.addCountry(new Country(57,"CHINA","1.4B"));
		
		System.out.println("All countries : ");
		c1.display();
		
		System.out.println("\nSearching the country with countryCode 01");
		Country code = c1.searchCountry(01);
		System.out.println(code);
		
		System.out.println("\nRemoving the country with code 91 : ");
		c1.removeCountry(91);
		
		System.out.println("\nAfter removing : ");
		c1.display();
	}
}
