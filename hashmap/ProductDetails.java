package hashmap;
import java.util.*;

public class ProductDetails {
	HashMap<Integer,Product > pro ;
	
	ProductDetails(HashMap<Integer,Product > pro){
		this.pro = pro ;
	}

	public void addProduct(Product prod) {
		pro.put(prod.getProductId() , prod);
	}
	
	public void removeProduct(int productId) {
		if(pro.containsKey(productId)) {
			pro.remove(productId);
			System.out.println("Product removed successfully");
		}else {
			System.out.println("Product not found...!");
		}
	}
	
	public Product searchProduct(int productId) {
		return pro.get(productId);
	}
	
	public void display() {
		for(Product prod : pro.values()) {
			System.out.println(prod);
		}
	}
}
