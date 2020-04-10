package pages.pageLib;

import com.codeborne.selenide.SelenideElement;

public class DeliveryPage extends BasePage {
  // Constructor
  public DeliveryPage(){
    addElement("expectedDelivery", "mat-header-cell[translate='LABEL_EXPECTED_DELIVERY']");
    addElement("oneDayDelivery", "//mat-row[contains(., 'One Day Delivery')]//mat-radio-button");
  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("expectedDelivery");
  }
}
