package intro;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class MoneyControl {

		public static void main(String[] args) {
			
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik\\Desktop\\selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			
			driver.get("https://www.moneycontrol.com/");
                    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions A = new Actions(driver);
			
			A.moveToElement(driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div[3]/nav/div/ul/li[8]/a"))).build().perform();
			
			driver.get("https://www.moneycontrol.com/personal-finance/tools/");
			driver.findElement(By.xpath("/html/body/div[13]/section/div/div/div[1]/div/div/ul/li[7]/a/div/div[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\'carhome_loan\']")).clear();

			driver.findElement(By.xpath("//*[@id=\'carhome_loan\']")).sendKeys("3000000");
			
			driver.findElement(By.id("loan_period")).clear();
			
			driver.findElement(By.id("loan_period")).sendKeys("20");
			
			Select emi = new Select(driver.findElement(By.id("emi_start_from")));
			
			emi.selectByValue("0");
			
			driver.findElement(By.id("interest_rate")).clear();
			
			driver.findElement(By.id("interest_rate")).sendKeys("10.5");
			
			
			driver.findElement(By.id("upfront_charges")).clear();
			driver.findElement(By.id("upfront_charges")).sendKeys("10000");
			
			WebElement submitButton = driver.findElement(By.xpath("/html/body/div[13]/section[1]/div/div/div[1]/div[1]/div/div[2]/div/div[5]/a[1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", submitButton);
			
			
			System.out.println(driver.findElement(By.id("total_payment")).getText());
			System.out.println(driver.findElement(By.id("interest_charges")).getText());
			
			
			
			String Text2 = driver.findElement(By.xpath("//*[@id=\'emi_table\']/tbody/tr[7]/td[3]")).getText(); 	
			        System.out.println(" EMI Payment in the 7 year - "+Text2);  
			        
		   String Text = driver.findElement(By.xpath("//*[@id=\'emi_table\']/tbody/tr[7]/td[4]")).getText(); 	
			        System.out.println(" Interest After 7 year - "+ Text);
			        
	       String Text3 = driver.findElement(By.xpath("//*[@id=\'emi_table\']/tbody/tr[7]/td[5]")).getText(); 	
			        System.out.println(" Principal After 7 year - "+ Text3);  
		  String Text4 = driver.findElement(By.xpath("//*[@id=\'emi_table\']/tbody/tr[5]/td[2]")).getText(); 	
			        System.out.println(" Principal Outstanding After 5 year - "+ Text4);  
			        
}
		
}
