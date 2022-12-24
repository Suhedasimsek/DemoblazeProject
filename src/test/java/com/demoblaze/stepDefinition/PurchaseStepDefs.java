package com.demoblaze.stepDefinition;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.PurchasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PurchaseStepDefs {
    PurchasePage purchasePage=new PurchasePage();
    CartPage cartPage=new CartPage();

    @And("The user adds {string} to cart from {string}")
    public void theUserAdsToCartFrom(String product, String category) {
        purchasePage.addProduct_mtd(product,category);


       /* public void theUserAdsToCartFrom(By productLoc, By categoryLoc) {

       purchasePage.click_mtd(categoryLoc);
        BrowserUtils.waitFor(2);
        purchasePage.click_mtd(productLoc);*/


    }
    @When("The user removes {string} from cart")
    public void the_user_removes_from_cart(String product) {
        cartPage.removeProduct_mtd(product);

    }
    @When("The user places order and capture and log amount")
    public void the_user_places_order_and_capture_and_log_amount() {

    }
    @Then("The user verifies purchase amount equals {int}")
    public void the_user_verifies_purchase_amount_equals(Integer int1) {

    }

}
