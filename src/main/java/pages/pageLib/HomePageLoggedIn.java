package pages.pageLib;

import java.util.Map;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import pages.PageManager;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageLoggedIn extends HomePage {
  // Constructor
  public HomePageLoggedIn(){
    addElement("logoutButton", "button[aria-label='Logout']");
    addElement("userProfileButton", "button[aria-label='Go to user profile'] span");
    addElement("shoppingCartButton", "button[aria-label='Show the shopping cart']");
    addElement("ordersPaymentButton", "button[aria-label='Show Orders and Payment Menu']");
    addElement("privacySecurityButton", "button[aria-label='Show Privacy and Security Menu']");
    addElement("addToBasket", "button[aria-label='Add to Basket']");
    addElement("changePassword", "button[aria-label='Go to change password page']");
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
      case "changePassword":
        PageManager.setCurrentPage(PageManager.getChangePasswordPage()); break;
      default: super.navigate(element);
    }
  }

  public void doAction(String action, DataTable dataTable) {
    switch(capitalizeSecond(action)){
      case "validateAccountMenu": validateAccountMenu(dataTable); break;
      default: super.doAction(action, dataTable);
    }
  }

  public void validateAccountMenu(DataTable dataTable){
    Map<String,String> data = dataTable.transpose().asMaps().get(0);
    info("Validating Account menu: " + data);

    if(data.get("Orders & Payment") != null){
      assertThat(getElement("ordersPaymentButton").text().contains(data.get("Orders & Payment"))).isTrue();
    }

    if(data.get("Privacy & Security") != null){
      assertThat(getElement("privacySecurityButton").text().contains(data.get("Privacy & Security"))).isTrue();
    }

    if(data.get("Logout") != null){
      assertThat(getElement("logoutButton").text().contains(data.get("Logout"))).isTrue();
    }
  }
}
