public class Player {
    private final String name;
    private double wallet;

    public Player(String n, double w){
        name = n;
        wallet = w;
    }
    //public boolean broke() -- returns true if the player has no money in his/her wallet
    //public String getName() -- returns the name of the player
    //public double getWallet() -- returns the current amount of money the player has
    //public void updateWallet(double amount) -- updates the wallet by adding the amount, could be positive or negative

    public boolean broke()
    {
        return wallet == 0;
    }
    public String getName()
    {
        return name;
    }
    public double getWallet()
    {
        return wallet;
    }
    public void updateWallet(double amount)
    {
        wallet += amount;
    }
}

