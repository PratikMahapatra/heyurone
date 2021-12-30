package intro;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class Gmail {
	public static void main (String[]args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
    	d.get("https://www.google.com/intl/en-GB/gmail/about/#");
    	d.findElement(By.xpath("/html/body/footer/div/div/ul/li[3]/a")).click();
    	System.out.println(d.getTitle());
    
    	Set<String>ids=d.getWindowHandles();
    	Iterator <String> it=ids.iterator();
    	String parantid=it.next();
    	
    -	
    	
    	
	}

}
