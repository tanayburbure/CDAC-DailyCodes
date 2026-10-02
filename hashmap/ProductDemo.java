package hashmap;

import java.util.HashMap;

public class ProductDemo {
	public static void main(String[] args) {
		HashMap<Integer, Product> pro = new HashMap<Integer, Product>();
		ProductDetails pd = new ProductDetails(pro);
		
		pd.addProduct(new Product(1001,"Motor","Electrical",4000));
		pd.addProduct(new Product(1025,"Mobile","Electronic",140000));
		pd.addProduct(new Product(1011,"SSD","Electronic",40000));
		pd.addProduct(new Product(1115,"DCMotor","Electrical",8000));
		
		System.out.println("All products : ");
		pd.display();
		
		System.out.println("\nSearching the product with id 1024 :");
		Product prod = pd.searchProduct(1024);
		if(prod != null) {
			System.out.println(pro);
		}else {
			System.out.println("product not found");
		}
		
		System.out.println("Removing the element with id 1011");
		pd.removeProduct(1011);
		
		System.out.println("\nAfter removing product : ");
		pd.display();
	}
}
