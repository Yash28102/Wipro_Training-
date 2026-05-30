package Web_Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DemoQAForm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Yash Garg");
		
		WebElement email=driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("yg13042@gmail.com");
		
		WebElement mobile=driver.findElement(By.id("phone"));
		mobile.click();
		mobile.sendKeys("7668737395");
		
		WebElement add=driver.findElement(By.id("textarea"));
		add.click();
		add.sendKeys("Meerut");
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.id("saturday")).click();
		
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[10]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"colors\"]/option[6]")).click();
	
		WebElement a=driver.findElement(By.id("animals"));
		Select sel=new Select(a); 
		sel.selectByValue("lion");
		
		WebElement dp1=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		dp1.click();
		dp1.sendKeys("03/27/2025");
		dp1.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("txtDate")).click();
		 WebElement yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		 WebElement mt=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));

		
			yr.click();
			Select sel1=new Select(yr);
			sel1.selectByValue("2026");
			Select sel2=new Select(mt);
			sel2.selectByIndex(5);
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a")).click();
		 
		
//			
//			driver.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
//			WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
//			Select yselect = new Select(year);
//			yselect.selectByValue("2020");
//			WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
//			Select mselect = new Select(month);
//			mselect.selectByIndex(9);
//			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();
			
			driver.findElement(By.className("date-picker-box")).click();
			
			WebElement dp3 = driver.findElement(By.id("start-date"));
			dp3.clear();
			dp3.sendKeys("2026-04-22");
			
			WebElement dp4=driver.findElement(By.id("end-date"));
			dp4.clear();
			dp4.sendKeys("17-06-2026");
			
			driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();
			
			
			
		
	}

}
