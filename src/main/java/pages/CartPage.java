package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private By DesktopItems = By.xpath("//a[contains(@title,'category Desktops')]");
    private By Item = By.xpath("(//button[contains(@class,'button-2 product-box-add-to-cart-button')])[2]");
    private By GotoCart = By.xpath("(//a[@href='/cart'])[4]");
    private By CheckItem = By.xpath("(//a[contains(@href,'/digital')])[6]");
    private By CountItem = By.className("qty-input");
    private By CheckPriceUpdated = By.className("product-subtotal");
    private By UpdateCart = By.xpath("//button[@id='updatecart']");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ChooseItem(){
        driver.findElement(Item).click();
    }
    public void clickDesktopButton_ComputerCategoryPage(){
        driver.findElement(DesktopItems).click();
    }
    public void clickGotoCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement gotoCartButton = wait.until(ExpectedConditions.elementToBeClickable(GotoCart));
        gotoCartButton.click();
    }
    public String CheckNameof_Item(){
        return driver.findElement(CheckItem).getText();
    }
    public void ClearCountItem() {driver.findElement(CountItem).clear(); }
    public void editCountItem(String count) {driver.findElement(CountItem).sendKeys(count); }
    public void UpdatedCart(){
        driver.findElement(UpdateCart).click();
    }
    public String CheckCount(){
        return driver.findElement(CheckPriceUpdated).getText();
    }

}
