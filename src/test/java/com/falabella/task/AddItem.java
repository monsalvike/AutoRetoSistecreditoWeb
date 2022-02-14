package com.falabella.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.userinterface.Home.*;

public class AddItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTNAGREGARALCARRITO),Click.on(BTNVERCARRITO),Click.on(BTNCOMPRAR));
    }

    public static AddItem addTheItem (){
        return Tasks.instrumented(AddItem.class);
    }
}
