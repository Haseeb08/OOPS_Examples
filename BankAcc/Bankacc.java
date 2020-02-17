package BankAcc;

public class Bankacc {
	private String AccName;
	private int AccNo;
	private double balance;

	public Bankacc(String Accname,int AccNo) {
	    this.AccName=Accname;
	    this.AccNo=AccNo;
	    balance=0;

	}
	public double getBalance() {
	    return balance;
	}
	public void showAccDetails() {
	 
	    System.out.println("Acc name: "+AccName+
	                       "\nAcc number: "+AccNo+                         
	                        "\nCurrent Balance : "+balance);
	}

	public String depost(double amt) {

	    if(amt>100)
	        {
	            balance=balance+amt;
	            return "Deposit successful";
	        }
	    else 
	         return "Error : Minimum deposit of 100";
	}
	public String withdraw(double amt) {

	    if(balance>=amt && amt>0)
	    {
	        balance=balance-amt;
	        return "Withdraw Successful";
	    }
	    else
	        return "Error : Balance insufficient";
	}
}
