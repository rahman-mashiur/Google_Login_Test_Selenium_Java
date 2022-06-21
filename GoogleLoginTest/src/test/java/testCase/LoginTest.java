package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LandingPage;
import pages.PasswordPage;

public class LoginTest {
	
	static WebDriver driver = null;
	
	public static void login() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		LandingPage lnd_page = new LandingPage(driver);
		PasswordPage pp = new PasswordPage(driver);
		
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lnd_page.enter_email_phone("email id");
		lnd_page.click_next_btn();
		pp.enter_password("password");
		pp.click_show_pass();
		pp.click_next_btn();
		
		driver.close();
	}

	public static void main(String[] args) {
		
		login();
	}

}
