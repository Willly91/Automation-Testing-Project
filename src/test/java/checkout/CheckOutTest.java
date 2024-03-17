package checkout;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import static org.testng.Assert.assertEquals;

public class CheckOutTest extends BaseTests {
    @Test
    public void Check_Out_Process_Test() {
        CheckOutPage checkOutPage = navBarPage.clickComputerCategoryButton_HomePage_CheckOut();
        checkOutPage.clickDesktopButton_ComputerCategoryPage();
        checkOutPage.ChooseItem();
        checkOutPage.clickGotoCartButton();
        checkOutPage.AgreeButton();
        checkOutPage.CheckoutButton();
        checkOutPage.setEmail("mohamedwaleed9@gmail.com");
        checkOutPage.setPassword("123456");
        checkOutPage.LoginButton();
        checkOutPage.AgreeButton();
        checkOutPage.CheckoutButton();
        checkOutPage.setCountry("239");
        checkOutPage.setCity("NewCairo");
        checkOutPage.setAddres1("Luttos");
        checkOutPage.setAddres2("NorthLuttos");
        checkOutPage.setZip("11835");
        checkOutPage.setPhone("0111111111");
        checkOutPage.setFax("4578965");
        checkOutPage.ClickInfoPage();
        checkOutPage.ClickShipping();
        checkOutPage.ClickPaymentMethod();
        checkOutPage.ClickPaymentInfo();
        assertEquals(checkOutPage.getInfoOfItem(), "Digital Storm VANQUISH 3 Custom Performance PC", "Failed CheckOut");
        checkOutPage.ConfirmButton();
        assertEquals(checkOutPage.getSuccessfulMessage(), "Your order has been successfully processed!", "Failed CheckOut");
        checkOutPage.FinishButton();
    }
}
