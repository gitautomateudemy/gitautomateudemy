package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001 {

	
	@Test
	public void setup(){
		
		System.setProperty("webDriver.chrome.Driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.quit();
	}
}
