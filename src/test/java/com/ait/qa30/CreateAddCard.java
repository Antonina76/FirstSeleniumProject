package com.ait.qa30;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAddCard extends TestBase {

    @BeforeMethod
    public void precondition(){
        if(!isLoginButtonPresent()){
            clickOnLogoutButton();
        }
        clickOnLoginButton();
        fillLoginForm("test5@com.de", "Manuel123456$");
        clickLogIn();
    }

    @Test
    public void addNewCardTest(){
        clickOnCard();
        addCard();
        createCard();
   Assert.assertTrue(isCardCreated());
    }
}
