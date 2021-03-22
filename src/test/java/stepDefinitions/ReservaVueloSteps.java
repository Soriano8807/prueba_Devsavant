package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.ReservarVueloTest;

public class ReservaVueloSteps {

    @Before
    public void inicializar(){
        ReservarVueloTest.inicializar();
    }

    @Given("Yo como cliente ingresó a la pagina de Avianca")
    public void yo_como_cliente_ingresó_a_la_pagina_de_avianca() throws Exception {
        ReservarVueloTest.ingresarPagina();
    }

    @When("Dilgenció el origen")
    public void dilgenció_el_origen() throws Exception {
        ReservarVueloTest.ingresarOrigen();
    }

    @And("Diligenció el destino")
    public void diligenció_el_destino() throws Exception {
        ReservarVueloTest.ingresarDestino();
    }

    @And("Seleccionó las fechas del vuelo")
    public void seleccionó_las_fechas_del_vuelo() throws Exception {
        ReservarVueloTest.ingresarFechas();
    }

    @And("Seleccionó la clase de vuelo")
    public void seleccionó_la_clase_de_vuelo() throws Exception {
        ReservarVueloTest.seleccionarClaseCantidadPasajeros();
    }

    @And("Seleccionó la cantidad de adultos")
    public void seleccionó_la_cantidad_de_adultos() throws Exception {
        ReservarVueloTest.ingresarCantidadAdultos();
    }

    @And("Seleccionó la cantidad de niños")
    public void seleccionó_la_cantidad_de_niños() throws Exception {
        ReservarVueloTest.ingresarCantidadNiños();
    }

    @And("Seleccionó la cantidad de bebes")
    public void seleccionó_la_cantidad_de_bebes() throws Exception {
        ReservarVueloTest.ingresarCantidadBebes();
    }

    @And("Pulsó el boton Continuar")
    public void pulsó_el_boton_continuar() {
        ReservarVueloTest.clickContinuar();
    }

    @And("Pulsó el boton Buscar")
    public void pulsó_el_boton_buscar() {
        ReservarVueloTest.clickBuscarVuelos();
    }

    @Then("Obtengo el listado de vuelos disponibles")
    public void obtengo_el_listado_de_vuelos_disponibles() {
        ReservarVueloTest.resultadoVuelo();
    }
}
