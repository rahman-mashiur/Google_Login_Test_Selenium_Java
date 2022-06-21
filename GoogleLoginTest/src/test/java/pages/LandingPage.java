package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver = null;
	
	By email_phone = By.id("identifierId");
	By next_btn = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enter_email_phone(String emailPhone) {
		driver.findElement(email_phone).sendKeys(emailPhone);
	}
	public void click_next_btn() {
		driver.findElement(next_btn).click();
	}

}
