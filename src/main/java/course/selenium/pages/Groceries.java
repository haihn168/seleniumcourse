package course.selenium.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import course.selenium.Ultilities.ElementAction;

public class Groceries extends DriverFactory {
    WebDriver driver;
    ElementAction ele = new ElementAction();
    
    public Groceries(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'product-list')]//span[normalize-space(@class)='product-list-item-name']")
    List<WebElement> randomGroceriesList;
    @FindBy(xpath = "//li[contains(@class,'nav-item')]/a[contains(@href,'groceries')]")
    WebElement groceriesMenu;

    public void selectARandomGroceriesProduct(){
        Random rnd = new Random();
        int x = rnd.nextInt(randomGroceriesList.size())+1;
        ele.click(randomGroceriesList.get(x), "Random Groceries product");
    }

    public void clickGroceriesMenu(){
        ele.click(groceriesMenu,"Groceries Menu");
    }
}