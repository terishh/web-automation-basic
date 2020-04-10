package pages.pageLib;

import com.codeborne.selenide.SelenideElement;

public class SelectAddressPage extends BasePage {
  // Constructor
  public SelectAddressPage(){
    addElement("addAddress", "button[aria-label='Add a new address']");
    addElement("radioButton", "mat-radio-button[class*=mat-radio-button]");
    addElement("continue", "button[aria-label='Proceed to payment selection']");
  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("addAddress");
  }

  @Override
  public void navigate(String element) {
    switch (element){
      case "continue":
    }
  }
}
