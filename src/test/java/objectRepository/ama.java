package objectRepository;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ama {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Winter Jackets");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"p_89/Allen Solly\"]/span/a/div")).click();
		System.out.println(driver.findElement(By
				.xpath("(.//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]"))
				.getText());
		System.out.println(driver.findElement(By.xpath("(.//span[@class='a-price-whole'])[1]")).getText());
		driver.findElement(By.xpath("(.//img[@class='s-image'])[1]")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		if (driver.getTitle().contains("Buy Allen Solly"))
			System.out.println("We are in product info page ");
		else
			System.out.println("We are not in product info page");

		Select s = new Select(driver.findElement(By.xpath("//*[@name='dropdown_selected_size_name']")));
		s.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		if (driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).getText().contains("Allen Solly"))
			System.out.println("Product available on cart");
		else
			System.out.println("Product not available on cart");
		Thread.sleep(10000);
		driver.quit();
	}
}