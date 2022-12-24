package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage extends BasePage {

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart_loc;

    @FindBy(linkText = "Phones")
    public WebElement phones_loc;

    @FindBy(linkText = "Laptops")
    public WebElement laptops_loc;

    @FindBy(linkText = "Monitors")
    public WebElement monitor_loc;

    @FindBy(linkText = "Samsung galaxy s7")
    public WebElement samsungGalaxtS7_loc;

    @FindBy(linkText = "Sony vaio i7")
    public WebElement sonyVaioi7_loc;

    @FindBy(linkText = "MacBook air")
    public WebElement macBookAir_loc;

    @FindBy(linkText = "Apple monitor 24")
    public WebElement appleMonitor24_loc;



    public WebElement find_mtd (By locator) {

        return Driver.get().findElement(locator);
    }

    public void click_mtd (By locator) {

        find_mtd (locator).click();
    }

    public void sendKeys_mtd (By locator, String text) {

        find_mtd (locator).sendKeys(text);


    }

    public void addProduct_mtd (String product, String category){
        WebElement categoryModul= Driver.get().findElement(By.xpath("//a[.='"+category+"']")); //   "//*[.='"+category+"']"
        BrowserUtils.waitForClickablility(categoryModul,5).click();

        WebElement productItem =Driver.get().findElement(By.xpath("//a[.='"+product+"']"));
        BrowserUtils.scrollToElement(productItem);
        BrowserUtils.waitForClickablility(productItem,5).click();
        BrowserUtils.waitFor(2);
        addToCart_loc.click();
        BrowserUtils.waitFor(2);
        Alert alert=Driver.get().switchTo().alert();
        alert.accept();
        BrowserUtils.waitForClickablility(home_loc,5).click();

    }
}
