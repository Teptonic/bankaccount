
public class BankAccout
{
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

    public BankAccout(String name, int accountNum, double balance, String password)
    {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;
    }

    public boolean logIn(String name, String password)
    {
        if (name.equals(this.name) && password.equals(this.password))
        {
            loggedIn = true;
            return true;
        }
        return false;
    }
    //accessor method
    public double getBalance()
    {
        if (loggedIn)
        {
            return balance;
        }
        else
        {
            throw new IllegalStateException("Not logged in.");
        }
    }

    public void logOut()
    {
        loggedIn = false;
    }
    public double deposit(double amount)
    {
        if (loggedIn && amount > 0){
            return balance += amount;
        }
        throw new IllegalStateException("You aren't logged in bruh");
    }
    public double withdrawl(double amount)
    {
        if (loggedIn && amount > 0 && (balance - amount) >= 0){
            balance -= amount;
            return balance;
        }
        else if((balance - amount < 0))
        {
            throw new IllegalStateException("You're a brokie");
        }
        else if (amount < 0)
        {
            throw new IllegalStateException("Are you trying to add money wtf??");
        }
        else{
            throw new IllegalStateException("Somethin did work yo");
        }
    }
    public String toString()
    {
        return "Account Number: " + this.accountNum;
    }
}
