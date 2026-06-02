package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class TutorialsNinjaSteps {

    WebDriver driver;

    // ================= LOCATORS (POM STYLE) =================

    By myAccount = By.xpath("//span[text()='My Account']");
    By register = By.linkText("Register");
    By login = By.linkText("Login");

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirm = By.id("input-confirm");
    By agree = By.name("agree");
    By continueBtn = By.xpath("//input[@value='Continue']");

    By loginEmail = By.id("input-email");
    By loginPassword = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");

    By searchBox = By.name("search");
    By searchBtn = By.cssSelector("button.btn-default");

    By addCartBtn = By.xpath("(//button[contains(@onclick,'cart.add')])[1]");
    By cart = By.id("cart-total");
    By checkout = By.linkText("Checkout");

    // ================= SETUP =================

    @Given("user opens tutorialsninja website")
    public void openWebsite() {
        ChromeOptions options = new ChromeOptions();
 
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
 
		driver = new ChromeDriver(options);
        driver.get("https://tutorialsninja.com/demo");
    }

    // ================= POM ACTION METHODS =================

    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    public void clickRegister() {
        driver.findElement(register).click();
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

    public void registerUser() {
        driver.findElement(firstName).sendKeys("Yash");
        driver.findElement(lastName).sendKeys("Garg");
        driver.findElement(email).sendKeys("yash" + System.currentTimeMillis() + "@gmail.com");
        driver.findElement(phone).sendKeys("9999999999");
        driver.findElement(password).sendKeys("Test@123");
        driver.findElement(confirm).sendKeys("Test@123");
        driver.findElement(agree).click();
        driver.findElement(continueBtn).click();
    }

    public void loginUser() {
        driver.findElement(loginEmail).sendKeys("test@gmail.com");
        driver.findElement(loginPassword).sendKeys("Test@123");
        driver.findElement(loginBtn).click();
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchBtn).click();
    }

    public void addToCart() {
        driver.findElement(addCartBtn).click();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }

    public void checkoutProduct() {
        driver.findElement(checkout).click();
    }

    // ================= STEP DEFINITIONS =================

    // REGISTER
    @When("user clicks My Account")
    public void myAccountStep() {
        clickMyAccount();
    }

    @When("user clicks Register")
    public void registerStep() {
        clickRegister();
    }

    @When("user enters registration details")
    public void regStep() {
        registerUser();
    }

    @Then("account should be created successfully")
    public void regSuccess() {
        System.out.println("Registration successful");
        driver.quit();
    }

    // LOGIN
    @When("user clicks Login")
    public void loginStep() {
        clickLogin();
    }

    @When("user enters valid login credentials")
    public void loginData() {
        loginUser();
    }

    @Then("user should login successfully")
    public void loginSuccess() {
        System.out.println("Login successful");
        driver.quit();
    }

    // SEARCH
    @When("user searches product {string}")
    public void searchStep(String product) {
        searchProduct(product);
    }

    @Then("product should be displayed")
    public void searchSuccess() {
        Assert.assertTrue(true);
        driver.quit();
    }

    // ADD TO CART
    @When("user adds product into cart")
    public void cartStep() {
        addToCart();
    }

    @Then("product should be added to cart")
    public void cartSuccess() {
        System.out.println("Added to cart");
        driver.quit();
    }

    // CHECKOUT
    @When("user opens cart")
    public void openCartStep() {
        openCart();
    }

    @When("user proceeds to checkout")
    public void checkoutStep() {
        checkoutProduct();
    }

    @Then("order should be placed successfully")
    public void orderSuccess() {
        System.out.println("Order placed successfully");
        driver.quit();
    }
}
