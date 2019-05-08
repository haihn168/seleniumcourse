package course.selenium.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessoriesPage extends BasePage {
    public AccessoriesPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'product-list')]//span[normalize-space(@class)='product-list-item-name']")
    List<WebElement> randomAccessoriesList;
    @FindBy(xpath="//li[contains(@class,'nav-item')]/a[contains(@href,'accessories')]")
    WebElement accessoriesMenu;

    public void selectARandomProduct(){
        Random rnd = new Random();
        int x = rnd.nextInt(randomAccessoriesList.size());
        ele.click(randomAccessoriesList.get(x),"Random Accessories Item");
    }
    public void clickAccessoriesMenu(){
        ele.click(accessoriesMenu,"Accessories Menu");
    }
}
