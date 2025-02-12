public class ClosedState implements AccountState
{

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on closed account!");
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on a closed account!");
    }

    @Override
    public void activate() {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void suspend() {
        System.out.println("You cannot suspend a closed account");
    }

    @Override
    public void close() {
        System.out.println("You cannot close a closed account!");
    }
    
}