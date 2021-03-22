package test;

import utils.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class HorariosVuelosTest extends BaseTest {

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

    public static void clickMenu() {
        homePage.clickMenu();
    }

    public static void clickHorariosVuelo() {
        menuPage.clickHorariosVuelo();
    }

    public static void ingresarOrigen() throws Exception {
        horariosVuelosPage.ingresarOrigen(getProperties().getProperty("origen"));
    }

    public static void ingresarDestino() throws Exception {
        horariosVuelosPage.ingresarDestino(getProperties().getProperty("destinoIter"));
    }

    public static void ingresarFechaIda() throws Exception {
        horariosVuelosPage.ingresarFechaIda(getProperties().getProperty("diaDesdeIter"));
    }

    public static void ingresarFechaVuelta() throws Exception {
        horariosVuelosPage.ingresarFechaVuelta(getProperties().getProperty("diaHaciaIter"));
    }

    public static void clickConsultar() {
        horariosVuelosPage.clickConsultar();
    }

    public static void clickOrganizarResultados() {
        resultadoHorariosVuelosPage.clickOrganizarResultados();
    }

    public static void validarResultado() {

    }

    public static void cerrar() {
        cerrarDriver();
    }
}
