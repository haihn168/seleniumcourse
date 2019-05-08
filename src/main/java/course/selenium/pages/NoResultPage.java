package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoResultPage extends BasePage {
    public NoResultPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[contains(@class,'no-results')]//strong")
    WebElement noResultText;

    public String getNoResultText(){
        String resultText = noResultText.getText().toLowerCase();
        System.out.println("\nCurrent searched text is: " + resultText);
        return resultText;
    }

    public boolean verifySearchPageTitle(WebDriver driver){
        String title = ele.getPageTitle(driver);
        if(title.equals("Search results Saleor Demo")) {
            return true;
        } else {
            return false;
        }
    }
}
