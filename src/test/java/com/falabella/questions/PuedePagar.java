package com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.falabella.userinterface.PaginaCompra.RESULT;
import static com.falabella.util.Constantes.RESULTADOESPERADO;

public class PuedePagar implements Question<Boolean> {
    private String esperado;
    public PuedePagar(String string) {
        this.esperado=string;

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return esperado.equals(Text.of(RESULT).viewedBy(actor).asString());
    }
public static PuedePagar puedePagar(String string){
        return new PuedePagar(string);
}

}

