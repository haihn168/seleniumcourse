package course.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[contains(@class,'no-results')]//strong")
    WebElement noResultText;

    public String getNoResultText(){
        String resultText = noResultText.getText().toLowerCase();
        System.out.println("\nCurrent searched text is: " + resultText);
        return resultText;
    }

}
