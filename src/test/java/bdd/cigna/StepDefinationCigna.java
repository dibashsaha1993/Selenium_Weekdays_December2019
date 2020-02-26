package bdd.cigna;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StepDefinationCigna {

    WebDriver driver;
    @Given("^to load application url$")
    public void to_load_application_url() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/Selenium_BootCamp_December2019/DriverDirectory/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://www.cigna.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^i click on logo$")
    public void i_click_on_logo() throws Throwable {
        driver.findElement(By.xpath("//div[@class='container']//*[@class='d-inline-block align-top']")).click();
    }

    @Then("^validate current url \"([^\"]*)\"$")
    public void the_page_loads(String url) throws Throwable {
String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,url);
    }

    @Then("^i close the browser$")
    public void i_validate_logo() throws Throwable {
driver.quit();

    }

    @When("^i click on international$")
    public void i_click_on_international() throws Throwable {
        driver.findElement(By.xpath("")).click();
    }


}
