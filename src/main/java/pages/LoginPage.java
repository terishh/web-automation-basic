package pages;

import com.codeborne.selenide.SelenideElement;
import general.PageManager;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
  // Variables
  private final static SelenideElement emailField = $("input[aria-label*='Text field for the login email']");
  private final static SelenideElement loginButton = $("button[aria-label='Login']");
  private final static SelenideElement passwordField = $("input[aria-label*='Text field for the login password']");
  private final static SelenideElement googleLoginButton = $("button[aria-label*='Login with Google']");
  // Methods
  public void login(List<Map<String, String>> data) {
    info("Logging in with following data " + data);
    emailField.sendKeys(data.get(0).get("Email"));
    passwordField.sendKeys(data.get(0).get("Password"));
    loginButton.click();
    PageManager.setCurrentPage(PageManager.HOME_PAGE_LOGGED_IN);
  }
  public SelenideElement getMainElement() {
    return googleLoginButton;
  }
  public SelenideElement elementCollector(String element) {
    switch (element) {
      case "googleLoginButton": return googleLoginButton;
      case "loginButton"      : return loginButton;
      case "emailField"       : return emailField;
      case "passwordField"    : return passwordField;
      default                 : return super.elementCollector(element);
    }
  }
}
