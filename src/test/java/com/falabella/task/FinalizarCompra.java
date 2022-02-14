package com.falabella.task;

import com.falabella.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.falabella.userinterface.PurchasePage.*;

public class FinalizarCompra implements Task {

    private ShippingInformation shippingInformation;

    public FinalizarCompra(ShippingInformation shippingInformation){
        this.shippingInformation = shippingInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      /*  actor.attemptsTo(Enter.theValue(shippingInformation.getEmail()).into(CAMPOEMAIL), Click.on(BTNCONTINUAREMAIL));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getDepartamento()).from(LISTDEPARTAMENTO));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getCiudad()).from(LISTCIUDAD));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingInformation.getBarrio()).from(LISTBARRIO));

        actor.attemptsTo(Click.on(BTNCONTINUACOMPRA));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(shippingInformation.getDireccion()).into(CAMPODIRECCION),Enter.theValue(shippingInformation.getComplementodireccion()).into(CAMPOCOMPLEMENTO)
        ,Click.on(BTNINGRESADIR),Click.on(BTNIRAPAGAR));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

*/
    }


    public static FinalizarCompra finalizarCompra(ShippingInformation datosCompras){
        return Tasks.instrumented(FinalizarCompra.class,datosCompras);
    }
}
