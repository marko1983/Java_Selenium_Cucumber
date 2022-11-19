package com.curbio.step_definition;

import com.curbio.page.GoogleSearchPage;
import com.curbio.utilities.ConfigurationReader;
import com.curbio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class googleSearch {


    GoogleSearchPage googleSearchPage =new GoogleSearchPage();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));

    }
    @When("User types Curbio in the google search box and clicks enter")
    public void user_types_curbio_in_the_google_search_box_and_clicks_enter() {

        googleSearchPage.searchBox.sendKeys("Curbio" + Keys.ENTER);
    }
    @Then("User sees Curbio google search web page")
    public void user_sees_curbio_google_search_web_page() {

        String curbio = "Curbio® - Official Website - Remodel Now, Pay When You Sell";
        Assert.assertEquals(curbio ,googleSearchPage.CurbioWeb.getText());
    }

    @And("When user click on Curbio he should be on main page")
    public void whenUserClickOnCurbioHeShouldBeOnMainPage() {
        String title = "Curbio";
        googleSearchPage.CurbioWeb.click();
        Assert.assertEquals(title, googleSearchPage.Curbio.getText());
    }
}
