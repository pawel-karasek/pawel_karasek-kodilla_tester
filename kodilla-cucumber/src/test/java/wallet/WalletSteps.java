package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    public CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Cashier cashier = new Cashier(cashSlot);

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        When("I request $201", () -> {
            cashier.withdraw(wallet, 201);
        });

        Then("should display alert1 {string}", (String string) -> {
            Assert.assertEquals(string, "You don't have enough money");
        });

        When("I request $0", () -> {
            cashier.withdraw(wallet, 0);
        });

        Then("should display alert2 {string}", (String string) -> {
            Assert.assertEquals(string, "To low amount, try again");
        });

        When("I request $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalanceFrom100());
        });

        When("I withdraw $200", () -> {
            cashier.withdrawFrom100(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContentsFrom100());
        });

        Then("I should be told that {string}", (String string) -> {
            Assert.assertEquals(string, "You don't have enough money in your wallet");
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalanceFrom100();
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalanceFrom100());
        });
    }
}