package com.falabella.task;

import com.falabella.models.DatosCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static com.falabella.userinterface.PaginaPrincipal.*;
import static com.falabella.util.Constantes.IPHONE;

public class AdicionaItem implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(IPHONE).into(CAMPOBUSCAR),Click.on(BTNBUSCAR),Click.on(BTNIPHONE),Click.on(BTNAGREGARALCARRITO),Click.on(BTNVERCARRITO),Click.on(BTNCOMPRAR));
    }

    public static AdicionaItem compra (){
        return Tasks.instrumented(AdicionaItem.class);
    }
}
