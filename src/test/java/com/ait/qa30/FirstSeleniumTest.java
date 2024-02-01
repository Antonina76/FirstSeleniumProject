package com.ait.qa30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
   @BeforeMethod
    public void setUp(){
      driver = new ChromeDriver();
      driver.get("https://www.google.com/");//without history
      //driver.navigate().to("url") with history
      // driver.navigate().back();
      //driver.navigate().forward();
      //driver.navigate().refresh();
    }

    //tests
    @Test
    public void openGoogle(){
        System.out.println("Seit opened!");
    }
    //after - tearDown
    @AfterMethod(enabled = false)// не будет отрабатывать
    public void tearDown(){
       driver.quit();//all tabs & close Browser
        //driver.close(); only one tab, only one => close browser
    }

}
