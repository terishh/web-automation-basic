package pages;

import com.codeborne.selenide.SelenideElement;
import general.PageManager;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage extends BasePage {
  // Variables
  private final SelenideElement title = $("div[class*=\"heading\"] div[class='ng-star-inserted']");
  private final SelenideElement loginButton = $("button[aria-label*='Go to login page']");
  private final SelenideElement searchField = $("input[class*=\"mat-input-element\"]");
  private final SelenideElement searchButton = $("mat-search-bar[aria-label*=\"Click to search\"]");
  private final SelenideElement accountButton = $("button[aria-label*='Show/hide account menu']");
  private final SelenideElement dismissButton = $("button[aria-label*=\"Close Welcome Banner\"]");
  // Methods
  @Override
  public void doAction(String action, String data) {
    switch(capitalizeSecond(action)){
      case "searchFor": searchFor(data); break;
      default         : super.doAction(action, data);
    }
  }
  public void searchFor(String string) {
    info("Searching for '" + string + "'");
    searchButton.click();
    searchField.sendKeys(string);
    searchField.sendKeys(Keys.ENTER);
    PageManager.setCurrentPage(PageManager.SEARCH_RESULTS_PAGE);
  }
  public void clicker(String element){
    getElement(element).click();
  }
  public void navigate(String element) {
    switch (element){
      case "loginButton": PageManager.setCurrentPage(PageManager.LOGIN_PAGE);
    }
  }
  public SelenideElement getMainElement(){
    return title;
  }
  public SelenideElement elementCollector(String element) {
    switch(element) {
      case "dismissButton": return dismissButton;
      case "accountButton": return accountButton;
      case "loginButton"  : return loginButton;
      default             : return super.elementCollector(element);
    }
  }
}
