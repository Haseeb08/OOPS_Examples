package BankAcc;

public class Main {
	 public static void main(String[] args)
	    {
	        /*BankAcc b1=new BankAcc("Haseeb", 123);
	        b1.showAccDetails();
	        System.out.println(b1.depost(1000));
	        System.out.println("Balance :"+b1.getBalance());
	        System.out.println(b1.withdraw(500));
	        System.out.println("Balance :"+b1.getBalance());
	        */

	        Savingacc sb1=new Savingacc("Jake", 124, 10);
	        sb1.showAccDetails();
	        System.out.println(sb1.depost(5000));
	        System.out.println("Balance :"+sb1.getBalance());
	        System.out.println(sb1.withdraw(1000));
	        System.out.println("Balance :"+sb1.getBalance());
	        sb1.addInterest();
	        System.out.println("Balance After adding interest:"+sb1.getBalance());
	    
	        System.out.println();
	        Currentacc cb1=new Currentacc("Mike", 124);
	        cb1.showAccDetails();
	        System.out.println(cb1.depost(7000));
	        System.out.println("Balance :"+cb1.getBalance());
	        System.out.println(cb1.withdraw(2000));
	        System.out.println("Balance :"+cb1.getBalance());
	        
	}
}
