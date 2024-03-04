package io.swagger.peststore.interactions;

import io.restassured.http.ContentType;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static io.swagger.peststore.utils.Constantes.ENDPOINT;

public class GetPet implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(ENDPOINT + 1)
                .with(request -> request.contentType(ContentType.JSON)));
    }

    public static Performable on () {
        return Instrumented.instanceOf(GetPet.class).withProperties();
    }
}
