package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import pages.NavBarPage;

public class BaseTests {
    private WebDriver driver;
    protected NavBarPage navBarPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        navBarPage = new NavBarPage(driver);
    }

    @DataProvider(name = "ValidRegistrationTestData")
    public static Object[][] ValidData ()
    {
        return new Object[][]{
                {"Mohamed","Waleed","9","1","2001","mohamedwaleed9@gmail.com","Willly","123456","123456"}
        };
    }
    @DataProvider(name = "inValidRegistrationFnameTestData")
    public static Object[][] inValidFnameData ()
    {
        return new Object[][]{
                {"","Waleed","9","1","2001","mohamedwaleed56@gmail.com","Willly","123456","123456"}
        };
    }
    @DataProvider(name = "inValidRegistrationLnameTestData")
    public static Object[][] inValidLnameData ()
    {
        return new Object[][]{
                {"Mohamed","","9","1","2001","mohamedwaleed56@gmail.com","Willly","123456","123456"}
        };
    }
    @DataProvider(name = "inValidRegistrationPassTestData")
    public static Object[][] inValidPassData ()
    {
        return new Object[][]{
                {"Mohamed","Waleed","9","1","2001","mohamedwaleed56@gmail.com","Willly","12","123456"}
        };
    }
    @DataProvider(name = "inValidRegistrationConfPassTestData")
    public static Object[][] inValidConfPassData ()
    {
        return new Object[][]{
                {"Mohamed","Waleed","9","1","2001","mohamedwaleed56@gmail.com","Willly","123456","654321"}
        };
    }

    @AfterClass
    public void Quit() { driver.quit(); }
}
