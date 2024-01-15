package TEST1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	
	
@Given("some other precondition")
public void some_other_precondition() {
    System.out.println("I want to write a step with precondition");;
}

@When("I complete action")
public void i_complete_action() {
    System.out.println();;
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
