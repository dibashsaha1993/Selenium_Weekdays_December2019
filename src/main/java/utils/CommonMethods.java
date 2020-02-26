package utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jQuary.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CommonMethods {
	
	public WebDriver driver;
	
	public HomePage homePageObj;
	public DemoPage demoPageObj;
	public DevelopmentPage developmentPageObj;
	public BlogsPage blogsPageObj;
	public DocumentPage documentPageObj;
	public DownloadPage downloadPageObj;
	public SupportPage supportPageObj;
	public ThemesPage themesPageObj;
	public CookbookPage cookbookPageObj;
	public JqueryNavPage jqueryNavPagePageObj;
	public ContributePage contributePageObj;


	public static ExtentTest test;
	public static ExtentReports report;

	@Parameters({"browser","url"})
	@BeforeClass
	public void setup(String brws,String url){


		report = new ExtentReports("/Users/dibashsaha/Desktop/Selenium_BootCamp_December2019/ExtentReportResults.html");
		test = report.startTest("ExtentDemo");

		if(brws.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/Selenium_BootCamp_December2019/DriverDirectory/chromedriver");
			driver=new ChromeDriver();
		}else{
			//System.setProperty("webdriver.gecko.driver", "/Users/dibashsaha/geckodriver");
			driver=new FirefoxDriver();
		}

		driver.get(url);
		
		homePageObj = new HomePage(driver);
		demoPageObj = new DemoPage(driver);
		developmentPageObj = new DevelopmentPage(driver);
		cookbookPageObj = new CookbookPage(driver);
		blogsPageObj = new BlogsPage(driver);
		documentPageObj = new DocumentPage(driver);
		downloadPageObj = new DownloadPage(driver);
		supportPageObj = new SupportPage(driver);
		themesPageObj = new ThemesPage(driver);
		jqueryNavPagePageObj = new JqueryNavPage(driver);
		contributePageObj = new ContributePage(driver);
		
		
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown(){
		driver.quit();

		report.endTest(test);
		report.flush();

	}

}
