package course.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage {
    public YourAccountPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[@id='orders']//div[contains(@class,'table__row')][1]//a")
    WebElement firstOrder;

//    public void clickOnFirstOrder(){
//        ele.click(firstOrder,"First order detail");
//    }
}
