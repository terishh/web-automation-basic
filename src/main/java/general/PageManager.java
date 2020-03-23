package general;

import pages.*;

public class PageManager {
  // Variables
  private static BasePage currentPage = null;
  public static HomePage HOME_PAGE = new HomePage();
  public static HomePageLoggedIn HOME_PAGE_LOGGED_IN = new HomePageLoggedIn();
  public static SearchResultsPage SEARCH_RESULTS_PAGE = new SearchResultsPage();
  public static LoginPage LOGIN_PAGE = new LoginPage();
  // Methods
  public static void setCurrentPage(BasePage page){
    currentPage = page;
    PageManager.getCurrentPage().validatePage();
  }
  public static BasePage getCurrentPage(){
    return currentPage;
  }
}
