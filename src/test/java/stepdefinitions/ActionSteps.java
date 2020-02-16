package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.BasePageObject;

import static general.Navigation.navigator;

public class ActionSteps {

  @When("I search for {string}")
  public void i_search_for(String string) {
    BasePageObject.searchFor(string);
  }

  @Given("I navigate to {string} page")
  public void i_navigate_to_page(String string) {
    navigator(string);
  }
}
