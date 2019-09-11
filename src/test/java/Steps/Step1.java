package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	WebDriver driver;
	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1){
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1){
		driver.findElement(By.id("pass")).sendKeys(arg1);
	}

	@Then("^Login should fail$")
	public void login_should_fail(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook - Connexion ou inscription", title);
	}
}