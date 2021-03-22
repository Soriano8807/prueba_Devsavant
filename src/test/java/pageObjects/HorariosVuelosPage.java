package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class HorariosVuelosPage extends BasePage {

    //Localizadores
    @FindBy(id = "origenIter")
    private WebElement txtOrigen;

    @FindBy(id = "destinoIter")
    private WebElement txtDestino;

    @FindBy(id = "fechaIdaIter")
    private WebElement txtFechaIda;

    By tblfechaIda = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/section[1]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/table[1]");

    @FindBy(id = "fechaRegresoIter")
    private WebElement txtFechaVuelta;

    By tblFechaVuelta = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/section[1]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/table[1]");

    @FindBy(id = "mainContent_Ir")
    private WebElement btnConsultar;

    //Constructor
    public HorariosVuelosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void ingresarOrigen(String origen) {
        writeText(txtOrigen, origen);
        waitInMs(1000);
        typeKeys(txtOrigen, "DOWN");
        typeKeys(txtOrigen, "ENTER");
    }

    public void ingresarDestino(String destino) {
        writeText(txtDestino, destino);
        waitInMs(1000);
        typeKeys(txtDestino, "DOWN");
        typeKeys(txtDestino, "ENTER");
        waitInMs(1000);
    }

    public void ingresarFechaIda(String dia) {
        click(txtFechaIda);
        clickDiaCalendario(tblfechaIda, dia);
    }

    public void ingresarFechaVuelta(String dia) {
        click(txtFechaVuelta);
        clickDiaCalendario(tblFechaVuelta,dia);
    }

    public void clickConsultar() {

        //Almacena el ID de la ventana original
        String originalWindow = driver.getWindowHandle();

        //Haz clic en el enlace el cual abre una nueva ventana
        click(btnConsultar);

        //Espera a la nueva ventana o pestaña
        wait.until(numberOfWindowsToBe(2));

        //Recorrelas hasta encontrar el controlador de la nueva ventana
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
