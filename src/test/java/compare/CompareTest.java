package compare;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ComparePage;

import static org.testng.Assert.assertEquals;

public class CompareTest extends BaseTests {
    @Test
    public void Add_Two_Items_To_Compare() {
        ComparePage comparePage = navBarPage.clickComputerCategoryButton_HomePage_Compare();
        comparePage.clickDesktopButton_ComputerCategoryPage();
        comparePage.clickCompareOne();
        navBarPage.clickComputerCategoryButton_HomePage_Compare();
        comparePage.clickDesktopButton_ComputerCategoryPage();
        comparePage.clickCompareTwo();
        navBarPage.clickComputerCategoryButton_HomePage_Compare();
        comparePage.clickDesktopButton_ComputerCategoryPage();
        comparePage.clickComparePage();
        assertEquals(comparePage.Item1(),"Digital Storm VANQUISH 3 Custom Performance PC","Failed Compare");
        assertEquals(comparePage.Item2(),"Build your own computer", "Failed Compare");
    }
}
