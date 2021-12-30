package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(d.findElements(By.tagName("a")).size());
		d.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
		WebElement foot = d.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
		System.out.println(foot.findElements(By.tagName("a")).size());
		WebElement foot1 = foot.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(foot1.findElements(By.tagName("a")).size());

		for (int i = 1; i < foot1.findElements(By.tagName("a")).size(); i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			foot1.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		Set<String> a = d.getWindowHandles();
		Iterator<String> it = a.iterator();

		while (it.hasNext()) {
			d.switchTo().window(it.next());
			System.out.println(d.getTitle());
		}

	}

}
