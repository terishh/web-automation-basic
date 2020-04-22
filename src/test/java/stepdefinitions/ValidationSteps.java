package stepdefinitions;

import cucumber.api.java.en.Then;
import pages.PageManager;
import io.cucumber.datatable.DataTable;

public class ValidationSteps {
  @Then("I see the following fields:")
  public void i_see_the_following_fields(DataTable dataTable) {
    PageManager.getCurrentPage().validateFields(dataTable);
  }

  @Then("I see {string} with following data:")
  public void iSeeWithFollowingData(String scope, DataTable dataTable) {
    PageManager.getCurrentPage().doAction("validate " + scope, dataTable);
  }

  @Then("I see text {string}")
  public void iSeeText(String text) {
    PageManager.getCurrentPage().validateText(text);
  }
}
