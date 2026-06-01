package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
		driver.findElement(By.className("DocSearch-Button-Placeholder")).sendKeys("Alerts");
		
		Thread.sleep(3000);
		driver.close();
 
	}

}
