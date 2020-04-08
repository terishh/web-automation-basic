package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {
  // Variables
  private final static SelenideElement resultsHeading = $("app-search-result span[id*=\"searchValue\"]");
  private final static ElementsCollection searchResultsTitles = $$("div[class*=\"item-name\"]");
  // Methods
  @Override
  public void doAction(String action, DataTable dataTable) {
    switch (capitalizeSecond(action)){
      case "validateSearchResults": validateSearchResults(dataTable); break;
      default                     : super.doAction(action, dataTable);
    }
  }

  public void validateSearchResults(DataTable dataTable) {
    List<Map<String,String>> data = dataTable.transpose().asMaps();
    info("Validating search results with the following data:\n" + data);
    ArrayList<String> elementTitles = new ArrayList<String>();
    ArrayList<String> dataTitles = new ArrayList<String>();



    // compare(dataTitles, elementTitles);
    // assertThat(elementTitles.containsAll(dataTitles)).isTrue();
  }

  public SelenideElement getMainElement(){
    return resultsHeading;
  }
}
