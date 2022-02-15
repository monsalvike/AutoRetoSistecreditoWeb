package com.falabella.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.falabella.userinterface.Home.BTNSEARCH;
import static com.falabella.userinterface.Home.TEXTFIELDSEARCH;

public class SearchItem implements Task {
    private String productInfo;

    public SearchItem(String productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(productInfo).into(TEXTFIELDSEARCH), Click.on(BTNSEARCH));
    }

    public static SearchItem with(String productInfo) {
        return Tasks.instrumented(SearchItem.class, productInfo);
    }
}
