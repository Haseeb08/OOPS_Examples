package Amazon;

import java.util.Scanner;

public class Amazon {
	public static void main(String[] args) {
		Amazonproduct gloves=new Amazonproduct("Gloves",1000);
		Amazonproduct helmet=new Amazonproduct("Helmet",1200);
		Amazonproduct bat=new Amazonproduct("Bat",1200);
		Amazonproduct ball=new Amazonproduct("Ball",150);
		Amazonproduct stumps=new Amazonproduct("Stumps",900);
		
		Amazoncart c=new Amazoncart();
		c.addtoCart(gloves);
		c.addtoCart(helmet);
		c.addtoCart(bat);
		c.addtoCart(ball);
		c.addtoCart(stumps);
		System.out.println("Bill : \n");
		c.getBill();
		int amt = c.getTotalAmount();
		
		System.out.println("\nTotal Amount:"+amt);
		System.out.println("\nSelect payment Options : \n1: Cash on Delivery\n2: Card Payment\n"); 
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
					case 1: Payment cp=new Cashpay();
							cp.makePayment(amt);
							break;
					case 2: Payment p=new Cardpay();
							p.makePayment(amt);
							break;		
					default : System.out.println("\nError");		
		}	
		sc.close();
}
}