package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AbiBus_Sreach {

	WebDriver driver;
	
	
	@Given("User is on AbiBus Homepage")
	public void user_is_on_AbiBus_Homepage() {
	    
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VINOTH KUMAR\\eclipse-workspace\\Cucumber4\\Driver\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.get("https://www.abhibus.com/");
	
	}

	@When("User enter the vaild sreach details")
	public void user_enter_the_vaild_sreach_details(DataTable place) throws InterruptedException {
	   List<String> User_GivenPlace = place.asList(String.class);
	   
		driver.findElement(By.id("source")).sendKeys(User_GivenPlace.get(0));
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.id("destination")).sendKeys(User_GivenPlace.get(1));
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[5]/a")).click();
		Thread.sleep(2000);
		
		
	}

	@Then("User get the availabilities of bus")
	public void user_get_the_availabilities_of_bus() {
		driver.findElement(By.xpath("//div//a[@class='btnab icosearch']")).click();
		
	}
	
	
	
}
