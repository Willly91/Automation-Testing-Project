package sort;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SortPage;


import static org.testng.Assert.assertEquals;

public class SortTest extends BaseTests {

    @Test
    public void Sort_By_Low_Price() {
        SortPage sortPage = navBarPage.clickComputerCategoryButton_HomePage();
        sortPage.clickDesktopButton_ComputerCategoryPage();
        sortPage.setSelectSortByLow("10");
        assertEquals(sortPage.checkSortByLowPrice(), "Price: Low to High", "Failed Sort");
    }

    @Test
    public void Sort_By_Alpha_A_to_Z() {
        SortPage sortPage = navBarPage.clickComputerCategoryButton_HomePage();
        sortPage.clickDesktopButton_ComputerCategoryPage();
        sortPage.setSelectSortByAtoZ("5");
        assertEquals(sortPage.checkSortByAtoZ(), "Name: A to Z", "Failed Sort");
    }
}
