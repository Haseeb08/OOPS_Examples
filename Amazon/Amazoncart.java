package Amazon;

import java.util.ArrayList;

class Amazoncart {
	ArrayList<Amazonproduct> cartItems = new ArrayList<Amazonproduct>();

	private int totalAmount;
	public int getTotalAmount() {
		return totalAmount;
	}
	public void addtoCart(Amazonproduct p) {
		cartItems.add(p);
		totalAmount+=p.getProductPrice();
	}
	public void getBill() {
	for(int i=0;i<cartItems.size();i++)
		System.out.println((cartItems.get(i)).getProductName()+" "+(cartItems.get(i)).getProductPrice());
	}
}