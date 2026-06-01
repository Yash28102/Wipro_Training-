package Web_Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// steps: 1. paste url in the default.
		//		  2. verify after click on selenium logo this will redirect to home page.
		
		
		// setup browser
		//System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\chromedriver-win64\\chromedriver-win64");
		
		// create webdriver
		WebDriver driver= new ChromeDriver();
		
		//navigate to url
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.findElement(By.id("Layer_1")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
