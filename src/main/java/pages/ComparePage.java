package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComparePage {
    private WebDriver driver;
    private By DesktopItems = By.xpath("//a[contains(@title,'category Desktops')]");
    private By CompareItem_one = By.xpath("(//button[contains(@class,'button-2 add-to-compare-list-button')])[1]");
    private By CompareItem_two = By.xpath("(//button[contains(@class,'button-2 add-to-compare-list-button')])[2]");
    private By CompareButton = By.xpath("//a[contains(text(),'Compare products')]");
    private By check_Item_one = By.xpath("(//a[contains(@href,'/digital-storm')])[2]");
    private By check_Item_two = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a");
    public ComparePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCompareOne(){
        driver.findElement(CompareItem_one).click();
    }
    public void clickCompareTwo(){
        driver.findElement(CompareItem_two).click();
    }
    public void clickDesktopButton_ComputerCategoryPage(){
        driver.findElement(DesktopItems).click();
    }
    public void clickComparePage() { driver.findElement(CompareButton).click(); }
    public String Item1(){
        return driver.findElement(check_Item_one).getText();
    }
    public String Item2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itemTwoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(check_Item_two));
        return itemTwoElement.getText();
    }
}
