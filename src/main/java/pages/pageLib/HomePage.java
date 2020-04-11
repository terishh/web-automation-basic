package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import pages.PageManager;
import pages.pageLib.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {
  // Constructor
  public HomePage(){
    addElement("title", "div[class*='heading'] div[class='ng-star-inserted']");
    addElement("loginButton", "button[aria-label*='Go to login page']");
    addElement("searchField", "input[class*='mat-input-element']");
    addElement("searchButton", "mat-search-bar[aria-label*='Click to search']");
    addElement("accountButton", "button[aria-label*='Show/hide account menu']");
    addElement("dismissButton", "button[aria-label*='Close Welcome Banner']");
    addElement("meWantIt", "a[aria-label='dismiss cookie message']");
  }
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
    getElement("searchButton").click();
    getElement("searchField").sendKeys(string);
    getElement("searchField").sendKeys(Keys.ENTER);
    PageManager.setCurrentPage(PageManager.getSearchResultsPage());
  }
  public void navigate(String element) {
    switch (element){
      case "loginButton": PageManager.setCurrentPage(PageManager.getLoginPage());
    }
  }
  public SelenideElement getMainElement(){
    return getElement("title");
  }
}
