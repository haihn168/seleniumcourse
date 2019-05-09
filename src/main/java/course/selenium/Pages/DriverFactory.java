package course.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class DriverFactory {
    public WebDriver driver;

    public DriverFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}