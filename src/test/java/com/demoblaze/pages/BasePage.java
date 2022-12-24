package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){

        PageFactory.initElements(Driver.get(), this);
    }

    public String getTitle(String title){

        return Driver.get().findElement(By.xpath(" //span[.='"+title+"']")).getText();
    }

    @FindBy(css = "#login2")
    public WebElement loginHomePage_loc;

    @FindBy(xpath = "//a[text()='Home ']")
    public WebElement home_loc;

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart_loc;
}

