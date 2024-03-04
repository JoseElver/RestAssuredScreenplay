package io.swagger.peststore.interactions;

import io.restassured.http.ContentType;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static io.swagger.peststore.utils.Constantes.BODY_PUT;
import static io.swagger.peststore.utils.Constantes.ENDPOINT;

public class PutPet implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Put.to(ENDPOINT)
                .with(request -> request.body(BODY_PUT).contentType(ContentType.JSON)));
        System.out.println(SerenityRest.lastResponse().asString());

    }

    public static Performable on () {
        return Instrumented.instanceOf(PutPet.class).withProperties();
    }
}
