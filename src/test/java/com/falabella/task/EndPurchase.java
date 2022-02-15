package com.falabella.task;

import com.falabella.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.falabella.userinterface.PurchasePage.*;

public class EndPurchase implements Task {

    private ShippingInformation shippingInformation;

    public EndPurchase(List<ShippingInformation> shippingInformation){

        this.shippingInformation = shippingInformation.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Enter.theValue(shippingInformation.getEmail()).into(CAMPOEMAIL), Click.on(BTNCONTINUAREMAIL));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getState()).from(LISTDEPARTAMENTO));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getCity()).from(LISTCIUDAD));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getNeighborhood()).from(LISTBARRIO));

        actor.attemptsTo(Click.on(BTNCONTINUACOMPRA));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(shippingInformation.getAddress()).into(CAMPODIRECCION),Enter.theValue(shippingInformation.getAddressComplement()).into(CAMPOCOMPLEMENTO)
        ,Click.on(BTNINGRESADIR),Click.on(BTNIRAPAGAR));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static EndPurchase with(List<ShippingInformation> shippingInformation){
        return Tasks.instrumented(EndPurchase.class,shippingInformation);
    }
}
