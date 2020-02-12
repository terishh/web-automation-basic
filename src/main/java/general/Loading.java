package general;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Loading {
  public static void waitUntilLoadingIsFinished(SelenideElement elem, Condition condition, Integer time){
    elem.waitUntil(condition, time);
  }
}
