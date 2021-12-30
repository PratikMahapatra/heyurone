package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://facebook.com");
    	driver.findElement(By.name("email")).sendKeys("pratikmahapatra@gmail.com");
    	driver.findElement(By.name("pass")).sendKeys("123456");
        //driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']")).click();
    	//driver.findElement(By.name("login")).click();
   	       driver.findElement(By.linkText("Forgotten password?")).click();
    	//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Pratik");
    	//driver.findElement(By.cssSelector("#pass")).sendKeys("password");
    	//driver.findElement(By.cssSelector("#u_0_d_fG")).click();
       // driver.findElement(By.xpath("//*[@id=\"u_0_d_fG\"]")).click();
    	//driver.findElement(By.name("login")).click();
    	//driver.findElement(By.xpath("//*[@id=\"u_0_a_T1\"]/div[3]/a")).click();
    	//driver.findElement(By.cssSelector("#u_0_d_fG")).click();
    	
	}

}
