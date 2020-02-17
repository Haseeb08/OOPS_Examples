package Amazon;

public class Cardpay implements Payment{

	@Override
	public void makePayment(int amt) {
		System.out.println("\nThank you..!\n Payment of amount : "+amt+
				" is successful through Card.\nYour product will be delivered soon.");
	}
}
