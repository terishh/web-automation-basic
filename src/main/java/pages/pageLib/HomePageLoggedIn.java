package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

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
  public SelenideElement getMainElement(){
    return getElement("shoppingCartButton");
  }
  @Override
  public void navigate(String element) {
    switch (element){
      case "shoppingCartButton":
        if(isDisplayed(getElement("snackbarButton"), 2)){
          getElement("snackbarButton").click();
        }
        PageManager.setCurrentPage(PageManager.getBasketPage()); break;
      default: super.navigate(element);
    }
  }
}
