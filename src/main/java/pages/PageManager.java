package pages;

import pages.pageLib.*;

public class PageManager {
  // Variables
  private static BasePage currentPage = null;
  private static HomePage HOME_PAGE = new HomePage();
  private static HomePageLoggedIn HOME_PAGE_LOGGED_IN = new HomePageLoggedIn();
  private static SearchResultsPage SEARCH_RESULTS_PAGE = new SearchResultsPage();
  private static LoginPage LOGIN_PAGE = new LoginPage();
  private static RegistrationPage registrationPage = new RegistrationPage();
  // Methods
  public static void setCurrentPage(BasePage page){
    currentPage = page;
    PageManager.getCurrentPage().validatePage();
  }
  public static BasePage getCurrentPage(){
    return currentPage;
  }
  // Getters & setters
  public static HomePage getHomePage() {
    return HOME_PAGE;
  }
  public static HomePageLoggedIn getHomePageLoggedIn() {
    return HOME_PAGE_LOGGED_IN;
  }
  public static SearchResultsPage getSearchResultsPage() {
    return SEARCH_RESULTS_PAGE;
  }
  public static LoginPage getLoginPage() {
    return LOGIN_PAGE;
  }
  public static RegistrationPage getRegistrationPage() {
    return registrationPage;
  }
}
