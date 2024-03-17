package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    private WebDriver driver;
    private By DesktopItems = By.xpath("//a[contains(@title,'category Desktops')]");
    private By Item = By.xpath("(//button[contains(@class,'button-2 product-box-add-to-cart-button')])[2]");
    private By GotoCart = By.xpath("(//a[@href='/cart'])[4]");
    private By IAgree = By.xpath("//input[@id='termsofservice']");
    private By CheckOut = By.xpath("//button[@id='checkout']");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By Login = By.xpath("//button[@class='button-1 login-button']");
    private By Country = By.xpath("//*[@id='BillingNewAddress_CountryId']");
    private Select countryname;
    private By City = By.id("BillingNewAddress_City");
    private By Address1 = By.id("BillingNewAddress_Address1");
    private By Address2 = By.id("BillingNewAddress_Address2");
    private By Zipcode = By.id("BillingNewAddress_ZipPostalCode");
    private By Phone = By.id("BillingNewAddress_PhoneNumber");
    private By Fax = By.id("BillingNewAddress_FaxNumber");
    private By Countinue1 = By.xpath("(//button[contains(@class,'button-1 new-address-next-step-button')])[1]");
    private By Countinue2 = By.xpath("//button[contains(@class,'button-1 shipping-method-next-step-button')]");
    private By Countinue3 = By.xpath("//button[contains(@class,'button-1 payment-method-next-step-button')]");
    private By Countinue4 = By.xpath("//button[contains(@class,'button-1 payment-info-next-step-button')]");
    private By ItemInfo = By.xpath("(//a[contains(@href,'/digital')])[6]");
    private By Confirm = By.xpath("//button[contains(@class,'button-1 confirm-order-next-step-button')]");
    private By SuccessfulMessage = By.xpath("(//strong)[1]");
    private By FinishProcess = By.xpath("//button[contains(@class,'button-1 order-completed-continue-button')]");
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickDesktopButton_ComputerCategoryPage(){
        driver.findElement(DesktopItems).click();
    }
    public void ChooseItem(){
        driver.findElement(Item).click();
    }
    public void clickGotoCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement gotoCartButton = wait.until(ExpectedConditions.elementToBeClickable(GotoCart));
        gotoCartButton.click();
    }
    public void AgreeButton(){
        driver.findElement(IAgree).click();
    }
    public void CheckoutButton(){
        driver.findElement(CheckOut).click();
    }
    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }
    public void LoginButton() { driver.findElement(Login).click();}
    public void setCity(String city){
        driver.findElement(City).sendKeys(city);
    }
    public void setAddres1(String address1){
        driver.findElement(Address1).sendKeys(address1);
    }
    public void setAddres2(String address2){
        driver.findElement(Address2).sendKeys(address2);
    }
    public void setZip(String zip){
        driver.findElement(Zipcode).sendKeys(zip);
    }
    public void setPhone(String phone){
        driver.findElement(Phone).sendKeys(phone);
    }
    public void setFax(String fax) {driver.findElement(Fax).sendKeys(fax); }
    public void ClickInfoPage(){
        driver.findElement(Countinue1).click();
    }
    public void ClickShipping() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continue2Element = wait.until(ExpectedConditions.elementToBeClickable(Countinue2));
        continue2Element.click();
    }
    public void ClickPaymentMethod() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continue3Element = wait.until(ExpectedConditions.elementToBeClickable(Countinue3));
        continue3Element.click();
    }
    public void ClickPaymentInfo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continue4Element = wait.until(ExpectedConditions.elementToBeClickable(Countinue4));
        continue4Element.click();
    }
    public String getInfoOfItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement itemElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ItemInfo));
        return itemElement.getText();
    }
    public void ConfirmButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as per your requirement
        WebElement confirmElement = wait.until(ExpectedConditions.elementToBeClickable(Confirm));
        confirmElement.click();
    }
    public String getSuccessfulMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessfulMessage));
        return successElement.getText();
    }
    public void FinishButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as per your requirement
        WebElement finishElement = wait.until(ExpectedConditions.elementToBeClickable(FinishProcess));
        finishElement.click();
    }
    public void setCountry(String country) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as per your requirement
        WebElement countryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Country));
        countryname = new Select(countryElement);
        countryname.selectByValue(country);
    }
}
