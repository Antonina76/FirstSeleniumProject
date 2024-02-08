package com.ait.qa30;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if(!isRegisterLinkPresent()){
            clickOnLogoutButton();
        }
    }

    @Test
    public void createNewAccountTest(){
        clickOnRegisterButton();
        clickOnGenderButton();
        fillingRegisterForm("Emill1", "Testmann4", "test8@com.de", "Manuel1234567$", "Manuel1234567$");
        clickOnRegister();
        Assert.assertTrue(isLogOutButtonPresent());
    }
}
