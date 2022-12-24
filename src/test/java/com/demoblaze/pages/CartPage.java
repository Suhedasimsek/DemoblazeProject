package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public void removeProduct_mtd(String product){
        cart_loc.click();
        BrowserUtils.waitForClickablility(cart_loc,3);
        WebElement deleteProduct = Driver.get().findElement(By.xpath("//td[.='"+product+"']/..//a[text()='Delete']"));
        BrowserUtils.waitForClickablility(deleteProduct,3);
        deleteProduct.click();
        BrowserUtils.waitFor(2);
    }
}
