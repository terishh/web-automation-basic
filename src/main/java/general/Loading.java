package general;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Loading {
  // Methods
  public static void waitUntilDisplayed(SelenideElement elem, Integer time){
    elem.waitUntil(Condition.visible, time * 1000);
  }
  public static Boolean isDisplayed(SelenideElement elem, Integer time){
    try{
      waitUntilDisplayed(elem, time);
      return true;
    }catch (Error e){
      return false;
    }
  }
}
