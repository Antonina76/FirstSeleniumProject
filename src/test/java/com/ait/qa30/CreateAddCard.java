package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CreateAddCard extends TestBase {

    @BeforeMethod
    public void precondition(){
        click(By.cssSelector("[href='/login'] "));
        type(By.name("Email"), "test5@com.de");
        type(By.name("Password"),"Manuel123456$");
        click(By.cssSelector("[class='button-1 login-button'] "));

    }
    @Test
    public void addNewCardTest(){

        click(By.cssSelector(".item-box:nth-child(4)"));
        click(By.cssSelector(" [value='Add to cart']"));
        click(By.cssSelector("[href='/cart'] "));
     //   pause(1000);
   Assert.assertTrue(isCardCreated("Build your own cheap computer"));

    }

   public boolean isCardCreated(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element : contacts) {
            if (element.getText().contains(text))
                return true;
        }
        return false;


    }

}
