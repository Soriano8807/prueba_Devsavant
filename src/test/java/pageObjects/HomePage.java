package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BasePage;

public class HomePage extends BasePage {

    //Localizadores
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]")
    private WebElement txtOrigen;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[3]/div[2]/label[1]/div[1]/input[1]")
    private WebElement txtDestino;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]")
    private WebElement txtFechaIda;

    By tblfechaIda = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/table[1]");

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[2]")
    private WebElement valueFechaIda;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[3]")
    private WebElement txtFechaVuelta;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/i[1]")
    private WebElement btnSiguienteCalendario;

    By tblFechaVuelta = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/table[1]");

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[4]")
    private WebElement valueFechaVuelta;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]")
    private WebElement txtPasajerosClase;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
    private WebElement lnkClaseEconomica;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/label[2]")
    private WebElement lnkClaseEjecutiva;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/i[1]")
    private WebElement btnMasAdultos;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/i[1]")
    private WebElement btnMasNiños;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/i[1]")
    private WebElement btnMasBebes;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement btnContinuar;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[4]/button[1]")
    private WebElement btnBuscar;

    @FindBy(xpath = "//i[contains(text(),'menu')]")
    private WebElement btnMenu;

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void irAPagina(String url) {
        driver.get(url);
    }

    public void ingresarOrigen(String origen) {

        typeKeys(txtOrigen, "DOWN");
        typeKeys(txtOrigen, "DOWN");
        click(txtOrigen);
        writeText(txtOrigen, origen);
        waitInMs(1000);
        typeKeys(txtOrigen, "DOWN");
        typeKeys(txtOrigen, "ENTER");
    }

    public void ingresarDestino(String destino) {

        click(txtDestino);
        waitInMs(1000);
        writeText(txtDestino, destino);
        waitInMs(1000);
        typeKeys(txtDestino, "DOWN");
        typeKeys(txtDestino, "ENTER");
    }

    public void ingresarFechaIda(String dia) {

        waitInMs(2000);
        click(txtFechaIda);
        click(btnSiguienteCalendario);
        waitInMs(1000);
        clickDiaCalendario(tblfechaIda,dia);
    }

    public void ingresarFechaVuelta(String dia) {

        click(btnSiguienteCalendario);
        waitInMs(1000);
        clickDiaCalendario(tblFechaVuelta, "12");
    }

    public void seleccionarClaseCantidadPasajeros(String clase) {

        click(txtPasajerosClase);

        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");
        typeKeys(lnkClaseEconomica, "DOWN");

        if (clase == "economica") {
            click(lnkClaseEconomica);
        } else if (clase == "ejecutiva") {
            click(lnkClaseEjecutiva);
        }
    }

    public void ingresarCantidadAdultos(String cantidadAdultos) {
        int cantidad = Integer.parseInt(cantidadAdultos);

        if (cantidad > 1) {
            for (int i = 1; i < cantidad; i++) {
                click(btnMasAdultos);
            }
        }
    }

    public void ingresarCantidadNiños(String cantidadNiños) {
        int cantidad = Integer.parseInt(cantidadNiños);

        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                click(btnMasNiños);
            }
        }
    }

    public void ingresarCantidadBebes(String cantidadBebes) {
        int cantidad = Integer.parseInt(cantidadBebes);

        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                click(btnMasBebes);
            }
        }
    }

    public void clickContinuar() {
        click(btnContinuar);
    }

    public void clickBuscarVuelos() {
        click(btnBuscar);
    }

    public void clickMenu() {
        click(btnMenu);
    }

}
