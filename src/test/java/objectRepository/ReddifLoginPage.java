package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLoginPage {
	WebDriver driver;

	public ReddifLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By username = By.xpath("//*[@id=\"login1\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By go = By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	By home=By.linkText("rediff.com");

	public WebElement EmailID() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Submit() {
		return driver.findElement(go);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
}
