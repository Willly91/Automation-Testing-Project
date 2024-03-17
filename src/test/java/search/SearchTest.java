package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTests {

    @Test
    public void Search_by_Available_Item() {
        SearchPage searchPage = navBarPage.setSearch_HomePage("Apple MacBook Pro 13-inch");
        navBarPage.clickSearchButton_HomePage();
        assertTrue(searchPage.getCheckSearchItemAvailable().contains("Apple MacBook Pro 13-inch") , "Failed Search");
    }
    @Test
    public void Search_by_Not_Available_Item() {
        SearchPage searchPage = navBarPage.setSearch_HomePage("ddddddddd");
        navBarPage.clickSearchButton_HomePage();
        assertTrue(searchPage.getCheckSearchItemNotAvailable().contains("No products were found that matched your criteria.") , "Failed Search");
    }
}
