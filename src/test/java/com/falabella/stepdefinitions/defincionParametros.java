package com.falabella.stepdefinitions;

import com.falabella.models.DatosCompra;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class defincionParametros {
    @ParameterType(".*")
    public Actor actor (String actorName){
    return OnStage.theActorCalled(actorName);
    }
    @DataTableType
    public DatosCompra datosCompraCarga (Map<String,String> data){
        DatosCompra datosCompra = new DatosCompra();
        datosCompra.setEmail(data.get("email"));
        datosCompra.setDepartamento(data.get("departamento"));
        datosCompra.setCiudad(data.get("ciudad"));
        datosCompra.setBarrio(data.get("barrio"));
        datosCompra.setDireccion(data.get("direccion"));
        datosCompra.setComplementodireccion(data.get("complementoDireccion"));
        return datosCompra;
    }
}
