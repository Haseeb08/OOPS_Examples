package practice2;
//Product Ordering System : Payment 1.COD 2.Online Payment.
import java.util.*;
import java.util.ArrayList; // import the ArrayList class


public class ProductOrder {
	public static void main(String[] args) {
		Product bat=new Product("Bat",1200);
		Product ball=new Product("Ball",150);
		Product stumps=new Product("Stumps",900);
		
		Cart c=new Cart();
		c.addtoCart(bat);
		c.addtoCart(ball);
		c.addtoCart(stumps);
		int amt = c.getTotalAmount();
		System.out.println(c.items+"\nTotal Amount:"+amt);
		System.out.println("\nPayment Options : \n1: Cash on Delivery\n2: Online Payment\n"); 
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
					case 1: Payment cp=new cashPayment();
							cp.makePayment(amt);
							break;
					case 2: Payment op=new onlinePayment();
							op.makePayment(amt);
							break;
					default : System.out.println("\nError");		
		}	
		sc.close();
	}	
}
class Product {
private String productName;
private int productPrice;
	public Product(String productName,int productPrice){
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public String getProductName() {
		return productName;
	}
}
class Cart {
	ArrayList<String> items = new ArrayList<String>();

	private int totalAmount;
	public int getTotalAmount() {
		return totalAmount;
	}
	public void addtoCart(Product p) {
		items.add(p.getProductName());
		totalAmount+=p.getProductPrice();
	}	
}
abstract class Payment {
	abstract void makePayment(int amt);

}
class cashPayment extends Payment{

	@Override
	void makePayment(int amt) {
				System.out.println("\nThank you..!!\nPay : "+amt+" on delivery of product");
	}
}
class onlinePayment extends Payment {

	@Override
	void makePayment(int amt) {
		System.out.println("\nThank you..!\n Payment of amount : "+amt+" is successful.\nYour product will be delivered soon.");
		
	}
}	