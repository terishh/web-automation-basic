package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static general.Navigation.HOME_PAGE;



public class Hooks {
  @Before
  public void launchBrowser(){
    System.out.println("----------LAUNCHING BROWSER----------");
    System.setProperty("selenide.browser", CHROME);
  }

  @Before
  public void openHomePage(){
    open(HOME_PAGE);
  }

  @After
  public void closeBrowser(){
    System.out.println("----------CLOSING BROWSER----------");
    close();
  }
}
