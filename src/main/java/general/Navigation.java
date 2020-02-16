package general;

import static com.codeborne.selenide.Selenide.open;

public class Navigation {
  public static final String HOME_PAGE = "http://automationpractice.com/";

  public static void navigator(String page){
    switch (page.toLowerCase()){
      case "home":
        navigateToHomePage();
        break;
      default:
        // code block
    }
  }

  public static void navigateToHomePage(){
    open(HOME_PAGE);
    PageManager.setCurrentPage(PageManager.HOME_PAGE);
  }
}
