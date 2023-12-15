package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	public static WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step: Browser is open");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("http://empirehome.myprojectsonline.co.in/");
		System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside step: user enters username and password");
	}

	@And("user clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step: user clicks on login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println("Inside step: user is navigated to te homepage");
	}

}
