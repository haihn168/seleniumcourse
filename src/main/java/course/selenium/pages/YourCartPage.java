package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage {
    public YourCartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='cart']//div[contains(@class,'table__row') and contains(@class,'cart__line')]")
    List<WebElement> productList;
    @FindBy(css = "div.navbar__brand__cart a.cart__icon")
    WebElement cartBtn;
    @FindBy(css = "a[class~='cart__submit']")
    WebElement checkOutBtn;
    @FindBy(css = "form.checkout__shipping div button[type='submit']")
    WebElement shippingAddrContinueBtn;
    @FindBy(xpath = "//div[@class='checkout__shipping-methods']//button[contains(text(),'Continue')]")
    WebElement shippingMethodContinueBtn;
    @FindBy(xpath = "//div[@class='checkout__billing-form']//button")
    WebElement orderPayBtn;
    public void getPrice(){
       for(int i=0; i< productList.size(); i++){
           System.out.println(i);
       }
    }
    public void clickCartBtn(){
        ele.click(cartBtn,"Cart button");
    }
    public void checkOutItems() throws InterruptedException{
        Thread.sleep(5000);
        ele.click(cartBtn,"Cart button");
        ele.click(checkOutBtn,"Checkout button");
        ele.click(shippingAddrContinueBtn,"Shipping Address Form Continue button");
        ele.click(shippingMethodContinueBtn,"Shipping method Continue button");
        Thread.sleep(5000);
        ele.click(orderPayBtn,"Order & Pay button");
    }
}
