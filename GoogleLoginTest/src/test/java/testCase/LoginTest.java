package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LandingPage;
import pages.PasswordPage;

public class LoginTest {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setupDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void login() {
		
		LandingPage lnd_page = new LandingPage(driver);
		PasswordPage pp = new PasswordPage(driver);
		
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lnd_page.enter_email_phone("email id");	//provide valid email address for successful login.
		lnd_page.click_next_btn();
		pp.enter_password("password");	//provide valid password for successful login.
		pp.click_show_pass();
		pp.click_next_btn();
		
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

}
