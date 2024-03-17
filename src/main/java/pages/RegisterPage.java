package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;
    private By MaleRadio = By.id("gender-male");
    private By FirstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By DateOfBirthDay = By.name("DateOfBirthDay");
    private By DateOfBirthMonth = By.name("DateOfBirthMonth");
    private By DateOfBirthYear = By.name("DateOfBirthYear");
    private Select selectDay;
    private Select selectMonth;
    private Select selectYear;
    private By Email = By.id("Email");
    private By CompanyName = By.id("Company");
    private By Newsletter = By.id("Newsletter");
    private By Password = By.id("Password");
    private By ConfirmPassword = By.id("ConfirmPassword");
    private By RegisterButton_RegisterPage = By.id("register-button");
    private By RegistrationCompleted = By.className("result");
    private By inValidFirstName = By.id("FirstName-error");
    private By inValidLastName = By.id("LastName-error");
    private By inValidPassword = By.xpath("//*[@id='Password-error']/p");
    private By inValidMatchPassword = By.id("ConfirmPassword-error");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public void setMaleRadio(){
        driver.findElement(MaleRadio).click();
    }
    public void setFirstName(String firstName) { driver.findElement(FirstName).sendKeys(firstName); }
    public void setLastName(String lastName){
        driver.findElement(LastName).sendKeys(lastName);
    }
    public void setDateOfBirthDay(String day){
        WebElement Day = driver.findElement(DateOfBirthDay);
        selectDay = new Select(Day);
        selectDay.selectByValue(day);
    }
    public void setDateOfBirthMonth(String month){
        WebElement Month = driver.findElement(DateOfBirthMonth);
        selectMonth = new Select(Month);
        selectMonth.selectByValue(month);
    }
    public void setDateOfBirthYear(String year){
        WebElement Year = driver.findElement(DateOfBirthYear);
        selectYear = new Select(Year);
        selectYear.selectByValue(year);
    }
    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }
    public void setCompanyName(String companyName) { driver.findElement(CompanyName).sendKeys(companyName); }
    public void setNewsletter(){
        driver.findElement(Newsletter).click();
    }
    public void setPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }
    public void setConfirmPassword(String confirmpassword) { driver.findElement(ConfirmPassword).sendKeys(confirmpassword); }
    public RegisterPage clickRegisterButtun_RegisterPage(){
        driver.findElement(RegisterButton_RegisterPage).click();
        return new RegisterPage(driver);
    }
    public String getRegistrationConfirm(){
        return driver.findElement(RegistrationCompleted).getText();
    }
    public String getininValidFirstNameFailed() {return driver.findElement(inValidFirstName).getText(); }
    public String getinValidLastNameFailed() {return driver.findElement(inValidLastName).getText(); }
    public String getinValidPasswordFailed() {return driver.findElement(inValidPassword).getText(); }
    public String getinValidMatchPasswordFailed() {return driver.findElement(inValidMatchPassword).getText(); }

}
