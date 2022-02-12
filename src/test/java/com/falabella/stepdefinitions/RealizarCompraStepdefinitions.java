package com.falabella.stepdefinitions;

import com.falabella.drivers.Driver;
import com.falabella.models.DatosCompra;
import com.falabella.questions.PuedePagar;
import com.falabella.task.AdicionaItem;
import com.falabella.task.FinalizarCompra;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RealizarCompraStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("the {actor} enters the falabella virtual store")
    public void theUserEntersTheFalabellaVirtualStore(Actor actor) {
        actor.whoCan(BrowseTheWeb.with(Driver.chrome()));

    }

    @When("the user add an iphone11 128GB to cart")
    public void theUserAddAnIphone11128GBToCart() {
       OnStage.theActorInTheSpotlight().attemptsTo(AdicionaItem.compra());

    }
    @When("the user enter the shipping information")
    public void theUserEnterTheShippingInformation(List<DatosCompra> datosCompras) {
        OnStage.theActorInTheSpotlight().attemptsTo((FinalizarCompra.finalizarCompra(datosCompras.get(0))));


    }
    @Then("the user can pay for the added product and see {string}")
    public void theUserCanPayForTheAddedProduct(String string) {
        OnStage.theActorInTheSpotlight().should(seeThat(PuedePagar.puedePagar(string)));

    }

}
