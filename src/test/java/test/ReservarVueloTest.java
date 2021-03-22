package test;

import utils.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReservarVueloTest extends BaseTest {

    public static Properties fileprops = new Properties();

    public static Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }

    public static void inicializar() {
        abrirDriver();
    }

    public static void ingresarPagina() throws Exception {
        homePage.irAPagina(getProperties().getProperty("url"));
    }

    public static void ingresarOrigen() throws Exception {
        homePage.ingresarOrigen(getProperties().getProperty("origen"));
    }

    public static void ingresarDestino() throws Exception {
        homePage.ingresarDestino(getProperties().getProperty("destino"));
    }

    public static void ingresarFechas() throws Exception {
        homePage.ingresarFechaIda(getProperties().getProperty("diaIda"));
        homePage.ingresarFechaVuelta(getProperties().getProperty("diaVuelta"));
    }

    public static void seleccionarClaseCantidadPasajeros() throws Exception {
        homePage.seleccionarClaseCantidadPasajeros(getProperties().getProperty("clase"));
    }

    public static void ingresarCantidadAdultos() throws Exception {
        homePage.ingresarCantidadAdultos(getProperties().getProperty("adultos"));
    }

    public static void ingresarCantidadNiños() throws Exception {
        homePage.ingresarCantidadNiños(getProperties().getProperty("niños"));
    }

    public static void ingresarCantidadBebes() throws Exception {
        homePage.ingresarCantidadBebes(getProperties().getProperty("bebes"));
    }

    public static void clickContinuar() {
        homePage.clickContinuar();
    }

    public static void clickBuscarVuelos() {
        homePage.clickBuscarVuelos();
    }

    public static void resultadoVuelo() {
        resultadoVuelosPage.listaDeVuelos();
    }

}
