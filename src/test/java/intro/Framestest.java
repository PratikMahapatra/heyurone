package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Framestest {
	
	public static void main(String[]args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://jqueryui.com/droppable/");
       System.out.println(  d.findElement(By.tagName("iframe")));
        d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
        d.findElement(By.id("draggable")).click();

        Actions a=new Actions(d);
        WebElement Source=d.findElement(By.id("draggable"));
        WebElement destionation=d.findElement(By.id("droppable"));
        
        a.dragAndDrop(Source, destionation).build().perform();
        d.switchTo().defaultContent();
        
	}
	

}
