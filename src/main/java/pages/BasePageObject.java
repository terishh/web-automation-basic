package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import general.PageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static general.Loading.waitUntilLoadingIsFinished;

public class BasePageObject {
  private final static Integer default_timeout = 10000;
  private final static SelenideElement searchMenu = $("input[id=\"search_query_top\"]");
  private final static SelenideElement submitButton = $("button[name=\"submit_search\"]");

  public static void searchFor(String str){
    searchMenu.clear();
    searchMenu.sendKeys(str);
    submitButton.click();
    PageManager.setCurrentPage(PageManager.SEARCH_RESULTS_PAGE);
  }

  public void validatePage(){
    elementIsDisplayed(searchMenu);
  }

  public Integer get_timeout(){
    return  default_timeout;
  }

  public void elementIsDisplayed(SelenideElement element){
    waitUntilLoadingIsFinished(element, Condition.visible, get_timeout());
  }

  public Boolean validateData(String element, List<String> data) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    return (Boolean) this.getClass().getMethod("validate" + capitalize(element), List.class).invoke(this, data);
  }

  // PRIVATE METHODS --------------------
  private static String capitalize(String words){
    StringBuilder capitalized = new StringBuilder();
    for(String word: words.split(" ")){
      capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
    }
    return capitalized.toString().replaceAll("\\s+","");
  }
}
