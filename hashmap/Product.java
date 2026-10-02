package hashmap;

public class Product {
	private int productId;
	private String productName;
	private String category;
	private int price;
	
	Product(int productId,String productName,String category,int price){
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price ;
	}
	
	public int getProductId() {
		return productId;
	}
	
	@Override
	public String toString() {
		return productId+" "+productName+" "+category+" "+price;
	}
}
