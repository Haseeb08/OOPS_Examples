package practice2;
//Amazon : Add products into cart , pay through COD, Net banking, Card Payment.
import java.util.ArrayList; // import the ArrayList class
import java.util.*;

public class Amazon {
	public static void main(String[] args) {
		amazonProduct gloves=new amazonProduct("Gloves",1000);
		amazonProduct helmet=new amazonProduct("Helmet",1200);
		amazonProduct bat=new amazonProduct("Bat",1200);
		amazonProduct ball=new amazonProduct("Ball",150);
		amazonProduct stumps=new amazonProduct("Stumps",900);
		
		amazonCart c=new amazonCart();
		c.addtoCart(gloves);
		c.addtoCart(helmet);
		c.addtoCart(bat);
		c.addtoCart(ball);
		c.addtoCart(stumps);
		System.out.println("Bill : \n");
		c.getBill();
		int amt = c.getTotalAmount();
		
		System.out.println("\nTotal Amount:"+amt);
		System.out.println("\nSelect payment Options : \n1: Cash on Delivery\n2: Online Payment\n3: Card Payment\n"); 
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
					case 1: billPayment cp=new CashPay();
							cp.makePayment(amt);
							break;
					case 2: billPayment op=new OnlinePay();
							op.makePayment(amt);
							break;
					case 3: billPayment p=new CardPay();
							p.makePayment(amt);
							break;		
					default : System.out.println("\nError");		
		}	
		sc.close();
}
}
class amazonProduct {
private String productName;
private int productPrice;
	public amazonProduct(String productName,int productPrice){
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
class amazonCart {
	ArrayList<amazonProduct> cartItems = new ArrayList<amazonProduct>();

	private int totalAmount;
	public int getTotalAmount() {
		return totalAmount;
	}
	public void addtoCart(amazonProduct p) {
		cartItems.add(p);
		totalAmount+=p.getProductPrice();
	}
	public void getBill() {
	for(int i=0;i<cartItems.size();i++)
		System.out.println((cartItems.get(i)).getProductName()+" "+(cartItems.get(i)).getProductPrice());
	}
}
interface billPayment {
	public void makePayment(int amt);

}
class CashPay implements billPayment{

	@Override
	public void makePayment(int amt) {
				System.out.println("\nThank you..!!\nPay : "+amt+" on delivery of product");
	}
}
class OnlinePay implements billPayment {

	@Override
	public void makePayment(int amt) {
		System.out.println("\nThank you..!\n Payment of amount : "+amt+
				" is successful via netBanking.\nYour product will be delivered soon.");		
	}
}	
class CardPay implements billPayment {

	@Override
	public void makePayment(int amt) {
		System.out.println("\nThank you..!\n Payment of amount : "+amt+
				" is successful through Card.\nYour product will be delivered soon.");
	}	
}
