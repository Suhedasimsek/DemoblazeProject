package com.demoblaze.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy(id = "nameofuser")
    public WebElement welcomeUsername_loc;

    public void verifyLogin_mtd (String expectedUserName){
        String actualUserName = welcomeUsername_loc.getText();
        Assert.assertEquals("user does not match", expectedUserName,actualUserName);

    }
}
