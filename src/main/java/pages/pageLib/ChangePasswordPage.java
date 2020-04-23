package pages.pageLib;

import com.codeborne.selenide.SelenideElement;

public class ChangePasswordPage extends HomePageLoggedIn {
  //Constructor
  public ChangePasswordPage() {
    addElement("title", "//h1[contains(., 'Change Password')]");
    addElement("currentPasswordField", "input[aria-label='Field to enter the current password']");
  }
  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }
}
