package course.selenium.Components;

import course.selenium.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainNavigationPages extends BasePage {
    public MainNavigationPages(WebDriver driver){
        super(driver);
    }
    //*************Object Locator*************//

    @FindBy(xpath="//li[contains(@class,'nav-item')]/a[contains(@href,'accessories')]")
    WebElement accessoriesMenu;
    @FindBy(xpath = "//li[contains(@class,'nav-item')]/a[contains(@href,'groceries')]")
    WebElement groceriesMenu;

    //***************************************//


}
