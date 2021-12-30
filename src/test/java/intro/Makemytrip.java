package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main (String []args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
    	
    	d.manage().window().maximize();
    	d.get("http://www.tizag.com/javascriptT/javascriptalert.php");
    	d.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
    	//Thread.sleep(5000);
    System.out.println(	d.switchTo().alert().getText());
    	d.switchTo().alert().accept();
	}

}