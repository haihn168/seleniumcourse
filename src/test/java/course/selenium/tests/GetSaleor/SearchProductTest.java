package course.selenium.tests.GetSaleor;

import course.selenium.pages.Homepage;
import course.selenium.pages.NoResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchProductTest extends BaseTest{

    @Test
    public void searchProductTest() {
        String searchText = "Hello ajinomoto";
        Homepage homepage = new Homepage(driver);
        NoResultPage noResultPage = new NoResultPage(driver);
        homepage.enterSearch(searchText)
                .clickSearchButton();
        Assert.assertTrue(noResultPage.verifySearchPageTitle(driver));
        Assert.assertEquals(noResultPage.getNoResultText(),searchText.toLowerCase());
    }
}
