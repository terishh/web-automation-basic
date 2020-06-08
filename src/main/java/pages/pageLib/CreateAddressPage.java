
package pages.pageLib;
import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

public class CreateAddressPage extends BasePage {
  // Constructor
  public CreateAddressPage(){
    addElement("title", "//h1[contains(., 'Add New Address')]");
    addElement("country", "input[placeholder='Please provide a country.']");
    addElement("name", "input[placeholder='Please provide a name.']");
    addElement("mobileNumber", "input[placeholder='Please provide a mobile number.']");
    addElement("zipCode", "input[placeholder='Please provide a ZIP code.']");
    addElement("address", "textarea[placeholder='Please provide an address.']");
    addElement("city", "input[placeholder='Please provide a city.']");
    addElement("state", "input[placeholder='Please provide a state.']");
    addElement("submit", "button[id='submitButton']");
  }
  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }
}
