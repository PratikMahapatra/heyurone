package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void  WebLogin(){
	//Selenium
		System.out.println("WebLogin");
	}
	
	@Test(dataProvider="getData")
	
	public void MobileCarLoginLoan(String username,String password) {
	//Appium	
		System.out.println("MobileLogin");
		System.out.println(username);
		System.out.println(password);
		
		
	}
	@AfterSuite
	public void MobileCarLogin() {
		//Appium	
			System.out.println("I am Last ");
		}
	@BeforeSuite
	public void LoginAPIcarLoan() {
		//Rest API Automation 
		System.out.println("MY name is pratik");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data [0][0]="firstsetusername";
		data[0][1]="password";
		data [1][0]="secondsetusername";
		data[1][1]="spassword";
		data [2][0]="thirdsetusername";
		data[2][1]="tpassword";
		return data;
	}
	
	

}
