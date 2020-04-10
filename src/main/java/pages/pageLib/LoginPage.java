package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import pages.PageManager;
import java.util.Map;

public class LoginPage extends BasePage {
  // Constructor
  public LoginPage(){
    addElement("emailField", "input[aria-label*='Text field for the login email']");
    addElement("passwordField", "input[aria-label*='Text field for the login password']");
    addElement("loginButton", "button[aria-label*='Login");
    addElement("googleLoginButton", "button[aria-label*='Login with Google']");
    addElement("notYetACustomer", "div[id='newCustomerLink']");
  }
  // Methods
  @Override
  public void doAction(String action, DataTable dataTable) {
    switch (capitalizeSecond(action)){
      case "logIn": login(dataTable); break;
      default     : super.doAction(action, dataTable);
    }
  }
  @Override
  public void navigate(String element) {
    switch (element){
      case "notYetACustomer": PageManager.setCurrentPage(PageManager.getRegistrationPage()); break;
      default               : super.navigate(element);
    }
  }
  public void login(DataTable dataTable){
    Map<String,String> data = dataTable.transpose().asMaps().get(0);
    info("Logging in with following data " + data);
    getElement("emailField").sendKeys(data.get("Email"));
    getElement("passwordField").sendKeys(data.get("Password"));
    getElement("loginButton").click();

    PageManager.setCurrentPage(PageManager.getHomePageLoggedIn());
  }
  public SelenideElement getMainElement() {
    return getElement("googleLoginButton");
  }
}
