public class Account
{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;




    public Account()
    {
        accountState = new ActiveState();
    }

   public Account(String accountNumber, Double balance)
   {
        this.accountState = new ActiveState();
        this.accountNumber = accountNumber;
        this.balance = balance;
   }
   
   
   public void deposit(Double depositAmount)
   {
        accountState.deposit(depositAmount);

   }

   public void withdraw(Double withdrawAmount)
   {
        
   }

   public void activate()
   {
        accountState.activate();
        this.accountState = new ActiveState();
   }

   public void suspend()
   {
        accountState.suspend();
        this.accountState = new SuspendedState();

   }

   public void close()
   {
        accountState.close();
        this.accountState = new ClosedState();
        
   }

   public void setBalance(Double balance)
   {
    this.balance = balance;
   }

   public Double getBalance()
   {
        return this.balance;
   }
   
   
   
   
   
    @Override
    public String toString() {

        
        
        return "";
    }
}