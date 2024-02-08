package com.ait.qa30;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class TestBase {

     WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }


    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            return true;
        }
    }
    public void pause (int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isRegisterLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }

    public void clickOnLogoutButton() {
        click(By.cssSelector("[href='/logout']"));
    }

    protected void clickOnRegister() {
        driver.findElement(By.name("register-button")).click();
    }

    protected void fillingRegisterForm(String FirstName, String LastName, String email, String password, String confirmPassword) {
        type(By.name("FirstName" ), FirstName);
        type(By.name( "LastName"), LastName);
        type(By.xpath("//input[@id='Email'] "), email);
       type(By.xpath("//input[@id='Password'] "), password);
      type(By.xpath("//input[@id='ConfirmPassword'] "), confirmPassword);
    }

    protected void clickOnGenderButton() {
        driver.findElement(By.cssSelector(" [for='gender-male']")).click();
    }

    public void clickOnRegisterButton() {
        driver.findElement(By.cssSelector("[href='/register']")).click();
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }

    public void clickLogIn() {
        click(By.cssSelector("[class='button-1 login-button'] "));
    }

    public void fillLoginForm(String email, String password) {
        type(By.name("Email"), email);
        type(By.name("Password"), password);
    }

    protected void clickOnLoginButton() {
        click(By.cssSelector("[href='/login'] "));
    }

    public boolean isLoginButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public boolean isCardCreated(String text) {
         List<WebElement> contacts = driver.findElements(By.cssSelector(".product-name"));
         for (WebElement element : contacts) {
             if (element.getText().contains(text))
                 return true;
         }
         return false;


     }

    public boolean isCardCreated() {
        return isCardCreated("Build your own cheap computer");
    }

    public void clickOnCard() {
        click(By.cssSelector(".item-box:nth-child(4)"));
    }

    public void addCard() {
        click(By.cssSelector(" [value='Add to cart']"));
    }

    public void createCard() {
        click(By.cssSelector("[href='/cart'] "));
    }
}