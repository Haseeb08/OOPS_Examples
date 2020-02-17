package ATM;

import java.util.Scanner;



public class Pin {
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
