package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.BasicConfigurator;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Hooks {
  @Before
  public void setUp(){
    System.setProperty("selenide.browser", CHROME);
    open("");
  }

  @After
  public void cleanUp(){
    clearBrowserCache();
    clearBrowserCookies();
    clearBrowserLocalStorage();
  }
}
