package com.falabella.stepdefinitions;

import com.falabella.models.ShippingInformation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class ParametersDefinitions {
    @ParameterType(".*")
    public Actor actor (String actorName){
    return OnStage.theActorCalled(actorName);
    }
    @DataTableType
    public ShippingInformation shippingInformation (Map<String,String> data){
        ShippingInformation shippingInformation = new ShippingInformation();
        shippingInformation.setEmail(data.get("email"));
        shippingInformation.setState(data.get("state"));
        shippingInformation.setCity(data.get("city"));
        shippingInformation.setNeighborhood(data.get("neighborhood"));
        shippingInformation.setAddress(data.get("address"));
        shippingInformation.setAddressComplement(data.get("addressComplement"));
        return shippingInformation;
    }
}
