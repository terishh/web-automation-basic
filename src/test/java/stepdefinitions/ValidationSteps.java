package stepdefinitions;

import cucumber.api.java.en.Then;
import general.PageManager;
import io.cucumber.datatable.DataTable;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationSteps {
  @Then("I see {string} with the following data:")
  public void i_see_the_with_the_following_data(String element, DataTable dataTable) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    assertThat(PageManager.getCurrentPage().validateData(element, dataTable.asList())).isTrue();
  }
}
