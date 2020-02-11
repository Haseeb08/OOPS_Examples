class BankAcc {

private String AccName;
private int AccNo;
private double balance;

public BankAcc(String Accname,int AccNo) {
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

interface interest {

public void addInterest();    
}

class currentBankAcc extends BankAcc  {

    public currentBankAcc(String Accname,int AccNo) {
    super(Accname, AccNo);
    
    }
}

class savingBankAcc extends BankAcc implements interest {

private double interestRate;

public savingBankAcc(String Accname,int AccNo,double interestRate) {
super(Accname, AccNo);
this.interestRate=interestRate;
}

public void addInterest() {
    double amt=getBalance()*interestRate/100;
    depost(amt);
}

}
public class Bank
{
    public static void main()
    {
        /*BankAcc b1=new BankAcc("Haseeb", 123);
        b1.showAccDetails();
        System.out.println(b1.depost(1000));
        System.out.println("Balance :"+b1.getBalance());
        System.out.println(b1.withdraw(500));
        System.out.println("Balance :"+b1.getBalance());
        */
        savingBankAcc sb1=new savingBankAcc("Jake", 124, 10);
        sb1.showAccDetails();
        System.out.println(sb1.depost(5000));
        System.out.println("Balance :"+sb1.getBalance());
        System.out.println(sb1.withdraw(1000));
        System.out.println("Balance :"+sb1.getBalance());
        sb1.addInterest();
        System.out.println("Balance After adding interest:"+sb1.getBalance());
    
        System.out.println();
        currentBankAcc cb1=new currentBankAcc("Mike", 124);
        cb1.showAccDetails();
        System.out.println(cb1.depost(7000));
        System.out.println("Balance :"+cb1.getBalance());
        System.out.println(cb1.withdraw(2000));
        System.out.println("Balance :"+cb1.getBalance());
        
    }
}


