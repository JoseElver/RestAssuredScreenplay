package io.swagger.peststore.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.swagger.peststore.interactions.DeletePet;
import io.swagger.peststore.interactions.GetPet;
import io.swagger.peststore.interactions.PostPet;
import io.swagger.peststore.interactions.PutPet;
import io.swagger.peststore.questions.ValidarCodigoEstado;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.io.IOException;

import static io.swagger.peststore.utils.Constantes.URL;

public class PetStoreRestStepDefinition {


    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^quiero enviar la siguiente informacion a la API$")
    public void quieroEnviarLaSiguienteInformacionALaAPI() {
        OnStage.theActorCalled("").whoCan(CallAnApi.at(URL));
    }

    @Cuando("^hago el CRUD del servicio$")
    public void hagoElCRUDDelServicio() {
        OnStage.theActorCalled("").attemptsTo(
                PostPet.on(),
                GetPet.on(),
                PutPet.on(),
                GetPet.on(),
                DeletePet.on()
        );
    }

    @Entonces("^valido que el codigo de estatus sea (\\d+)$")
    public void validoQueElCodigoDeEstatusSea(String status) {
        OnStage.theActorCalled("").should(GivenWhenThen.seeThat(ValidarCodigoEstado.on(status)));
    }
}
