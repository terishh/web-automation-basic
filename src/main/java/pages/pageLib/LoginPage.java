package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage {
  // Constructor
  public LoginPage(){
    addElement("emailField", "input[aria-label*='Text field for the login email']");
    addElement("loginButton", "input[aria-label*='Text field for the login password']");
    addElement("passwordField", "input[aria-label*='Text field for the login password']");
    addElement("googleLoginButton", "button[aria-label*='Login with Google']");
    addElement("notYetACustomer", "div[id='newCustomerLink']");
  }
  // Methods
  public void login(List<Map<String, String>> data) {
    info("Logging in with following data " + data);
    // emailField.sendKeys(data.get(0).get("Email"));
    // passwordField.sendKeys(data.get(0).get("Password"));
    // loginButton.click();
    // PageManager.setCurrentPage(PageManager.HOME_PAGE_LOGGED_IN);
    throw new Error("Login not implemented");
  }
  public SelenideElement getMainElement() {
    return getElement("googleLoginButton");
  }

  @Override
  public void navigate(String element) {
    switch (element){
      case "notYetACustomer":
        PageManager.setCurrentPage(PageManager.getRegistrationPage());
    }
    super.navigate(element);
  }
}
