package numberChecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static numberChecker.NumberChecker.isNumberDivisibleByThree;
import static numberChecker.NumberChecker.isNumberDivisibleByThreeOrFive;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsNumberDivisible {
    private int number;
    private String answer;
    @Given("Number to check is {int}")
    public void number_to_check_is(Integer number) {
        this.number = number;
    }
    @When("Is this number divisible by three")
    public void is_this_number_divisible_by() {
        this.answer = isNumberDivisibleByThree(this.number);
    }
    @When("Is this number divisible by three or five")
    public void is_this_number_divisible_by_three_or_five() {
        this.answer = isNumberDivisibleByThreeOrFive(this.number);
    }
    @Then("Answer is {string}")
    public void answer_is(String string) {
        assertEquals(string, this.answer);
    }
}
