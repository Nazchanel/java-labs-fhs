public class BankAccount
{
    private String owner;
    private double balance;

    public BankAccount(String o, double bal)
        {
            balance = bal;
            owner = o;

        }

        public void deposit(double amt)
    {
        balance += amt;

    }
    public void withdraw(double amt)
    {
        balance -= amt;

    }
    public String getOwner()
    {
        return owner;
    }
    public double getBalance()
    {
        return balance;
    }
}
