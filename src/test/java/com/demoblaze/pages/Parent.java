package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent {
   /* public Parent() {
        driver = Driver.get();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);// eleman clikable olana kadar bekle
        scrollToElement(element); // eleman kadar scroll yap
        element.click();// click yap
    }

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);// elelman görünüt olana kadar bekle
        //scrollToElement(element);// elemana kadar scroll yap
        //element.clear();// eleman clear yap
        element.sendKeys(value);// value yi gönder
    }
     public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "menuButton":
                myElement = menuButton;
                break;

            case "oscarsButton":
                myElement = oscarsButton;
                break;

            case "yearButton":
                myElement = yearButton;
                break;

            case "theCircusMovie":
                myElement = theCircusMovie;
                break;

            case "imdbLogo":
                myElement = imdbLogo;
                break;

            case "firstMovieResult":
                myElement = firstMovieResult;
                break;

            case "seeTheGallery":
                myElement = seeTheGallery;
                break;

            case "theJazzSingerMovie":
                myElement = theJazzSingerMovie;
                break;

            case "resultJazzSinger":
                myElement = resultJazzSinger;
                break;

            case "photosButton":
                myElement = photosButton;
                break;

        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "txtBox":
                myElement = txtBox;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waiting(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
}
