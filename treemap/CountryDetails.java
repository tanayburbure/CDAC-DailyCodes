package treemap;
import java.util.*;

public class CountryDetails {
	TreeMap<Integer,Country> cou ;
	
	CountryDetails(TreeMap<Integer,Country> cou){
		this.cou = cou;
	}
	
	public void addCountry(Country coun) {
		cou.put(coun.getCountryCode(),coun);
	}
	
	public void removeCountry(int countryCode) {
		if(cou.containsKey(countryCode)) {
			cou.remove(countryCode);
			System.out.println("Country removed succesfully");
		}else {
			System.out.println("Country not found..");
		}
	}
	
	public Country searchCountry(int countryCode) {
		return cou.get(countryCode);
	}
	
	public void display() {
		for(Country coun : cou.values()) {
			System.out.println(coun);
		}
	}
	
}
