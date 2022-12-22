package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(css = "#loginusername")
    public WebElement userName_loc;

    @FindBy(css = "#loginpassword")
    public WebElement password_loc;

    @FindBy(css = "button[onclick='logIn()']")
    public WebElement loginBttn_loc;

    public void login_mtd() {
        String userName = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        loginHomePage_loc.click();
        userName_loc.sendKeys(userName);
        password_loc.sendKeys(password);
        loginBttn_loc.click();
        BrowserUtils.waitFor(2);
    }

    public void login_mtd(String username, String password) {
        loginHomePage_loc.click();
        userName_loc.sendKeys(username);
        password_loc.sendKeys(password);
        loginBttn_loc.click();
        BrowserUtils.waitFor(2);
    }

    public void verifyNegativePopUpMessage(String expectedMessage) {
        Alert alert = Driver.get().switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals("Message does not match", expectedMessage, actualMessage);


    }
}
