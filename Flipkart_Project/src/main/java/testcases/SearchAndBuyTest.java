package testcases;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchAndBuyTest extends BaseTest {

    @Test
    public void searchAndBuyProduct() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.closeLoginPopup();
        home.searchProduct("iPhone");

        SearchResultsPage results = new SearchResultsPage(driver);
        results.applyMemoryFilter("128 GB");
        results.selectProduct();

        results.addToCart();

        // Stopping here - no login, address, or tab switching
    }
}
