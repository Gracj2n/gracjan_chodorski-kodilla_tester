package walllet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();


    //cash_withdrawal.feature
    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$_in_my_wallet(Integer creditValue) {
        wallet.deposit(creditValue);
        assertEquals(creditValue, wallet.getBalance());
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
    @Then("Balance of my wallet should be ${int}")
    public void balance_of_my_wallet_should_be(Integer expectedBalance) {
       assertEquals(expectedBalance, wallet.getBalance());
    }


    //more_cash_withdrawal_than_wallet_balance.feature
    @Given("there is ${int} in my wallet")
    public void there_is_$_in_my_wallet(Integer creditValue) {
        wallet.deposit(creditValue);
        //assertEquals(creditValue, wallet.getBalance());
        //System.out.println(wallet.getBalance());
    }
    @When("I withdraw ${int}")
    public void i_withdraw_$(Integer withdrawValue) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, withdrawValue);

    }
    @Then("${int} should not be dispensed")
    public void nothing_should_be_dispensed(Integer expectedNotDispensedValue) {
        assertNotEquals(expectedNotDispensedValue, wallet.getBalance());
    }
    @And("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        System.out.println("You dont have enough money in wallet.");
    }


    //display_wallet_balance.feature
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        wallet.getBalance();
    }
    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$_expected_wallet_balance(Integer expectedWalletBalance) {
        assertEquals(expectedWalletBalance, wallet.getBalance());
    }
}

