package pages;

import com.codeborne.selenide.SelenideElement;
import general.Loading;
import general.Logger;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

public class BasePage {
  // Variables
  private final Integer defaultTimeout = 5;
  private final Logger logger = new Logger();
  // General methods
  public void click(String element) {
    element = capitalizeSecond(element);
    info("Clicking '" + element +"'");
    clicker(element);
    navigate(element);
  }
  public void doAction(String action, DataTable dataTable) {
    throw new Error(action + " is undefined");
  }
  public void doAction(String action, String data){
    throw new Error(action + " is undefined");
  }
  public void validatePage() {
    info("Validating page: " + this.getClass());
    assertThat(isDisplayed(getMainElement(), getTimeout())).isTrue();
  }


  public void clickText(String text){
    getTextElement(text).click();
  }
  public Boolean isTextVisible(String text) { return getTextElement(text).isDisplayed(); }
  public SelenideElement getTextElement(String text){
    return $(byXpath("//*[contains(text(), '" + text + "')]"));
  }



  public void validateFields(DataTable dataTable) {
    info("Validating fields: " + dataTable.asList());
    for(String element : dataTable.asList()){
      assertThat(isDisplayed(getElement(capitalizeSecond(element)), getTimeout()));
    }
  }
  public Integer getTimeout(){
    return defaultTimeout;
  }
  public SelenideElement getElement(String element) {
    info("Getting '" + element + "'");
    return elementCollector(element);
  }
  public SelenideElement elementCollector(String element) {
    switch (element){
      default: throw new Error("Given element '" + element + "' is undefined");
    }
  }
  // Overridable methods
  public void clicker(String element){
    throw new Error(element + " is undefined in clicker for " + this.getClass());
  }
  public void navigate(String element){}
  public SelenideElement getMainElement(){
    throw new Error("'getMainElement' is undefined for " + this.getClass());
  }
  // Helper methods
  public void info(String str){
    logger.info(str);
  }
  public void compare(List<String> expected, List<String> actual) {
    logger.compare(expected, actual);
  }
  public String capitalize(String words){
    words = words.toLowerCase().
            replaceAll("[^a-zA-Z0-9]", " ").
            replaceAll("\\s+"," ");
    StringBuilder capitalized = new StringBuilder();
    for(String word: words.split(" ")){
      capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
    }
    return capitalized.toString().replaceAll("\\s+","");
  }
  public String capitalizeSecond(String words){
    String str = capitalize(words);
    return Character.toLowerCase(str.charAt(0)) + str.substring(1);
  }
  public Boolean isDisplayed(SelenideElement elem, Integer time){
    if (Loading.isDisplayed(elem, time)){
      info("Element found");
      return true;
    } else {
      info("Element not found");
      return false;
    }
  }
}
