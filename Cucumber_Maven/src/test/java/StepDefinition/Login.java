package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	
	WebDriver driver;
	
	@Before
	public void bt() {
		
		//Open  driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rick\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	
	@After
	public void at() {
		driver.close();
	}

	@Given("I am able to navigate to Login page")
	public void i_am_able_to_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("http://opensource-demo.orangehrmlive.com/");
	
	    
	}

	@When("I update username as {string}")
	public void i_update_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	    
	}

	@When("I update password as {string}")
	public void i_update_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	    
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String expected) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(6000);
	    
	    String actual = driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(expected, actual);
	    
	}
	

	@Then("I should see the mesage {string}")
	public void i_should_see_the_mesage(String expected) {
	    // Write code here that turns the phrase above into concrete actions
		String actual = driver.findElement(By.id("spanMessage")).getText();
	    Assert.assertEquals(expected, actual);
	}

	
}
