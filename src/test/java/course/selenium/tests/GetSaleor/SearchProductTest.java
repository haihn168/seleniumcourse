package course.selenium.tests.GetSaleor;

import course.selenium.Action.CommonAction;
import course.selenium.Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchProductTest extends BaseTest{

    @Test
    public void searchProductTest() {
        String searchText = "Hello ajinomoto";
        CommonAction commonAction = new CommonAction(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        commonAction.makeASearch(searchText);
        Assert.assertEquals(commonAction.getPageTitle(driver),"Search results Saleor Demo");
        Assert.assertEquals(searchResultPage.getNoResultText(),searchText.toLowerCase());
    }
}
