package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPageObject extends BasePageObject {
  private final static SelenideElement resultsHeading = $("h1.page-heading.product-listing");
  private final static ElementsCollection searchResults = $$("li[class*=\"product\"]");

  public void validatePage() {
    elementIsDisplayed(resultsHeading);
  }

  public Boolean validateResultsList(List<String> data){
    List<String> searchResultTitles = new ArrayList<>();

    for (SelenideElement el : searchResults){
      searchResultTitles.add(el.find("h5").getText());
    }
    return searchResultTitles.equals(data);
  }
}
