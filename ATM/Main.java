package ATM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pin p=new Pin();
		Atm card1=new Atm();
		card1.setPin(1234);
		card1.setBalance(5000);                  // setting balance = 5000.
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
