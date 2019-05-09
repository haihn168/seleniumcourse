package course.selenium.Components;

import course.selenium.Pages.BasePage;
import course.selenium.Pages.Loginpage;
import course.selenium.Pages.YourAccountPage;
import course.selenium.Ultilities.ElementAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class MainMenus extends BasePage {
    public MainMenus(WebDriver driver){
        super(driver);
    }
    //*************Object Locator*************//

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
    @FindBy(css = "div.navbar__login")
    WebElement loginNavBar;

    //***************************************//

    public void selectMenuItem(String menuItem){
        WebElement tmpMenu = loginNavBar.findElement(By.xpath("//a[normalize-space(.)='" + menuItem + "']"));
        ElementAction.click(tmpMenu,menuItem);
    }

}
