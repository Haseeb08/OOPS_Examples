package BankAcc;

public class Savingacc extends Bankacc implements Interest {

public Savingacc(String Accname, int AccNo,int interestRate) {
	super(Accname, AccNo);
	this.interestRate=interestRate;
	}

private double interestRate;

public void addInterest() {
    double amt=getBalance()*interestRate/100;
    depost(amt);
}
}