package general;

import pages.*;

public class PageManager {
  private static BasePageObject currentPage = null;
  public static HomePageObject HOME_PAGE = new HomePageObject();
  public static HomePageLoggedInObject HOME_PAGE_LOGGED_IN = new HomePageLoggedInObject();
  public static SearchResultsPageObject SEARCH_RESULTS_PAGE = new SearchResultsPageObject();
  public static LoginPageObject LOGIN_PAGE = new LoginPageObject();

  public static void setCurrentPage(BasePageObject page){
    currentPage = page;
    PageManager.getCurrentPage().validatePage();
  }
  public static BasePageObject getCurrentPage(){
    return currentPage;
  }
}
