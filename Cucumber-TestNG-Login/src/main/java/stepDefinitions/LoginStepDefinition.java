package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{

	 WebDriver driver;

	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/index.php");
	 }
	
	
	 @When("^title of login page is Tours$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Welcome: Mercury Tours", title);
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("userName")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
		 driver.findElement(By.name("login")).click();
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 //String title = driver.getTitle();
		 String validation=driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).getText();
	 System.out.println("Home Page title ::"+ validation);
	 Assert.assertEquals("SIGN-OFF", validation);
	 }
	 
	 

	
	

}
