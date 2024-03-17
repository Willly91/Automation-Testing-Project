package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortPage {
    private WebDriver driver;
    private By DesktopItems = By.xpath("//a[contains(@title,'category Desktops')]");
    private By SortButton = By.id("products-orderby");
    private By LowtoHigh = By.xpath("//*[@id='products-orderby']/option[4]");
    private By AtoZ = By.xpath("//*[@id='products-orderby']/option[2]");
    private Select LowPrice;
    private Select selectAZ;
    public SortPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSelectSortByLow(String low){
        WebElement Low = driver.findElement(SortButton);
        LowPrice = new Select(Low);
        LowPrice.selectByValue(low);
    }
    public void setSelectSortByAtoZ(String az){
        WebElement AZ = driver.findElement(SortButton);
        selectAZ = new Select(AZ);
        selectAZ.selectByValue(az);
    }
    public String checkSortByLowPrice(){
        return driver.findElement(LowtoHigh).getText();
    }
    public String checkSortByAtoZ(){
        return driver.findElement(AtoZ).getText();
    }
    public SortPage clickDesktopButton_ComputerCategoryPage(){
        driver.findElement(DesktopItems).click();
        return new SortPage(driver);
    }
}
