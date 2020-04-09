package pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {
  // Variables
  private final static SelenideElement resultsHeading = $("app-search-result span[id*=\"searchValue\"]");
  // private final static SelenideElement dialogBoxTitle = $("mat-dialog-container h1");
  // Methods
  @Override
  public void doAction(String action, DataTable dataTable) {
    switch (capitalizeSecond(action)){
      case "validateSearchResults": validateSearchResults(dataTable); break;
      default                     : super.doAction(action, dataTable);
    }
  }
  public void validateSearchResults(DataTable dataTable) {
    Map<String,String> data = dataTable.transpose().asMaps().get(0);
    info("Validating search results with the following data:\n" + data);
    if(data.get("Name") != null){
      assertThat(isTextVisible(data.get("Name"))).isTrue();
    }
    if(data.get("Description") != null){
      assertThat(isTextVisible(data.get("Description"))).isTrue();
    }
    if(data.get("Price") != null){
      assertThat(isTextVisible(data.get("Price"))).isTrue();
    }
  }
  public SelenideElement getMainElement(){
    return resultsHeading;
  }
}
