Feature: The user should be able to place order from the website

  Background: Go to the homepage login
    Given The user is on the login page
@wip  
    Scenario: Placing a succesfull order
      When The user enters "suheda" and "s1234" and click login button
      And The user adds "Samsung galaxy s7" to cart from "Phones"
      And The user adds "Sony vaio i5" to cart from "Laptops"
      And The user adds "MacBook air" to cart from "Laptops"
      And The user adds "Apple monitor 24" to cart from "Monitors"
      And The user removes "Sony vaio i5" from cart
      And The user places order and capture and log amount
      Then The user verifies purchase amount equals 1900