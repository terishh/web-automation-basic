package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

import java.util.List;
import java.util.Map;

public class HomePageLoggedIn extends HomePage {
  // Constructor
  public HomePageLoggedIn(){
    addElement("logoutButton", "button[aria-label='Logout']");
    addElement("userProfileButton", "button[aria-label='Go to user profile'] span");
    addElement("shoppingCartButton", "button[aria-label='Show the shopping cart']");
    addElement("ordersPaymentButton", "button[aria-label='Show Orders and Payment Menu']");
    addElement("privacySecurityButton", "button[aria-label='Show Privacy and Security Menu']");
    addElement("addToBasket", "button[aria-label='Add to Basket']");
  }
  // Methods
  public Boolean validateUserProfileButton(List<Map<String,String>> data) {
    return data.get(0).get("Email").equals(getElement("userProfileButton").text());
  }
  public SelenideElement getMainElement(){
    return getElement("shoppingCartButton");
  }

  @Override
  public void navigate(String element) {
    switch (element){
      case "shoppingCartButton": PageManager.setCurrentPage(PageManager.getBasketPage()); break;
      default: super.navigate(element);
    }
  }
}
