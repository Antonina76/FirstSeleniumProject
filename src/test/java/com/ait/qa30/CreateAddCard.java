package com.ait.qa30;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAddCard extends TestBase {

    @BeforeMethod
    public void precondition(){
        click(By.cssSelector("[href='/login'] "));
        type(By.name("Email"), "test4@com.de");
        type(By.name("Password"),"Manuel12345$");
        click(By.cssSelector("[class='button-1 login-button'] "));

    }
    @Test
    public void addNewCardTest(){
        click(By.cssSelector("[src='https://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png'] "));
        click(By.cssSelector(" [value='Add to cart']"));
       Assert.assertTrue(isElementPresent(By.cssSelector("[alt='Picture of 14.1-inch Laptop'] ")));

    }
}
