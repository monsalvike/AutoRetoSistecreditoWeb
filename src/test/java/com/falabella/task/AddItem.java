package com.falabella.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.falabella.userinterface.Home.*;
import static com.falabella.userinterface.PurchasePage.BTNCLOSECMR;
import static com.falabella.userinterface.PurchasePage.BTNCLOSEEXPERIENCE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
public class AddItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(the(BTNCLOSECMR), isVisible()).andIfSo(Click.on(BTNCLOSECMR)),
                Check.whether(the(BTNCLOSEEXPERIENCE),isVisible()).andIfSo(Click.on(BTNCLOSEEXPERIENCE)),
                Click.on(BTNADDCART), Click.on(BTNSEECART), Click.on(BTNPURCHASE));
    }

    public static AddItem addTheItem() {
        return Tasks.instrumented(AddItem.class);
    }
}
