package course.selenium.tests.GetSaleor;

import course.selenium.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Parameters({"username","password"})
    @Test(enabled = true)
    public void addToCartTest(String username, String password) throws InterruptedException {
        String testNote = "This is a note";
        AccessoriesPage accessoriesPage = new AccessoriesPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        YourCartPage yourCartPage = new YourCartPage(driver);
        Groceries groceries = new Groceries(driver);
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        OrderDetailPage orderDetailPage = new OrderDetailPage(driver);
        Loginpage loginpage = new Loginpage(driver);
        Homepage homepage = new Homepage(driver);

//        homepage.navToLoginPage();
//        loginpage.login(username,password);
//        accessoriesPage.clickAccessoriesMenu();
//        accessoriesPage.selectARandomProduct();
//        productDetailPage.enterRandomQuantity();
//        productDetailPage.addToCart();
//        yourCartPage.checkOutItems();
//        homepage.clickYourAccount();
//        yourAccountPage.clickOnFirstOrder();
//        orderDetailPage.submitANote(testNote);
//        Thread.sleep(5000);
//        Assert.assertEquals(testNote,orderDetailPage.getNoteText());

    }
}
