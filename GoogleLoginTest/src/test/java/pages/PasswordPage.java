package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
	
	WebDriver driver = null;
	
	By password = By.name("password");
	By show_pass = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/input");
	By next_btn = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span");
	
	public PasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enter_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void click_show_pass() {
		driver.findElement(show_pass).click();
	}
	public void click_next_btn() {
		driver.findElement(next_btn).click();
	}

}
