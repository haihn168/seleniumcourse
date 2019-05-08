package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import course.selenium.Ultilities.ElementAction;

public class BasePage extends DriverFactory {
    public BasePage(WebDriver driver){
        super(driver);
    }
    ElementAction ele = new ElementAction();
    WebDriverWait wait = new WebDriverWait(driver,10);
}
