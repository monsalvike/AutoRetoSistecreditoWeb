package com.falabella.stepdefinitions;

import com.falabella.drivers.Driver;
import com.falabella.models.ShippingInformation;
import com.falabella.task.EndPurchase;
import com.falabella.task.SearchItem;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static com.falabella.task.AddItem.addTheItem;
import static com.falabella.userinterface.PurchasePage.RESULT;


public class PurchaseStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("the {actor} enters the falabella virtual store {string}")
    public void theUserEntersTheFalabellaVirtualStore(Actor actor, String url) {
        actor.whoCan(BrowseTheWeb.with(Driver.chrome(url)));

    }

    @When("the user search an {string}")
    public void theUserSearchAn(String itemInformation) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchItem.with(itemInformation));


    }

    @When("the user add an iphone 11 128GB to cart")
    public void theUserAddAnIphone128GBToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(addTheItem());

    }

    @When("the user enter the shipping information")
    public void theUserEnterTheShippingInformation(List<ShippingInformation> shippingInformation) {
        OnStage.theActorInTheSpotlight().attemptsTo(EndPurchase.with(shippingInformation));

    }

    @Then("the user can pay for the added product and see {string}")
    public void theUserCanPayForTheAddedProduct(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(RESULT).hasText(string));

    }

}
