package mouseHover.sprint.test;



import jQuary.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.CommonMethods;


public class SprintHomepageTest extends CommonMethods {

   // public WebDriver driver;
    public Actions ac;

   /* @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/LearnSetupMaven/DriverHere/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://sprint.com/");
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
*/
    @Test(priority = 1)
    public void ValidateActionInplansLink() throws InterruptedException {
         ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Plans"))).build().perform();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.sprint.com/");
        Thread.sleep(4000);
    }
    @Test(priority = 2)
    public void ValidateActionInDevicesLink() throws InterruptedException {
         ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Devices"))).build().perform();
        Thread.sleep(2000);
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.sprint.com/");
    }
    @Test(priority = 3)
    public void ValidateActionInSupportLink() throws InterruptedException {
        ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Support"))).build().perform();
        Thread.sleep(2000);
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.sprint.com/");
    }
    @Test(priority = 4)
    public void DeviceMouseHoverMode() throws InterruptedException {
        ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Devices"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/div/div/ul[1]/li[2]/div/ul/li[2]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"data-device-type-indicator\"]/li[1]/div/div[2]/a/div/div"))).build().perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"data-device-type-indicator\"]/li[2]/div/div[3]/div[2]/a"))).build().perform();
        ac.moveToElement(driver.findElement(By.xpath("//body[@class='has__short-header has__sticky-desktop-nav has__sticky-mobile-nav vanilla-modal']/div[@class='sprint-app']/main[@id='main']/div[@class='devicetilewall']/div[@class='bgc--ash-light']/div[@class='container-xl pt-5 devicetilewall__wall devicetilewall__wall--visible']/ul[@id='data-device-type-indicator']/li[3]/div[1]/div[2]/a[1]/div[1]/div[1]"))).build().perform();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.sprint.com/en/shop/tablets.html?flow=AAL&INTNAV=TopNav:Shop:Tablets&credit=undefined&sort=FEATURED");
    }
    @Test(priority = 5)
    public void SignIn() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[7]/div[4]/div/div[2]/a/p")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='loginHeaderUsername']")).sendKeys("ds25.com");
        driver.findElement(By.xpath("//input[@id='loginHeaderPassword']")).sendKeys("ddfsdfs");
        driver.findElement(By.xpath("//*[@id=\"loginHeaderButton\"]")).click();
    }
}


