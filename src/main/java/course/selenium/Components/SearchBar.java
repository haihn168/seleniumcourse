package course.selenium.Components;

import course.selenium.Pages.BasePage;
import course.selenium.Ultilities.ElementAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends BasePage {
    public SearchBar(WebDriver driver){
        super(driver);
    }
    //*************Object Locator*************//

    @FindBy(css = "form[class*='search-form'] input")
    WebElement searchFormBox;
    @FindBy(css = "form[class~='search-form'] button[type~='submit']")
    WebElement searchBtn;

    //***************************************//
    public void searchAText(String searchText){
        ElementAction.sendKeys(searchFormBox,searchText,"Search form");
        ElementAction.click(searchBtn,"Search button");
    }
}
