package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Day2 {
	@BeforeTest
	public void ploan() {
		System.out.println("hii are u avaliable");

	}

	@BeforeMethod
	public void prerequiste() {
		System.out.println("Iambeforemethodo");

	}
}
