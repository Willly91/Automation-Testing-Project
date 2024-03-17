package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By LoginButton = By.xpath("//button[contains(@class , 'login')]");
    private By ForgetPassword = By.xpath("//a[text()='Forgot password?']");
    private By Recover = By.xpath("//button[@name='send-email']");
    private By ForgetEmail = By.xpath("//*[@id='Email']");
    private By Message = By.xpath("//p[@class='content']");
    private By Close = By.xpath("//span[@class='close']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email) { driver.findElement(Email).sendKeys(email); }
    public void setPassword(String password) { driver.findElement(Password).sendKeys(password); }
    public void clickLoginButton_LoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        loginButtonElement.click();
    }
    public void clickForgetPasswordButton_LoginPage(){
        driver.findElement(ForgetPassword).click();
    }
    public String CheckMessage(){
        return driver.findElement(Message).getText();
    }
    public void setForgetPassword(String emaill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(ForgetEmail)); // Wait until the element is visible
        driver.findElement(ForgetEmail).sendKeys(emaill);
    }
    public void RecoverEmailButton_LoginPage(){
        driver.findElement(Recover).click();
    }
    public void CloseButton_LoginPage(){
        driver.findElement(Close).click();
    }
}
