package Amazon;

public class Cashpay implements Payment {
	@Override
	public void makePayment(int amt) {
				System.out.println("\nThank you..!!\nPay : "+amt+" on delivery of product");
	}
}
