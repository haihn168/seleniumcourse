package course.selenium.Action;

import course.selenium.Components.MainMenus;
import course.selenium.Components.SearchBar;
import course.selenium.Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonAction extends BasePage {
    public CommonAction(WebDriver driver){
        super(driver);
    }
    MainMenus menus = new MainMenus(driver);
    SearchBar searchBar = new SearchBar(driver);

    public void selectMenuItems(String menu){
        menus.selectMenuItem(menu);
    }
    public void makeASearch(String searchText){
        searchBar.searchAText(searchText);
    }
    public String getPageTitle(WebDriver driver){
        System.out.println("Current page title is: " + driver.getTitle());
        return driver.getTitle();
    }
}
