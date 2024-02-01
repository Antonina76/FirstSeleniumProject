package com.ait.qa30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class HomeWork {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void openSeit(){
        System.out.println("Seit opened!");
    }
    @Test

    public void findElementByCss(){
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("[class='master-wrapper-page']"));
        driver.findElement(By.cssSelector("[class='ajax-loading-block-window']"));
        driver.findElement(By.cssSelector("title"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector("[class='block block-newsletter']"));
        driver.findElement(By.cssSelector("#newsletter-email"));
        driver.findElement(By.cssSelector("[value='Search store']"));
        driver.findElement(By.cssSelector("[type='submit']"));
    }

    @Test
    public void findElementByXPath(){
        driver.findElement(By.xpath("//div[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//input[@id='newsletter-email']"));
       driver.findElement(By.xpath("//div[@title='Notification']"));
        driver.findElement(By.xpath("//div[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//input[@value='Search store']"));
        driver.findElement(By.xpath("//input[@type='submit']"));
        driver.findElement(By.xpath("//div[@class='block block-newsletter']"));
        driver.findElement(By.xpath("//div[@class='ajax-loading-block-window']"));
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
    }



    //after - tearDown
    @AfterMethod()
    public void tearDown(){
        driver.quit();
    }
}