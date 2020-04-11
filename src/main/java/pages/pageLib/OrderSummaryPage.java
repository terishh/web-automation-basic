package pages.pageLib;

import com.codeborne.selenide.SelenideElement;

public class OrderSummaryPage extends PaymentOptionsPage {
  // Constructor
  public OrderSummaryPage(){
    addElement("placeYourOrderAndPay", "button[aria-label='Complete your purchase']");
  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("placeYourOrderAndPay");
  }
}
