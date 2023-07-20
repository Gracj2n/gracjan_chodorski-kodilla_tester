package walllet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$_in_my_wallet(Integer creditValue) {
        wallet.deposit(creditValue);
    }
    @When("I request ${int}")
    public void i_request_$(Integer requestValue) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, requestValue);
    }
    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer expectedValue) {
        assertEquals(expectedValue, cashSlot.getContents());
    }
}

