package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePageObject {
    private SelenideElement myAccountButton = $("ul>ul>li[id='li_myaccount']");
    private SelenideElement signUpButton = $("ul>ul>li[id='li_myaccount']>ul>li>a[href='https://www.phptravels.net/register']");

    public void clickOnSignUpButton(){
        signUpButton.click();
    }


    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }
}
