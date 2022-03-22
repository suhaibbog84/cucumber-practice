package com.cydeo.step_definitions;

import com.cydeo.page.BasePage;
import com.cydeo.page.OrderPage;
import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        //Getting the page using the URL from config properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

        //calling our login method
        webTableLoginPage.login();

        //clicking on "order" link to go to order page
        basePage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }
   // @When("user enters quantity {string}")
    //public void user_enters_quantity(String string) {
//
    //}
    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String inputZip) {

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {

        List<WebElement> cardType = orderPage.cardType;
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
        //accepting int argument and sending it using sendKeys() method
        //Since SendKeys accepts only String we need the following
        //orderPage.inputQuantity.sendKeys(arg0 + "");

        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        orderPage.inputQuantity.sendKeys(String.valueOf(arg0));
    }
}
