package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavBarPage {
    private WebDriver driver;
    private By RegisterButton_HomePage = By.className("ico-register");
    private By LoginButton_HomePage = By.className("ico-login");
    private By checkLoginSuccess = By.className("ico-account");
    private By LogoutButton_HomePage = By.className("ico-logout");
    private By LogoutSuccess = By.className("ico-login");
    private By ComputerItems = By.xpath("//a[contains(@href,'/computers')]");
    private By SearchInput_HomePage = By.xpath("//input[@name='q']");
    private By SearchButton_HomePage = By.xpath("//button[contains(@class,'button-1 search-box-button')]");
    public NavBarPage(WebDriver driver) {
        this.driver = driver;
    }
    public RegisterPage clickRegisterButton_HomePage(){
        driver.findElement(RegisterButton_HomePage).click();
        return new RegisterPage(driver);
    }
    public LoginPage clickLoginButton_HomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(LoginButton_HomePage));

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", loginButton);

        return new LoginPage(driver);
    }
    public String getCheckLoginConfirm(){
        return driver.findElement(checkLoginSuccess).getText();
    }
    public void clickLogoutButton_HomePage(){
        driver.findElement(LogoutButton_HomePage).click();
    }
    public String checkLogoutConfirm(){
        return driver.findElement(LogoutSuccess).getText();
    }
    public String getLoginFailed(){
        return driver.findElement(RegisterButton_HomePage).getText();
    }
    public SortPage clickComputerCategoryButton_HomePage(){
        driver.findElement(ComputerItems).click();
        return new SortPage(driver);
    }
    public SearchPage setSearch_HomePage(String search) { driver.findElement(SearchInput_HomePage).sendKeys(search);
        return new SearchPage(driver); }
    public void clickSearchButton_HomePage() {
        driver.findElement(SearchButton_HomePage).click();
    }
    public WishlistPage clickComputerCategoryButton_HomePage_Wish(){
        driver.findElement(ComputerItems).click();
        return new WishlistPage(driver);
    }
    public ComparePage clickComputerCategoryButton_HomePage_Compare(){
        driver.findElement(ComputerItems).click();
        return new ComparePage(driver);
    }
    public CartPage clickComputerCategoryButton_HomePage_Cart(){
        driver.findElement(ComputerItems).click();
        return new CartPage(driver);
    }
    public CheckOutPage clickComputerCategoryButton_HomePage_CheckOut(){
        driver.findElement(ComputerItems).click();
        return new CheckOutPage(driver);
    }

}
