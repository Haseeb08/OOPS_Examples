package ATM;

public class Atm implements Transaction{
	private double balance;
	private double pin;
	public double getPin() {
		return pin;
	}
	public void setPin(double pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String checkBalance() {
		return  " "+balance;
	}
	@Override
	public String Withdraw(int amt) {
		if(balance>=amt && amt>0)
	    {
	        balance=balance-amt;
	        return "Withdraw Successful of amount :"+amt;
	    }
	    else
	        return "Error : Balance insufficient";
	}
}
