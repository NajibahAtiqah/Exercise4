package Exercise;

public class Clothes {
	private String brand, material;
	private int quantity;
	private double discount;
	
	public Clothes(String b, String m, int q, double d ){
		brand=b;
		material=m;
		quantity=q;
		discount=d;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public String toString() {
		return "Brand: " + brand + "\n" + "Material: " + material + "\n" +"Quantity of clothes: " + quantity + "\n" 
	+"Discount given: " + discount + "%" + "\n";
		
		    

}
	}
