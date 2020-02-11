package practice2;
import java.util.*;
interface transaction {
	public String checkBalance();
	public String Withdraw(int amt);
}
public class ATM {
	public static void main(String[] args) {
		Pin p=new Pin();
		Atm card1=new Atm();
		card1.setPin(1234);
		card1.setBalance(5000);
		Scanner ob=new Scanner(System.in);
		if(p.pinVerify(card1))
		{ 	int c;
			System.out.println("Press:\n1. Check balance.\n2. Withdraw\n3. Change Pin\n ");
			c=ob.nextInt();
			switch(c) {
			case 1:
				System.out.println("Balance:"+card1.checkBalance());
				break;
			case 2:
				System.out.println("Enter the amount: ");
				int amt= ob.nextInt();
				System.out.println(card1.Withdraw(amt));
				break;
			case 3:
				p.ChangePin(card1);
				break;
				
				
			}
		}
		else 
			System.out.println("Enter a valid pin");
	}
}
class Pin {
	public boolean pinVerify(Atm a) {
		if(a.getPin()==1234)
			return true;
		else 
			return false;
	}
	public void ChangePin(Atm a) {
		System.out.println("Enter the new pin:");
		Scanner sc=new Scanner(System.in);
		int newPin=sc.nextInt();
		a.setPin(newPin);
		sc.close();
		System.out.println("Pin changed Successfuly");
	}
	
}
class Atm implements transaction{
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
