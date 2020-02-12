

package stepdefinitions;
import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.open;

import org.assertj.core.api.AssertionsForClassTypes;

import static general.Loading.waitUntilLoadingIsFinished;
import static general.Navigation.basePage;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ValidationSteps {




  @Given("I am at the {string} page")
  public void i_am_at_the_page(String page) {
      // Write code here that turns the phrase above into concrete actions

    System.out.println("?????????");
    System.out.println(page);
  }


}