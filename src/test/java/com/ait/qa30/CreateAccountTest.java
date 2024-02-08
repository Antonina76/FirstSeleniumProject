package com.ait.qa30;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void createNewAccountTest(){
        //click on Register
        driver.findElement(By.cssSelector("[href='/register']")).click();
        //click on Gender
        driver.findElement(By.cssSelector(" [for='gender-male']")).click();
        //enter First name
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Emill");
        //enter Last name
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Testmann1");
        //enter Email
        driver.findElement(By.xpath("//input[@id='Email'] ")).click();
        driver.findElement(By.xpath("//input[@id='Email'] ")).clear();
        driver.findElement(By.xpath("//input[@id='Email'] ")).sendKeys("test5@com.de");
        //enter Password
        driver.findElement(By.xpath("//input[@id='Password'] ")).click();
        driver.findElement(By.xpath("//input[@id='Password'] ")).clear();
        driver.findElement(By.xpath("//input[@id='Password'] ")).sendKeys("Manuel123456$");
        //enter confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword'] ")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword'] ")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword'] ")).sendKeys("Manuel123456$");
        //click on Register
        driver.findElement(By.name("register-button")).click();
        //assert Log out button is present
        Assert.assertTrue(isElementPresent(By.cssSelector(" [href='/logout']")));

    }
}
