package general;

import static com.codeborne.selenide.Selenide.open;


public class Navigation {
  public static final String basePage = "http://automationpractice.com/index.php";


  public static void navigateToDynamicLoadingPage(){
    open(basePage + "dynamic_loading");

  }
}
