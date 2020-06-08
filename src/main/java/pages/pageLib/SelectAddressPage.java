package pages.pageLib;
import java.util.Map;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import pages.PageManager;
import java.lang.Boolean;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectAddressPage extends BasePage {
  // Constructor
  public SelectAddressPage(){
    addElement("addAddress", "button[aria-label='Add a new address']");
    addElement("radioButton", "mat-radio-button[class*=mat-radio-button]");
    addElement("continue", "button[aria-label='Proceed to payment selection']");
    addElement("timTester", "//mat-row[contains(., 'Tim Tester')]//mat-radio-button");
    addElement("addNewAddress", "button[aria-label='Add a new address']");

  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("addAddress");
  }
  @Override
  public void navigate(String element) {
    switch (element){
      case "continue": PageManager.setCurrentPage(PageManager.getDeliveryPage()); break;
      case "addNewAddress": PageManager.setCurrentPage(PageManager.getCreateAddressPage()); break;
      default        : super.navigate(element);
    }
  }
  public void doAction(String action, DataTable dataTable) {
    switch(capitalizeSecond(action)){
      case "validateAddress": validateAddress(dataTable); break;
      default: super.doAction(action, dataTable);
    }
  }

  public void validateAddress(DataTable dataTable) {
    Map<String,String> data = dataTable.transpose().asMaps().get(0);
    info("Validating address:\n" + data);
    if(data.get("Name") != null){
      assertThat(isTextVisible(data.get("Name"))).isTrue();
    }
    if(data.get("Address") != null){
      assertThat(isTextVisible(data.get("Address"))).isTrue();
    }
    if(data.get("Country") != null){
      assertThat(isTextVisible(data.get("Country"))).isTrue();
    }
  }
}
