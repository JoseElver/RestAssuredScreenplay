package io.swagger.peststore.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCodigoEstado implements Question {

    private String codigo;

    public ValidarCodigoEstado(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return String.valueOf(SerenityRest.lastResponse().statusCode()).equals(codigo);
    }

    public static ValidarCodigoEstado on (String codigo){
        return new ValidarCodigoEstado(codigo);
    }


}
