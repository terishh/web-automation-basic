package general;

import pages.BasePageObject;
import pages.HomePageObject;
import pages.SearchResultsPageObject;

public class PageManager {
  private static BasePageObject currentPage = null;
  public static final BasePageObject HOME_PAGE = new HomePageObject();
  public static final BasePageObject SEARCH_RESULTS_PAGE = new SearchResultsPageObject();

  public static void setCurrentPage(BasePageObject page){
    currentPage = page;
    currentPage.validatePage();
  }

  public static BasePageObject getCurrentPage(){
    return currentPage;
  }
}
