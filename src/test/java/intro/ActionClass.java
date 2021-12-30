package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
    	d.get("https://www.amazon.in");
    	Actions a=new Actions(d);
    	WebElement move=d.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
    	
    	a.moveToElement(d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    	a.moveToElement(move).contextClick().build().perform();
    
    	
	}
	

}
