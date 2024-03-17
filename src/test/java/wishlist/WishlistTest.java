package wishlist;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WishlistPage;

import static org.testng.Assert.assertEquals;

public class WishlistTest extends BaseTests {
    @Test
    public void Add_Two_Items_To_WishList() {
        WishlistPage wishlistPage = navBarPage.clickComputerCategoryButton_HomePage_Wish();
        wishlistPage.clickDesktopButton_ComputerCategoryPage();
        wishlistPage.clickWishItemOne();
        navBarPage.clickComputerCategoryButton_HomePage_Wish();
        wishlistPage.clickDesktopButton_ComputerCategoryPage();
        wishlistPage.clickWishItemTwo();
        wishlistPage.clickwishlistButton();
        assertEquals(wishlistPage.Item1(), "Digital Storm VANQUISH 3 Custom Performance PC", "Failed WishList");
        assertEquals(wishlistPage.Item2(), "Lenovo IdeaCentre 600 All-in-One PC", "Failed WishList");
    }
}
