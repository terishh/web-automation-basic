package pages;

import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class HomePageLoggedInObject extends HomePageObject {
  // Elements
  private final SelenideElement logoutButton = $("button[aria-label='Logout']");
  private final SelenideElement userProfileButton = $("button[aria-label='Go to user profile'] span");
  private final SelenideElement shoppingCartButton = $("button[aria-label='Show the shopping cart']");
  private final SelenideElement ordersPaymentButton = $("button[aria-label='Show Orders and Payment Menu']");
  private final SelenideElement privacySecurityButton = $("button[aria-label='Show Privacy and Security Menu']");

  // Methods
  public Boolean validator(String scope, List<Map<String,String>> data) {
    switch (scope){
      case "validateUserProfileButton": return validateUserProfileButton(data);
      default                         : return super.validator(scope, data);
    }
  }
  public Boolean validateUserProfileButton(List<Map<String,String>> data) {
    return data.get(0).get("Email").equals(userProfileButton.text());
  }
  public SelenideElement getMainElement(){
    return shoppingCartButton;
  }
  public SelenideElement elementCollector(String element) {
    switch (element){
      case "ordersPaymentButton"  : return ordersPaymentButton;
      case "privacySecurityButton": return privacySecurityButton;
      case "logoutButton"         : return logoutButton;
      default                     : return super.elementCollector(element);
    }
  }
}
