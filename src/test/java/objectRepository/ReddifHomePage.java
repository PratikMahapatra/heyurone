package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomePage {
	WebDriver driver;

	public ReddifHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

      By search=By.id("srchword");
      By Go=By.xpath("//*[@id=\"queryTop\"]/input");
      
      public WebElement Search() {
    	  return driver.findElement(search);
      }
      
      public WebElement Submit() {
  		return driver.findElement(Go);
  	}
}
