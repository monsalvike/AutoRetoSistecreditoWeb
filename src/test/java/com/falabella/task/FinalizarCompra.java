package com.falabella.task;

import com.falabella.drivers.Driver;
import com.falabella.models.DatosCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static com.falabella.drivers.Driver.chrome;
import static com.falabella.userinterface.PaginaCompra.*;

public class FinalizarCompra implements Task {

    private DatosCompra datosCompra;

    public FinalizarCompra(DatosCompra datosCompra){
        this.datosCompra = datosCompra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosCompra.getEmail()).into(CAMPOEMAIL), Click.on(BTNCONTINUAREMAIL));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(datosCompra.getDepartamento()).from(LISTDEPARTAMENTO));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(datosCompra.getCiudad()).from(LISTCIUDAD));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosCompra.getBarrio()).from(LISTBARRIO));

        actor.attemptsTo(Click.on(BTNCONTINUACOMPRA));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(datosCompra.getDireccion()).into(CAMPODIRECCION),Enter.theValue(datosCompra.getComplementodireccion()).into(CAMPOCOMPLEMENTO)
        ,Click.on(BTNINGRESADIR),Click.on(BTNIRAPAGAR));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static FinalizarCompra finalizarCompra(DatosCompra datosCompras){
        return Tasks.instrumented(FinalizarCompra.class,datosCompras);
    }
}
