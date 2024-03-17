package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By checkItemAvailable = By.xpath("(//a[contains(@href,'/apple-macbook-pro-13-inch')])[2]");
    private By checkItemNotAvailable = By.className("no-result");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getCheckSearchItemAvailable() {
        return driver.findElement(checkItemAvailable).getText(); }
    public String getCheckSearchItemNotAvailable() {
        return driver.findElement(checkItemNotAvailable).getText(); }

}

