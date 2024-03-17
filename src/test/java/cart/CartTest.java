package cart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTests {
    @Test
    public void Check_Price() {
        CartPage cartPage = navBarPage.clickComputerCategoryButton_HomePage_Cart();
        cartPage.clickDesktopButton_ComputerCategoryPage();
        cartPage.ChooseItem();
        cartPage.clickGotoCartButton();
        assertEquals(cartPage.CheckCount(), "$1,259.00", "Failed Cart");
    }
    @Test
    public void Update_Count_of_Item() {
        CartPage cartPage = navBarPage.clickComputerCategoryButton_HomePage_Cart();
        cartPage.clickDesktopButton_ComputerCategoryPage();
        cartPage.ChooseItem();
        cartPage.clickGotoCartButton();
        cartPage.ClearCountItem();
        cartPage.editCountItem("2");
        cartPage.UpdatedCart();
        assertEquals(cartPage.CheckNameof_Item(), "Digital Storm VANQUISH 3 Custom Performance PC", "Failed Cart");
        assertEquals(cartPage.CheckCount(), "$2,518.00", "Failed WishList");
    }
}
