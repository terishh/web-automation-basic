package general;

import pages.PageManager;

import static com.codeborne.selenide.Selenide.open;

public class Navigation {
  // Variables
  public static final String HOME_PAGE = "http://localhost:3000/";
  public static final String LOGIN_PAGE = HOME_PAGE + "#/login";
  // Methods
  public static void navigator(String page) {
    switch (page.toLowerCase()) {
      case "home":
        navigateToHomePage();
        break;
      case "login":
        navigateToLoginPage();
        break;
      default: throw new Error("Given page '" + page + "' is undefined");
    }
  }
  public static void navigateToHomePage(){
    open(HOME_PAGE);
    PageManager.setCurrentPage(PageManager.getHomePage());
  }
  public static void navigateToLoginPage(){
    open(LOGIN_PAGE);
    PageManager.setCurrentPage(PageManager.getLoginPage());
  }
}
