package wallet;

public class Cashier {

    private CashSlot cashSlot;
    Wallet wallet = new Wallet();

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= 0) {
            System.out.println("To low amount, try again");
        } else if (amount>0 && amount<=wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else System.out.println("You don't have enough money");
    }
    public void withdrawFrom100(Wallet wallet, int amount2) {
        if (amount2>0 && amount2<=wallet.getBalanceFrom100()) {
            cashSlot.dispense(amount2);
        } else System.out.println("You don't have enough money in your wallet");
    }
}
