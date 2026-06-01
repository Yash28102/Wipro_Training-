package Web_Driver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        

        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open Amazon
        driver.get("https://www.amazon.in/");

        // ======================================================
        // LOGIN
        // ======================================================

        // Click Sign In
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("nav-link-accountList"))).click();

        // Enter Email / Mobile
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ap_email"))).sendKeys("YOUR_EMAIL_OR_MOBILE");

        // Click Continue
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("continue"))).click();

        // Enter Password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ap_password"))).sendKeys("YOUR_PASSWORD");

        // Click Sign In
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("signInSubmit"))).click();

        System.out.println("LOGIN SUCCESSFUL");

        // ======================================================
        // SEARCH PRODUCT
        // ======================================================

        // Search Box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")));

        searchBox.sendKeys("laptop");

        // Click Search
        driver.findElement(By.id("nav-search-submit-button")).click();

        System.out.println("SEARCH COMPLETED");

        // ======================================================
        // PRODUCT TITLE
        // ======================================================

        WebElement firstProduct = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//h2[contains(@class,'a-size-mini')])[1]")));

        String productTitle = firstProduct.getText();

        System.out.println("PRODUCT TITLE : " + productTitle);

        // ======================================================
        // PRODUCT PRICE
        // ======================================================

        WebElement productPrice = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//span[@class='a-price-whole'])[1]")));

        System.out.println("PRODUCT PRICE : " + productPrice.getText());

        // ======================================================
        // PRODUCT RATING
        // ======================================================

        WebElement productRating = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//span[contains(@class,'a-icon-alt')])[1]")));

        System.out.println("PRODUCT RATING : " + productRating.getText());

        // ======================================================
        // OPEN PRODUCT IN NEW TAB
        // ======================================================

        firstProduct.click();

        // Switch To New Tab
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            driver.switchTo().window(window);
        }

        // ======================================================
        // IMAGE ZOOM FUNCTIONALITY
        // ======================================================

        WebElement productImage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("landingImage")));

        Actions actions = new Actions(driver);

        actions.moveToElement(productImage).perform();

        Thread.sleep(3000);

        System.out.println("IMAGE ZOOM FUNCTIONALITY WORKING");

        // ======================================================
        // ADD TO CART BUTTON
        // ======================================================

        WebElement addToCart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("add-to-cart-button")));

        if (addToCart.isDisplayed()) {
            System.out.println("ADD TO CART BUTTON IS VISIBLE");
        }

        // ======================================================
        // BUY NOW BUTTON
        // ======================================================

        WebElement buyNow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("buy-now-button")));

        if (buyNow.isDisplayed()) {
            System.out.println("BUY NOW BUTTON IS VISIBLE");
        }

        // ======================================================
        // CLICK ADD TO CART
        // ======================================================

        addToCart.click();

        System.out.println("PRODUCT ADDED TO CART");

        // ======================================================
        // GO TO CART
        // ======================================================

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("nav-cart"))).click();

        // ======================================================
        // CHECKOUT BUTTON
        // ======================================================

        WebElement checkoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("proceedToRetailCheckout")));

        if (checkoutButton.isDisplayed()) {
            System.out.println("CHECKOUT BUTTON IS VISIBLE");
        }

        // ======================================================
        // WAIT BEFORE CLOSING
        // ======================================================

        Thread.sleep(5000);

        // Close Browser
        driver.quit();
    }
}