package TestNG;

import org.testng.annotations.Test;

public class Day1 {
	@Test(enabled=true)
	public void Demo() {
		System.out.println("Hello");// automation
	}

	@Test
	public void SeconTest() {
		System.out.println("Hello World");
	}
}
