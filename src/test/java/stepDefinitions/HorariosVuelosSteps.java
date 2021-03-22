package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ResultadoHorariosVuelosPage;
import pageObjects.ResultadoVuelosPage;
import test.HorariosVuelosTest;

public class HorariosVuelosSteps {

    @Given("Como cliente ingresó a la pagina de Avianca")
    public void como_cliente_ingresó_a_la_pagina_de_avianca() throws Exception {
        HorariosVuelosTest.ingresarPagina();
    }

    @When("Pulsó el boton Menu")
    public void pulsó_el_boton_menu() {
        HorariosVuelosTest.clickMenu();
    }

    @And("Pulsó horarios de vuelo")
    public void pulsó_horarios_de_vuelo() {
        HorariosVuelosTest.clickHorariosVuelo();
    }

    @And("Diligenció desde donde viajar")
    public void diligenció_desde_donde_viajar() throws Exception {
        HorariosVuelosTest.ingresarOrigen();
    }

    @And("Diligenció hacia donde viajar")
    public void diligenció_hacia_donde_viajar() throws Exception {
        HorariosVuelosTest.ingresarDestino();
    }

    @And("Seleccionó la fecha de ida")
    public void seleccionó_la_fecha_de_ida() throws Exception {
        HorariosVuelosTest.ingresarFechaIda();
    }

    @And("Seleccionó la fecha de vuelta")
    public void seleccionó_la_fecha_de_vuelta() throws Exception {
        HorariosVuelosTest.ingresarFechaVuelta();
    }

    @And("Pulsó el boton consultar")
    public void pulsó_el_boton_consultar() {
        HorariosVuelosTest.clickConsultar();
    }

    @And("Organizó los resultados por fecha de salida")
    public void organizó_los_resultados_por_fecha_de_salida() {
        HorariosVuelosTest.clickOrganizarResultados();
    }

    @Then("Obtengo el listado de vuelos disponibles ordenados")
    public void obtengo_el_listado_de_vuelos_disponibles_ordenados() {
        ResultadoHorariosVuelosPage.validarResultado();
    }

    @After
    public void cerrar(){
        HorariosVuelosTest.cerrar();
    }
}
