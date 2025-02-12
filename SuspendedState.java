public class SuspendedState implements AccountState
{

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend() {
        System.out.println("You cannot suspend a suspended account!");
    }

    @Override
    public void close() {
        System.out.println("Account is closed!");
    }
    
}