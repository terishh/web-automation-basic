package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePageObject extends BasePageObject {
  private static SelenideElement homeSlider = $("ul[id=\"homeslider\"] li.homeslider-container");

  @Override
  public void validatePage(){
    elementIsDisplayed(homeSlider);
  }
}
