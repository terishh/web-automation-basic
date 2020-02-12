package stepdefinitions;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.open;

import org.assertj.core.api.AssertionsForClassTypes;

import static general.Loading.waitUntilLoadingIsFinished;
import static general.Navigation.basePage;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SimpleSteps {

    // private NewHomePage home = new NewHomePage();

    @When("I navigate to homepage")
    public void i_navigate_to_homepage() {
        open(basePage);
    }

    @Then("home page is opened")
    public void home_page_is_opened() {
        // System.out.println("HomePage is opened");
        // assertThat(home.getNewHomePageTitleText()).contains("Welcome to the-internet");
    }
    @Then("Hello World is printed on the screen")
    public void helloWorldIsPrintedOnTheScreen() {
        // waitUntilLoadingIsFinished(dynamicOne.getHelloWorldTextLocation(), Condition.visible, 10000);
        // AssertionsForClassTypes.assertThat(dynamicOne.getHelloWorld()).contains("Hello World");
    }
}
