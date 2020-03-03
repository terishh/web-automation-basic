package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPageObject extends BasePageObject {
  // Elements
  private final static SelenideElement resultsHeading = $("app-search-result span[id*=\"searchValue\"]");
  private final static ElementsCollection searchResultsTitles = $$("div[class*=\"item-name\"]");

  // Methods
  public Boolean validator(String scope, List<Map<String,String>> data) {
    switch (scope){
      case "validateSearchResults": return validateSearchResults(data);
      default                     : return super.validator(scope, data);
    }
  }
  public Boolean validateSearchResults(List<Map<String,String>> data) {
    ArrayList<String> elementTitles = new ArrayList<String>();
    ArrayList<String> dataTitles = new ArrayList<String>();

    for (SelenideElement el : searchResultsTitles){
      elementTitles.add(el.text());
    }

    for (Map<String, String> str : data){
      dataTitles.add(str.get("Title"));
    }

    compare(dataTitles, elementTitles);
    return elementTitles.containsAll(dataTitles);
  }
  public SelenideElement getMainElement(){
    return resultsHeading;
  }
}
