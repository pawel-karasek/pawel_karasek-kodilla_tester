package homework;

import divisibleChecker.DivisibleChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisible implements En {

    private int number;
    private String result;

    public IsNumberDivisible() {

        Given("number 24", () -> {
            this.number = 24;
        });

        When("it is divisible by 3", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Given("number 4", () -> {
            this.number = 4;
        });

        When("it isn't divisible by 3", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Given("number 40", () -> {
            this.number = 40;
        });

        When("it is divisible by 5", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Given("number 53", () -> {
            this.number = 53;
        });

        When("it isn't divisible by 5", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Given("number 15", () -> {
            this.number = 15;
        });

        When("it is divisible by 3 and 5", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Given("number 13", () -> {
            this.number = 13;
        });

        When("it isn't divisible by 3 and 5", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(number);
        });

        Then("sound is {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });
    }
}
