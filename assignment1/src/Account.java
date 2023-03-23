import java.util.Date;

public class Account {
    private int id =0;
    private double balance =0;
    private static double annualInterestRate =0;
    private Date dateCreated = new Date();

    public int getId() { return id; }
    public double getBalance() { return balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public Date getDateCreated() { return dateCreated; }

    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public static void setAnnualInterestRate(double annualInterestRate) { Account.annualInterestRate = annualInterestRate; }

    public Account(){}
    public Account(int id, double balance){
        setId(id);
        setBalance(balance);
    }

    public double getMonthlyInterestRate(){ return (getAnnualInterestRate()/100)/12; }
    public double getMonthlyInterest(){ return balance*getMonthlyInterestRate(); }
    public double withdraw(double amount){
        if(amount>balance){
            System.out.println("Amount out of Balance!");
            return 0.0;
        }
        balance -= amount;
        return amount;
    }
    public void deposit(int amount){
        if(amount<0){
            System.out.println("Amount is negative!");
        }else {
            balance += amount;
        }
    }
}
