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

public class DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.click();
		// for giving input
		fname.sendKeys("yash");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.click();
		
		lname.sendKeys("garg");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("yg13042@gmail.com");
		
		
		driver.findElement(By.id("gender-radio-1")).click();	
		
		WebElement mobile=driver.findElement(By.id("userNumber"));
		mobile.click();
		mobile.sendKeys("7668737395");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement yr=driver.findElement(By.className("react-datepicker__year-select"));
		WebElement mt=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));

		// xpath syntax=//node[@attribute="attribute value"]
		yr.click();
		Select sel=new Select(yr);
		sel.selectByIndex(103);
		Select sel1=new Select(mt);
		//sel1.selectByValue("9");
		sel1.selectByVisibleText("October");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[5]/div[3]")).click();
		
		
		
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		sub.click();
		sub.sendKeys("English");
		sub.sendKeys(Keys.ENTER);
		//sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys("com");
		//sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("com");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		//sub.sendKeys(Keys.BACK_SPACE);
		WebElement cb1=driver.findElement(By.id("hobbies-checkbox-1"));
		cb1.click();
//		WebElement cb2=driver.findElement(By.id("hobbies-checkbox-2"));
//		cb2.click();
		WebElement cb3=driver.findElement(By.id("hobbies-checkbox-3"));
		cb3.click();
		Thread.sleep(2000);
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("D:\\Pictures\\insta post\\file_00000000bff87207abaaa4fb93d6acf9.png");		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)" );
		
		
		WebElement add=driver.findElement(By.id("currentAddress"));
		add.click();
		add.sendKeys("Meerut");

		WebElement state=driver.findElement(By.id("react-select-3-input"));
		state.click();
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ENTER);
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.click();
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ENTER);
		//js.executeScript("window.scrollBy(0,-900)" );
		driver.findElement(By.id("submit")).click();
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File sc=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("DemoQAform.png");
		FileHandler.copy(sc, dest);
		Thread.sleep(5000);
		
		driver.quit();//terminate all the windows.


	}

}
