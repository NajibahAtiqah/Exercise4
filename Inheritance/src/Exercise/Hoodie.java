package Exercise;
import java.util.*;
public class Hoodie extends Clothes {
	

private int price;
	
	Scanner in = new Scanner (System.in);
	
	public Hoodie (String b, String m, int q, double d, int p) {
		super(b, m, q, d);
		price = p;
		
	}
	
	public int getPrice() {
		return price;
}
	
	public int TotalBefore() {
		return getQuantity()*price;
	}

		public double CalDiscount() {
			return getDiscount()*price*getQuantity();
	}
		public double TotalPaid() {
			return (getQuantity()*price)-CalDiscount();
		}
	
	public String toString() {
		return super.toString() + "Price per item: RM" + price;

}
	}
