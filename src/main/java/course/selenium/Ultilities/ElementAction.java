package course.selenium.Ultilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementAction {
    public static void sendKeys(WebElement ele, CharSequence keys, String eleName){
        if(ele!=null){
            ele.clear();
//            System.out.println("Send keys in the " + eleName );
            System.out.format("\nSend keys '%s' in the %s", keys,eleName);
            ele.sendKeys(keys);
        }
    }
    public static void click(WebElement ele, String eleName){
        if(ele!=null){
            System.out.format("\nClick on the %s", eleName);
            ele.click();
        }
    }
    public boolean isElementDisplay(WebElement ele, String eleName){
        System.out.format("\nChecking the appearance of %s", eleName);
        if(ele.isDisplayed()){
            System.out.println("\n"+eleName+" displays");
        }else{
            System.out.println("\n"+eleName+" does not display");
        }
        return ele.isDisplayed();
    }
    public String getPageTitle(WebDriver driver){
        String title = driver.getTitle();
        System.out.format("\nVerify the Page title, current is '%s'", title);
        return title;
    }
}
