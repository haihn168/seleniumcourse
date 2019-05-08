package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    public Homepage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'navbar__login')]//a[normalize-space(.)='Dashboard']")
    WebElement dashboardLnkTxt;
    @FindBy(xpath = "//div[contains(@class,'navbar__login')]//a[normalize-space(.)='Your account']")
    WebElement yourAccountLnkTxt;
    @FindBy(xpath = "//div[contains(@class,'navbar__login')]//a[normalize-space(.)='Log out']")
    WebElement logoutLnkTxt;
    @FindBy(xpath = "//div[contains(@class,'navbar__login')]//a[normalize-space(.)='Register']")
    WebElement registerBtnLnkTxt;
    @FindBy(xpath = "//div[contains(@class,'navbar__login')]//a[normalize-space(.)='Log in']")
    WebElement loginLnkTxt;
    @FindBy(xpath = "//div[contains(@class,'alert-success') and contains(normalize-space(.),'You have been successfully logged out.')]")
    WebElement logoutMsg;
    @FindBy(css = "form[class*='search-form'] input")
    WebElement searchFormBox;
    @FindBy(css = "form[class~='search-form'] button[type~='submit']")
    WebElement searchBtn;

    public boolean isDashboardDisplay(){
        return ele.isElementDisplay(dashboardLnkTxt, "Dashboard link");
    }
    public boolean isYourAccountDisplay(){
        return ele.isElementDisplay(yourAccountLnkTxt, "Your account link");
    }
    public boolean isLogoutDisplay(){
        return ele.isElementDisplay(logoutLnkTxt, "Log out link");
    }
    public boolean isRegisterDisplay(){
        return ele.isElementDisplay(registerBtnLnkTxt, "Register link");
    }
    public boolean isLoginDisplay(){
        return ele.isElementDisplay(loginLnkTxt, "Log in link");
    }
    public boolean isLogoutMessageDisplay(){
        return ele.isElementDisplay(logoutMsg, "Log out message");
    }
    public void clickYourAccount(){
        ele.click(yourAccountLnkTxt,"Your Account Link");
    }
    public void clickLogOut(){
        ele.click(logoutLnkTxt, "Log out link");
    }
    public String getPageTitle(){
        return ele.getPageTitle(driver);
    }
    public void navToLoginPage(){
        ele.click(loginLnkTxt,"Login Menu");
    }
    public Homepage enterSearch(String searchText){
        ele.sendKeys(searchFormBox,searchText,"Search box");
        return this;
    }
    public NoResultPage clickSearchButton(){
        ele.click(searchBtn,"Search button");
        return PageFactory.initElements(driver, NoResultPage.class);
    }
}
