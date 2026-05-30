package Web_Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.InterruptedIOException;
import java.time.Duration;

public class Filter_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")));

        search.click();
        search.clear();
        search.sendKeys("sneakers");
        search.sendKeys(Keys.ENTER);
		
       // driver.findElement(By.xpath("//*[@id=\"filter-\"]/span/span[1]/li/span/a")).click();
      
        WebElement psi = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id='filter-']/span/span[1]/li/span/a")
                )
        );

        psi.click();
        
        
//        WebElement brands = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.id("brandsRefinements")));
//        
        //driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]/div[2]")).click();
        //filter for brands
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_123/256097\"]/span/a/div"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_123/495128\"]/span/a/div"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_123/390827\"]/span/a/div"))).click();
        Thread.sleep(1500);
        // price filter
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_123/256097\"]/span/a/div"))).click();
        
        //size filter
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_n_g-1004152217091/2022655031\"]"))).click();      
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"p_n_pct-off-with-tax/2665399031\"]/span/a/span"))).click();

     
        Thread.sleep(15000);
		driver.quit();
		
		

	}

}
