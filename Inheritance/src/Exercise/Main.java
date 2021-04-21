package Exercise;

public class Main {

	public static void main(String[] args) {
		Clothes obj1 = new Clothes ("H&M", " Polyester", 2, 0.3);
		Hoodie obj2 = new Hoodie("Adidas", " Cotton", 3, 0.5, 285);
		
		System.out.println(obj1);
		System.out.println("________________________________________________________");
		System.out.println(obj2);
		System.out.println("Total before discount = " +"RM" + obj2.TotalBefore());
		System.out.println("Total discount received = " + "RM" + obj2.CalDiscount());
		System.out.println("Total need to paid = " + "RM" + obj2.TotalPaid());
	    }
	}


