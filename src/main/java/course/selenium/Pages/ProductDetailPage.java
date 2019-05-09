package course.selenium.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;


public class ProductDetailPage extends BasePage{
    public ProductDetailPage(WebDriver driver){
        super(driver);
    }
    Random rndNum = new Random();
    int qty = rndNum.nextInt(20)+1;
    String prdName;
    int prdPrice;

    @FindBy(id = "id_quantity")
    WebElement qtyInput;
    @FindBy(xpath="//input[@id='id_quantity']/following::div/button[normalize-space(.) = 'Add to cart']")
    WebElement addToCartBtn;
    @FindBy(xpath="//div[@id='variant-price-component']//*[contains(@class,'product__info__price')]/span")
    WebElement pricePerItemTxt;
    @FindBy(xpath="//h1[contains(@class,'product__info__name')]")
    WebElement productNameTxt;

    public int getPriceOfProduct(){
        String tempPrice =  pricePerItemTxt.getText().replaceAll("(^\\h*)|(\\h*$)","");
        prdPrice = Integer.parseInt(tempPrice);
        return prdPrice;
    }
    public String getProductName(){
        prdName = productNameTxt.getText().replaceAll("(^\\h*)|(\\h*$)","");
        return prdName;
    }

//    public void enterRandomQuantity(){
//        ele.sendKeys(qtyInput, Keys.BACK_SPACE,"");
//        ele.sendKeys(qtyInput,String.valueOf(qty),"Quantity");
//    }

//    public void addToCart(){
//        ele.click(addToCartBtn,"Add to cart button");
//    }


}
