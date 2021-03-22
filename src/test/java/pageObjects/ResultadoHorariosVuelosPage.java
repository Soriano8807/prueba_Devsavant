package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class ResultadoHorariosVuelosPage extends BasePage {


    //Localizadores
    @FindBy(xpath = "//h1[contains(text(),'Consulta de itinerarios')]")
    private static WebElement lblTitulo;

    @FindBy(id = "mainContent_GrillaItinerariosIda_GridVuelos_LinkSortHoraSale_0")
    private WebElement btnOrdenarHora;


    //Constructor
    public ResultadoHorariosVuelosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOrganizarResultados() {
        click(btnOrdenarHora);
        //clickBotonGrilla(tblConsultaItinerario, "Hora de Salida", btnOrdenarHora);
        waitInMs(5000);
    }

    public static void validarResultado() {
        elementDisplayed(lblTitulo);
    }
}
