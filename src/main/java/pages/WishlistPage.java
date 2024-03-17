package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
    private WebDriver driver;
    private By DesktopItems = By.xpath("//a[contains(@title,'category Desktops')]");
    private By WishItem_one = By.xpath("(//button[contains(@class,'button-2 add-to-wishlist-button')])[2]");
    private By WishItem_two = By.xpath("(//button[contains(@class,'button-2 add-to-wishlist-button')])[3]");
    private By WishlistButton = By.className("wishlist-label");
    private By CheckItem_one = By.xpath("(//a[contains(@class,'product-name')])[1]");
    private By CheckItem_two = By.xpath("(//a[contains(@class,'product-name')])[2]");
    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWishItemOne(){
        driver.findElement(WishItem_one).click();
    }
    public void clickWishItemTwo() { driver.findElement(WishItem_two).click(); }
    public void clickDesktopButton_ComputerCategoryPage(){
        driver.findElement(DesktopItems).click();
    }
    public void clickwishlistButton(){
        driver.findElement(WishlistButton).click();
    }
    public String Item1(){
        return driver.findElement(CheckItem_one).getText();
    }
    public String Item2(){
        return driver.findElement(CheckItem_two).getText();
    }

}
