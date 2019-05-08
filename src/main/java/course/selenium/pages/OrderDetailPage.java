package course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailPage extends BasePage {
    public OrderDetailPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "textarea[id='id_customer_note']")
    WebElement customerNoteTxt;
    @FindBy(css = "input[value='Submit note']")
    WebElement submitBtn;
    @FindBy(xpath="//div[contains(@class,'order-notes')]/p")
    WebElement enteredNoteTxt;

    public void submitANote(String inputNote){
        ele.sendKeys(customerNoteTxt,inputNote,"Note box");
        ele.click(submitBtn,"Submit button");
    }

    public String getNoteText(){

        return enteredNoteTxt.getText();
    }
}
