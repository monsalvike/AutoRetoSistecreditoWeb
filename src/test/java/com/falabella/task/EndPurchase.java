package com.falabella.task;

import com.falabella.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.falabella.userinterface.PurchasePage.*;

public class EndPurchase implements Task {

    private ShippingInformation shippingInformation;

    public EndPurchase(List<ShippingInformation> shippingInformation) {

        this.shippingInformation = shippingInformation.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(shippingInformation.getEmail()).into(TEXTFIEDLEMAIL), Click.on(BTNCONTINUEEMAIL),
                WaitUntil.the(STATELIST, WebElementStateMatchers.isClickable()).forNoMoreThan(4).seconds(),
                SelectFromOptions.byVisibleText(shippingInformation.getState()).from(STATELIST),
                WaitUntil.the(CITYLIST, WebElementStateMatchers.isClickable()).forNoMoreThan(4).seconds(),
                SelectFromOptions.byVisibleText(shippingInformation.getCity()).from(CITYLIST),
                WaitUntil.the(NEIGHBORHOODLIST, WebElementStateMatchers.isClickable()).forNoMoreThan(4).seconds(),
                SelectFromOptions.byVisibleText(shippingInformation.getNeighborhood()).from(NEIGHBORHOODLIST),
                Click.on(BTNCONTINUEPURCHASE),
                WaitUntil.the(TEXTFIELDADDRESS, WebElementStateMatchers.isClickable()).forNoMoreThan(4).seconds(),
                Enter.theValue(shippingInformation.getAddress()).into(TEXTFIELDADDRESS),
                Enter.theValue(shippingInformation.getAddressComplement()).into(TEXTFIELDCOMPLEMENTADDRESS),
                Click.on(BTNINPUTADDRESS), Click.on(BTNPAY));
    }


    public static EndPurchase with(List<ShippingInformation> shippingInformation) {
        return Tasks.instrumented(EndPurchase.class, shippingInformation);
    }
}
