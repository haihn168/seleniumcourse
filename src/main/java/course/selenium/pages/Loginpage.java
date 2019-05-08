package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
    public Loginpage(WebDriver driver){
        super(driver);
    }

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


    public void login(String username, String password){
        ele.sendKeys(usernameTxtFld, username, "Username box");
        ele.sendKeys(paswwordTxtFld, password, "Password box");
        ele.click(loginBtn, "Login button");
    }
}
