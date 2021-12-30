package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ReddifHomePage;
import objectRepository.ReddifLoginPage;

public class Loginapplication {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ReddifLoginPage rd = new ReddifLoginPage(driver);

		rd.EmailID().sendKeys("Hello");
		rd.Password().sendKeys("password");
	//	rd.Submit().click();
		rd.Home().click();
		
		ReddifHomePage rh=new ReddifHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		

	}

}
