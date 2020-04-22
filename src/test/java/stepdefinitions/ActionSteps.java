package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.PageManager;
import io.cucumber.datatable.DataTable;

import static general.Navigation.navigator;

public class ActionSteps {
  @Given("I navigate to {string} page")
  public void i_navigate_to_page(String string) {
    navigator(string);
  }

  @When("I click {string}")
  public void i_click(String string) {
    PageManager.getCurrentPage().click(string);
  }

  @When("I {string} with following data:")
  public void i_with_following_data(String scope, DataTable dataTable) {
    PageManager.getCurrentPage().doAction(scope, dataTable);
  }

  @When("I search for {string}")
  public void iSearchFor(String item) {
    PageManager.getCurrentPage().doAction("search for", item);
  }

  @And("I click text {string}")
  public void iClickText(String text) {
    PageManager.getCurrentPage().clickText(text);
  }

  @And("I set {string} to {string}")
  public void iSetTo(String element, String value) {
    PageManager.getCurrentPage().setValue(element, value);
  }
}
