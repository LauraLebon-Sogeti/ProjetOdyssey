package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericPage {

	protected static WebDriver driver;
	private static final String urlSite = "http://demowebshop.tricentis.com/";
	
	public WebDriver OuvrirNavigateur(String nomDriver){
		if (nomDriver == "chrome") {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\chromedriver71.exe");
			
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public void ChargerPageAccueil() {
		driver.get(urlSite);
	}
	
	public void FermerNavigateur() {
		driver.quit();
	}
	
	@BeforeMethod
	public void SetupTest() {
	    System.out.println("------------------------------");
	    System.out.println("Début du test - " );
	    System.out.println("------------------------------");
	}
	
	@AfterMethod
	public void TeardownTest() {
		if (driver != null) {
			FermerNavigateur();
		}
	    System.out.println("------------------------------");
	    System.out.println("Fin du test - " );
	    System.out.println("------------------------------");
	}
}
