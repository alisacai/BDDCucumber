package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Login {
    @Given("User is on EmailTypeList Page")
    public void user_is_on_EmailTypeList_Page() {
        System.out.println("01 Just for test cucumber framework , User is on EmailTypeList Page");
    }

    @When("User Navigate to {int} Mail LogIn Page")
    public void user_Navigate_to_Mail_LogIn_Page(Integer int1) {
        System.out.println("02 Just for test cucumber framework , User Navigate to {int} Mail LogIn Page");
    }

    @When("User enters Username and Password")
    public void user_enters_Username_and_Password() {
        System.out.println("03 Just for test cucumber framework , User enters Username and Password");
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_Login_Successfully() {
        System.out.println("04  Just for test cucumber framework , Message displayed Login Successfully");
    }

    @When("User LogOut from the Application")
    public void user_LogOut_from_the_Application() {
        System.out.println("05 Just for test cucumber framework , User LogOut from the Application");
    }

    @Then("Message displayed LogOut Successfully")
    public void message_displayed_LogOut_Successfully() {
        System.out.println("06 Just for test cucumber framework , Message displayed LogOut Successfully");
    }
}
