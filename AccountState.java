public interface AccountState
{
    void deposit(Double depositAmount);
    void withdraw(Double withdrawAmount);
    void activate();
    void suspend();
    void close();
}