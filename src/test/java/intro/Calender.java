package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.path2usa.com/travel-companions");
		d.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();

		List<WebElement> dates = d.findElements(By.className("day"));
		int count = d.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String text = d.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				d.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
