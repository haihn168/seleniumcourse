package course.selenium.Pages;

import course.selenium.Ultilities.ElementAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
    public Loginpage(WebDriver driver){
        super(driver);
    }
    String loginPageUrl = "https://demo.getsaleor.com/en/account/login/";

    WebDriver driver;
    @FindBy(id = "id_username")
    WebElement usernameTxtFld;
    @FindBy(id = "id_password")
    WebElement paswwordTxtFld;
    @FindBy(xpath = "//button[contains(normalize-space(.),'Log in')]")
    WebElement loginBtn;
    @FindBy(xpath = "//a[contains(normalize-space(.),'Forgot password?')]")
    WebElement forgotPwdLnkTxt;
    @FindBy()
    WebElement registerBtn;

    public Loginpage navigateToLoginPage(WebDriver driver){
        driver.get(loginPageUrl);
        return this;
    }
    public Homepage loginWithUserPassword(String username, String password){
        ElementAction.sendKeys(usernameTxtFld, username, "Username field");
        ElementAction.sendKeys(paswwordTxtFld,password,"Password field");
        ElementAction.click(loginBtn, "Login button");
        return new Homepage(driver);
    }

}
