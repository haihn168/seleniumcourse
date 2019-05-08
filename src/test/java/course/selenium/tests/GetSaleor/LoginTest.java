package course.selenium.tests.GetSaleor;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import course.selenium.pages.Homepage;
import course.selenium.pages.Loginpage;


public class LoginTest extends BaseTest {

    @Parameters({"username","password"})
    @Test(enabled = true)
    public void loginSuccessfully(String username, String password){
        Loginpage loginPage = new Loginpage(driver);
        Homepage homePage = new Homepage(driver);

        homePage.navToLoginPage();
        loginPage.login(username, password);
        Assert.assertTrue(homePage.isDashboardDisplay());
        Assert.assertTrue(homePage.isYourAccountDisplay());
        Assert.assertTrue(homePage.isLogoutDisplay());
        homePage.clickLogOut();
        Assert.assertTrue(homePage.isLoginDisplay());
        Assert.assertTrue(homePage.isRegisterDisplay());
        Assert.assertTrue(homePage.isLogoutMessageDisplay());
        Assert.assertEquals(homePage.getPageTitle(),"Saleor Demo");
    }

}
