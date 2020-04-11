package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

public class PaymentOptionsPage extends DeliveryPage {
  // Constructor
  public PaymentOptionsPage(){
    addElement("title", "app-payment-method h1");
    addElement("continue", "button[aria-label='Proceed to review']");
  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }
  @Override
  public void navigate(String element) {
    switch (element){
      case "continue":
        PageManager.setCurrentPage(PageManager.getOrderSummaryPage());
    }
  }
}
